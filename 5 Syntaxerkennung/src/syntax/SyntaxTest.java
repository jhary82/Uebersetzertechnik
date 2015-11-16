/**
 * 
 */
package syntax;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.*;

/**
 * @author skrause
 *
 */
public class SyntaxTest {
	
	public static void output(String expression){
		SyntaxLexer lexer = new SyntaxLexer(new ANTLRInputStream(expression) );
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		SyntaxParser parser = new SyntaxParser(tokens);
		
		ParseTree tree = parser.statlist(); // begin parsing at init rule
		System.out.println(tree.toStringTree(parser));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		output( "10 + 20\n");
		output( "10 +swewe 20\n");
		output( "a = (10 + 20)*5+b \n");
		output( "b > a\n");
		output("10^10\n");
		
	}

}
