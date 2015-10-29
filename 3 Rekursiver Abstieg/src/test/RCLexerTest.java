/**
 * 
 */
package test;

import org.junit.Test;

import lp.Lexer;
import lp.RecursiveDescentLexer;
import lp.Token;

/**
 * @author skrause
 *
 */
public class RCLexerTest {

	/**
	 * Test method for {@link lp.RecursiveDescentLexer#RecursiveDescentLexer(java.lang.String)}.
	 */
	@Test
	public void testRecursiveDescentLexer() {
		//Lexer lexer = new RecursiveDescentLexer("ab = 10 - 23\n + i3");
		Lexer lexer = new RecursiveDescentLexer("10 - 23");
		Token t = lexer.nextToken();
        while ( t.type != Lexer.EOF_TYPE ) {
            System.out.println(t);
            t = lexer.nextToken();
        }
	}

}
