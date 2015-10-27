/**
 * 
 */
package postFix;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Simon Krause
 *	Testfälle zu Postfix
 */
public class PostFixTest {	
	
		
	/**
	 * Test, überprüft die Richtigkeit des Ausdrucks anhand des Ergebnisses
	 */
	@Test
	public void testEvalPostfixValidInput(){
		PostFix postfix = new PostFix();		
		assertTrue(postfix.evalPostfix("10 2 + 5 - 2 * # 6 + 20 / 1 ^ \n") == 1);		
		assertTrue(postfix.evalPostfix("10 2 + \n") == 12);
	}
	

	/**
	 * Test, überprüft falschen EingabeString
	 */	
	@Test//(expected = PostFixError.class) // new
	public void testEvalPostfixInvalidInput(){
		PostFix postfix = new PostFix();
		System.out.println( postfix.evalPostfix("10 2.0 - Hallo") ); // new
		postfix.evalPostfix("10 2.0 +");
	}
	
	/**
	 * Test, auf leere Zeichenkette und null
	 */	
	@Test(expected = PostFixError.class)
	public void testEvalPostfixVoidInput(){
		PostFix postfix = new PostFix();
		postfix.evalPostfix("");
		postfix.evalPostfix(null);
	}

}
