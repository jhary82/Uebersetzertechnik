/**
 * 
 */
package test;

import static org.junit.Assert.*;
import lp.Lexer;
import lp.Parser;
import lp.RecursiveDescentLexer;
import lp.RecursiveDescentParser;
import lp.Token;

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
		Lexer lexer = new RecursiveDescentLexer(" 5 + (10 - 23) ");
		RecursiveDescentParser parser = new RecursiveDescentParser(lexer);
		parser.statlist();
	}

}
