package Cminus.interpret;

import java.io.FileReader;
import java.io.PushbackReader;

import Cminus.lexer.Lexer;
import Cminus.node.*;

public class Main {
	public static void main(String[] args) throws Exception {
		if (args.length > 0) { 
			try {
				NewLexer lexer = new NewLexer (new PushbackReader(new FileReader(args[0]), 1024));
				Token token;
				do {
					token = lexer.next();
					if (!(token instanceof TBlank) && !(token instanceof TEndLine)) {
						String fisrtPattern = "class Cminus.node.";
						String secondPattern = fisrtPattern + "T";
						System.out.print("<" + token.getClass().toString().replace(secondPattern, "").replace(fisrtPattern, "") + ">");
						//System.out.print("(" + token.getText() + ")");
					} else {
						System.out.print(token.getText());
					}
				} while (!(token instanceof EOF));
			} catch (Exception e) { 
	            System.out.println ("\n" + e);
	            //e.printStackTrace();
			} 
		} else { 
			System.err.println("No input file given!"); 
			System.exit(1); 
		} 
	}
}
