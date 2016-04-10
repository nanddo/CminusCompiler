package Cminus.interpret;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Cminus.lexer.Lexer;
import Cminus.lexer.LexerException;
import Cminus.node.EOF;
import Cminus.node.Node;
import Cminus.node.PProgram;
import Cminus.node.Start;
import Cminus.node.TBlockComment;
import Cminus.node.TCloseComment;
import Cminus.node.TEndLine;
import Cminus.node.TId;
import Cminus.node.TLeftBrace;
import Cminus.node.TLeftPar;
import Cminus.node.TLineComment;
import Cminus.node.TOpenComment;
import Cminus.node.TRightBrace;
import Cminus.node.TRightPar;
import Cminus.node.TSpace;
import Cminus.node.TVoid;
import Cminus.node.Token;
import Cminus.parser.Parser;
import Cminus.parser.ParserException;

public class NewParser extends Parser {
	
	private NewLexer lexer;
	private int stateMain;
	private int count;

	public NewParser(NewLexer lexer) {
		super((Lexer)lexer);
		this.lexer = lexer;
		this.stateMain = 0;
		this.count = 0;
	}
	
	@Override
	public Start parse() throws ParserException, LexerException, IOException {
		try {
			checkMainFunction();
			return super.parse();
		} catch (ParserException e) {
			Token token = e.getToken();
			String oldMessage = e.getMessage();
			String message = 
				"Parser error at [" + 
				token.getLine() +
				"," +
				token.getPos() + "].\n" +
				"Token found: " + 
				token.getText() +
				"\n" +
				"Expecting:" +
				oldMessage.substring(oldMessage.indexOf(":") + 1).replace(", ", " or ").replace("'", "");
			throw new ParserException(e.getToken(), message);
			
		}
	}
	
	private void checkMainFunction() throws LexerException, IOException, ParserException {
		Token token = lexer.peek();
		
		if (this.stateMain == 0 && token instanceof TVoid) {
			this.stateMain = 1;
		}
		
		if (this.stateMain == 1) {
			if (token instanceof TId && token.getText() == "main") {
				this.stateMain = 2; 
			} else if (!isIgnoredToken(token)) {
				this.stateMain = 0;
			}
		}
		
		if (this.stateMain == 2) {
			if (token instanceof TLeftPar) {
				this.stateMain = 3;
			} else if (!isIgnoredToken(token)) {
				this.stateMain = 0;
			}
		}
		
		if (this.stateMain == 3) { 
			if (token instanceof TVoid) {
				this.stateMain = 4;
			} else if (!isIgnoredToken(token)) {
				this.stateMain = 0;
			}
		} 
		
		if (this.stateMain == 4) {
			if (token instanceof TRightPar) {
				this.stateMain = 5;
			} else if (!isIgnoredToken(token)) {
				this.stateMain = 0;
			}
		}
		
		if (this.stateMain == 5) {
			if (token instanceof TLeftBrace) {
				this.stateMain = 6;
				this.count = 1;
			} else if (!isIgnoredToken(token)) {
				this.stateMain = 0;
			}
		}
		
		if (this.stateMain == 6) {
			if (this.count == 0) {
				if (!isIgnoredToken(token) && !(token instanceof EOF)) {
					throw new ParserException(token, "There should not be any declaration after main function.");
				}
			} else if (token instanceof TLeftBrace) {
				this.count++;
			} else if (token instanceof TRightBrace) {
				this.count--;
			}
		} 

		if (token instanceof EOF) {
			if ((this.count != 0) || (this.stateMain != 6)) {
				throw new ParserException(token, "No main function call as \"void main(void){ ... }\" founded.");
			}
		}
	}
	
	private boolean isIgnoredToken(Token token) {
		if (!(token instanceof TSpace) && 
				!(token instanceof TEndLine) &&
				!(token instanceof TLineComment) &&
				!(token instanceof TOpenComment) &&
				!(token instanceof TCloseComment) &&
				!(token instanceof TBlockComment)) {
			return false;
		}
		return true;
	}
}
