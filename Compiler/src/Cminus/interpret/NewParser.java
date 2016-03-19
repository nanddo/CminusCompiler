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
import Cminus.node.Token;
import Cminus.parser.Parser;
import Cminus.parser.ParserException;

public class NewParser extends Parser {
	
	private NewLexer lexer;

	public NewParser(NewLexer lexer) {
		super((Lexer)lexer);
		this.lexer = lexer;
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
				token.getPos() + 
				"].\n" +
				"Token found: " + 
				token.getText() +
				"\n" +
				"Expecting:" +
				oldMessage.substring(oldMessage.indexOf(":") + 1).replace(", ", " or ").replace("'", "");
			throw new ParserException(e.getToken(), message);
			
		}
	}
}
