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
			return super.parse();
		} catch (ParserException e) {
			Token token = e.getToken();
			String oldMessage = e.getMessage();
			String message = 
				"Parser error at [" + 
				token.getLine() +
				"," +
				token.getPos() + "].\n";
			if (e.getToken() instanceof EOF) {
				message += 
					"Missing main declaration like:\n" + 
					"TYPE main (void) { }";
			} else {
				message +=
					"Token found: " + 
					token.getText() +
					"\n" +
					"Expecting:" +
					oldMessage.substring(oldMessage.indexOf(":") + 1).replace(", ", " or ").replace("'", "");
			}
			throw new ParserException(e.getToken(), message);
			
		}
	}
}
