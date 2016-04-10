package Cminus.interpret;

import java.io.IOException;
import java.io.PushbackReader;
import java.util.ArrayList;

import Cminus.lexer.*;
import Cminus.node.*;

public class NewLexer extends Lexer {
	
	private final String ENDED_WITH_EXCEPTIONS = "ENDED_FILE_WITH_EXCEPTIONS";
	
	private int counter;
	private TOpenComment comment;
	private StringBuffer text;
	private ArrayList<LexerException> exceptions;
	
	public NewLexer(IPushbackReader in) {
		super(in);
		this.exceptions = new ArrayList<LexerException>();
	}
	
	public NewLexer(final PushbackReader in) {
		super(in);
		this.exceptions = new ArrayList<LexerException>();
	}
	
	protected void filter() throws LexerException, IOException { 
		if (state.equals(State.COMMENT)) {
			/* This is the first OpenComment token */
			if (this.comment == null) {
				/* Keep a reference to this token and set the count to one */
				this.comment = (TOpenComment) token;
				this.counter = 1;
				/* Variable text stores the content of the whole block comment */
				this.text = new StringBuffer(comment.getText());
				/* Keep scanning the input by setting token to null*/
				token = null;
			} else { 
				/* Already inside block comment */
				this.text.append(token.getText());
				/* Update counter value */
				if (token instanceof TOpenComment) {
					this.counter++;
				} else if (token instanceof TCloseComment) {
					this.counter--;
				} else if (token instanceof EOF) {
					/* If the input finished, throw a lexer exception */
					throw new LexerException(null, "[" + token.getLine() + ", " + token.getPos() + "]Finished programm without close a opened block comment.");
				}
				
				/* If there is an unclosed OpenComment keep scanning the input */
				if (this.counter > 0) {
					token = null;
				} else {
					/* Create a block comment with whole comment text */
					token = new TBlockComment(text.toString(), comment.getLine(), comment.getPos());
					/* Leave COMMENT state*/
					state = State.NORMAL;
					/* Free the saved reference to first OpenComment */
					this.comment = null;
				}
			}
		} else if (state.equals(State.NORMAL) && (token instanceof TCloseComment)) {
			/* Throw exception if find an unopened CloseComment */
			this.exceptions.add(
				new LexerException(
					null, 
					"[" + token.getLine() + ", " + token.getPos() + "] Closed a block comment before opened it: */"
				)
			);
		}
	}

	protected Token getToken() throws IOException, LexerException{
		try {
			/* Get the token using Lexer class' implementation */
			Token token = super.getToken();
			/* If scanning reached end of file and an exception was thrown */
			if ((token instanceof EOF) && (!this.exceptions.isEmpty())) {
				/* Get all exceptions text */
				String exceptionsText = getExceptionsText();
				/* Throw a new exception with all previous exceptions' texts */
				throw new LexerException(new InvalidToken(ENDED_WITH_EXCEPTIONS), exceptionsText);
			} else {
				return token;
			}
		} catch (LexerException e) {
			/* Accumulate all "normal" exceptions and return token to keep scanning the input */
			if (e.getToken().getText().compareTo(ENDED_WITH_EXCEPTIONS) != 0) {
				this.exceptions.add(e);
				return e.getToken();
			/* Exception with all others exception is (unfortunately) catch and (inevitablely) thrown here */
			} else {
				throw e;
			}
		}
	}
	
	private String getExceptionsText() {
		StringBuffer exceptionsText = new StringBuffer();
		/* Get text of all exceptions into exceptionsText */
		for (int i = 0; i < this.exceptions.size(); i++) {
			LexerException e = this.exceptions.get(i);
			String exceptionMessage;
			Token exceptionToken = e.getToken();
			/* Set the message of InvalidToken's exceptions */
			if (exceptionToken instanceof InvalidToken) {
				exceptionMessage = 
					"[" + exceptionToken.getLine() + 
					", " + exceptionToken.getPos() + 
					"] Found an invalid token: " + exceptionToken.getText() + "\n";
			} else {
				exceptionMessage = e.getMessage() + "\n";
			}
			exceptionsText.append(exceptionMessage);
		}
		return exceptionsText.toString();
	}
}
