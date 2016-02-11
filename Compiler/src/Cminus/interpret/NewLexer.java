package Cminus.interpret;

import java.io.IOException;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Cminus.lexer.*;
import Cminus.node.*;

public class NewLexer extends Lexer {

	private int counter;
	private TOpenComment comment;
	private TInvCommas inverseCommas;
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
		// if we are in the comment state
		if (state.equals(State.COMMENT)) {
			// if we are just entering this state
			if (this.comment == null) {
				// The token is supposed to be a comment.
				// We keep a reference to it and set the count to one
				this.comment = (TOpenComment) token;
				this.text = new StringBuffer(comment.getText());
				this.counter = 1;
				token = null; // continue to scan the input.
			} else { 
				// we were already in the comment state
				this.text.append(token.getText());
				
				if (token instanceof TOpenComment) {
					this.counter++;
				} else if (token instanceof TCloseComment) {
					this.counter--;
				}
				
				if (this.counter != 0) {
					token = null; // continue to scan the input.
				} else {
					token = new TBlockComment(text.toString(), comment.getLine(), comment.getPos());
					state = State.NORMAL; //go back to normal.
					this.comment = null; // We release this reference.
				}
			}
		} else if (state.equals(State.NORMAL) && (token instanceof TCloseComment)) {
			this.exceptions.add(
				new LexerException(
					null, 
					"[" + token.getLine() + ", " + token.getPos() + "] Closed a block comment before opened it: */"
				)
			);
		} else if (state.equals(State.STRING)) {
			if (this.inverseCommas == null) {
				this.inverseCommas = (TInvCommas) token;
				this.text = new StringBuffer();
				token = null;
			} else {
				if (!(token instanceof TInvCommas)) {
					this.text.append(token.getText());
					token = null;
				} else {
					token = new TStringValue(text.toString(), inverseCommas.getLine(), inverseCommas.getPos());
					state = State.NORMAL;
					this.inverseCommas = null;
				}
			}
		}
	}

	protected Token getToken() throws IOException, LexerException{
		try {
			Token token = super.getToken();
			if ((token instanceof EOF) && (!this.exceptions.isEmpty())) {
				String exceptionsText = getExceptionsText();
				throw new LexerException(new InvalidToken("EOF"), exceptionsText);
			} else {
				return token;
			}
		} catch (LexerException e) {
			if (e.getToken().getText().compareTo("EOF") != 0) {
				this.exceptions.add(e);
				return e.getToken();
			} else {
				throw e;
			}
		}
	}
	
	private String getExceptionsText() {
		StringBuffer exceptionsText = new StringBuffer();
		for (int i = 0; i < this.exceptions.size(); i++) {
			LexerException e = this.exceptions.get(i);
			exceptionsText.append(e.getMessage() + "\n");
		}
		return exceptionsText.toString();
	}
}
