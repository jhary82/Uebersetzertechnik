package test;
import static org.junit.Assert.*;

import org.junit.Test;

import ast.HeteroAST;
import lp.Lexer;
import lp.RecursiveDescentLexer;
import lp.RecursiveDescentParser;

/**
 * 
 */

/**
 * @author skrause
 *
 */
public class ASTTEST {

	/**
	 * Test method for {@link lp.RecursiveDescentParser#RecursiveDescentParser(lp.Lexer)}.
	 */
	@Test
	public void testRecursiveDescentParser() {
		Lexer lexer = new RecursiveDescentLexer(" 3 + 4 * 5\n");
		RecursiveDescentParser parser = new RecursiveDescentParser(lexer);
		HeteroAST ast = parser.statlist();
		System.out.println( ast.toStringTree() );
		
		lexer = new RecursiveDescentLexer(" ( 3 + 4 ) * 5\n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();
		System.out.println( ast.toStringTree() );
		
		lexer = new RecursiveDescentLexer(" 1 + 2  + (5 * 4) + 5\n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();
		System.out.println( ast.toStringTree() );
		
		lexer = new RecursiveDescentLexer(" 5 / a\n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();
		System.out.println( ast.toStringTree() );
		
		lexer = new RecursiveDescentLexer(" 1 + 2 + 3 \n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();
		System.out.println( ast.toStringTree() );
	}

}
