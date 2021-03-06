/**
 * 
 */
package metrics;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;

import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
		
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		MetricsListener extractor = new MetricsListener();
		walker.walk(extractor, tree); 
       
	}

}
