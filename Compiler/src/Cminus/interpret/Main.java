package Cminus.interpret;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import Cminus.lexer.Lexer;
import Cminus.lexer.LexerException;
import Cminus.node.*;
import Cminus.parser.Parser;

public class Main {
	public static void main(String[] args) throws Exception {
		if (args.length > 0) { 
			try {
				NewLexer lexer = new NewLexer (new PushbackReader(new FileReader(args[0]), 1024));
				
				//printTokens(lexer);
				
				NewParser parser = new NewParser(lexer);
				
	            Start abstractSintaxTree = parser.parse();
	            
	            System.out.println("Input syntactically accepted!");
			} catch (Exception e) {
				// Print exceptions
	            System.out.println ("\n" + e);
	            //e.printStackTrace();
			} 
		} else { 
			System.err.println("No input file given!"); 
			System.exit(1); 
		} 
	}
	
	@SuppressWarnings("unused")
	private static void printTokens(NewLexer lexer) throws LexerException, IOException {
		Token token;
		do {
			/* Read the next token from input */  
			token = lexer.next();
			/* Print token if it is not a blank */ 
			if (!(token instanceof TSpace) && !(token instanceof TEndLine)) {
				System.out.print("<" + token.getClass().getSimpleName() + ">");
				/* Uncomment to print the lexema */
				if (token instanceof TStringValue) {
					System.out.print("(" + token.getText() + ")");
				}
			} else {
				System.out.print(token.getText());
			}
		} while (!(token instanceof EOF));
	}
}
