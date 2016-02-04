package Cminus.interpret;

import java.io.FileReader;
import java.io.PushbackReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import Cminus.lexer.Lexer;
import Cminus.node.Token;

public class Main {
	public static void main(String[] args) throws Exception {
		//String content = new String(Files.readAllBytes(Paths.get(args[0])));
		//System.out.println (content);
		if (args.length > 0) { 
			try {
				Lexer lexer = new Lexer (new PushbackReader(new FileReader(args[0]), 1024));
				Token token;
				do {
					token = lexer.next();
					System.out.print(token.toString());
				} while (!(token instanceof Cminus.node.EOF));
			} catch (Exception e) { 
	            System.out.println (e) ; 
			} 
		} else { 
			System.err.println("No input file given!"); 
			System.exit(1); 
		} 
	}
}
