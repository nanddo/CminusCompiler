package Cminus.interpret;

import java.io.IOException;
import java.io.PushbackReader;

import Cminus.lexer.*;
import Cminus.node.*;

public class NewLexer extends Lexer {

	private int count;
	private TOpenComment comment;
	private TInvCommas invCommas;
	private StringBuffer text;
	
	public NewLexer(IPushbackReader in) {
		super(in);
	}
	
	public NewLexer(final PushbackReader in) {
		super(in);
	}
	
	protected void filter() throws LexerException, IOException { 
		// if we are in the comment state
		if (state.equals(State.COMMENT)) {
			// if we are just entering this state
			if (comment == null) {
				// The token is supposed to be a comment.
				// We keep a reference to it and set the count to one
				comment = (TOpenComment) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				token = null; // continue to scan the input.
			} else { 
				// we were already in the comment state
				text.append(token.getText()); // accumulate the text.
				
				if (token instanceof TOpenComment) {
					count++;
				} else if (token instanceof TCloseComment) {
					count--;
				}
				
				if (count != 0) {
					token = null; // continue to scan the input.
				} else {
					token = new TBlockComment(text.toString(), comment.getLine(), comment.getPos());
					state = State.NORMAL; //go back to normal.
					comment = null; // We release this reference.
				}
			}
		} else if (state.equals(State.NORMAL) && (token instanceof TCloseComment)) {
			//throw new LexerException(null, "Closed a block comment before opened it: [" + token.getLine() + ", " + token.getPos() + "]");
		} else if (state.equals(State.STRING)) {
			if (invCommas == null) {
				invCommas = (TInvCommas) token;
				text = new StringBuffer();
				token = null;
			} else {
				if (!(token instanceof TInvCommas)) {
					text.append(token.getText());
					token = null;
				} else {
					token = new TStringValue(text.toString(), invCommas.getLine(), invCommas.getPos());
					state = State.NORMAL;
					invCommas = null;
				}
			}
		}
	}
}
