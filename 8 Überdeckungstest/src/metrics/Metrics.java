/**
 * 
 */
package metrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import cymbol.*;

/**
 * @author simon
 *
 */
public class Metrics {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
        InputStream is = new FileInputStream("t1.cym");
        ANTLRInputStream input = new ANTLRInputStream(is);        
		CymbolLexer lexer = new CymbolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CymbolParser parser = new CymbolParser(tokens);
		ParseTree tree = parser.file();
		CymbolListener listener = ;
		
		System.out.println("McCabe-Value = "+mcCabe(is));
       
       
	}

}
