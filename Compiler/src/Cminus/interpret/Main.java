package Cminus.interpret;

import java.io.FileReader;
import java.io.PushbackReader;

import Cminus.lexer.Lexer;
import Cminus.node.EOF;
import Cminus.node.TBlank;
import Cminus.node.TBlockComment;
import Cminus.node.TEndLine;
import Cminus.node.Token;

public class Main {
	public static void main(String[] args) throws Exception {
		if (args.length > 0) { 
			try {
				NewLexer lexer = new NewLexer (new PushbackReader(new FileReader(args[0]), 1024));
				Token token;
				do {
					token = lexer.next();
					if (!(token instanceof TBlank) && !(token instanceof TEndLine)) {
						System.out.print("<" + token.getClass().toString().replace("class Cminus.node.T", "") + ">");
						System.out.print("(" + token.getText() + ")");
					} else {
						System.out.print(token.getText());
					}
					/*if (token instanceof TBlockComment) {
						System.out.print(token.getText());
					}*/
				} while (!(token instanceof EOF));
			} catch (Exception e) { 
	            System.out.println (e);
	            e.printStackTrace();
			} 
		} else { 
			System.err.println("No input file given!"); 
			System.exit(1); 
		} 
	}
}
