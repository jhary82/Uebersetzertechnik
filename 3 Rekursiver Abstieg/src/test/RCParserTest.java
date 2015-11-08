/**
 * 
 */
package test;

import lp.Lexer;
import lp.RecursiveDescentLexer;
import lp.RecursiveDescentParser;

import org.junit.Test;

/**
 * @author simon
 *
 */
public class RCParserTest {

	/**
	 * Test method for {@link lp.RecursiveDescentParser#RecursiveDescentParser(lp.Lexer)}.
	 */
	@Test
	public void testRecursiveDescentParser() {
		Lexer lexer = new RecursiveDescentLexer(" 5 + (10 - 23)\n");
		RecursiveDescentParser parser = new RecursiveDescentParser(lexer);
		parser.statlist();
		
		lexer = new RecursiveDescentLexer(" value = (10 - 23)\n");
		parser = new RecursiveDescentParser(lexer);
		parser.statlist();
		
		lexer = new RecursiveDescentLexer(" value = (a + 10 - 23)\n");
		parser = new RecursiveDescentParser(lexer);
		parser.statlist();
		
		lexer = new RecursiveDescentLexer("1 + 2 + 3\n");
		parser = new RecursiveDescentParser(lexer);
		parser.statlist();
	}

}
