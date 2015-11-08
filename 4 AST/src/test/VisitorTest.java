/**
 * 
 */
package test;

import org.junit.Test;
import ast.HeteroAST;
import lp.Lexer;
import lp.RecursiveDescentLexer;
import lp.RecursiveDescentParser;
import visitor.*;

/**
 * @author skrause
 *
 */
public class VisitorTest {

	/**
	 * Test method for {@link visitor.IndepInorderPrintVisitor#visit(ast.HeteroAST)}.
	 */
	@Test
	public void testByNode() {
		Lexer lexer = new RecursiveDescentLexer(" 3 + 4 + 5 * (5 / #4)\n");
		RecursiveDescentParser parser = new RecursiveDescentParser(lexer);
		HeteroAST ast = parser.statlist();
		
				
		IndepInorderPrintVisitor visitor = new IndepInorderPrintVisitor(true);
		IndepEvalVisitor evaluator = new IndepEvalVisitor(true);
		
		System.out.println(visitor.print(ast)+" = "+ evaluator.eval(ast));		//0,75
		
		//-------------------
		lexer = new RecursiveDescentLexer(" 3 + #4 + 5 \n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();
					
		System.out.println(visitor.print(ast)+" = "+ evaluator.eval(ast));		
	}

	
	@Test
	public void testByToken() {
		Lexer lexer = new RecursiveDescentLexer(" 3 + 4 + 5 * (5 / #4)\n");
		RecursiveDescentParser parser = new RecursiveDescentParser(lexer);
		HeteroAST ast = parser.statlist();
		
				
		IndepInorderPrintVisitor visitor = new IndepInorderPrintVisitor(false);
		IndepEvalVisitor evaluator = new IndepEvalVisitor(false);
		
		System.out.println(visitor.print(ast)+" = "+ evaluator.eval(ast));		//0,75
		
		//-------------------
		lexer = new RecursiveDescentLexer(" 3 + #4 + 5 \n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();
					
		System.out.println(visitor.print(ast)+" = "+ evaluator.eval(ast));		
	}
	
	@Test
	public void testTree(){	
		Lexer lexer = new RecursiveDescentLexer(" 3 * 4 + 5 \n");
		RecursiveDescentParser parser = new RecursiveDescentParser(lexer);
		HeteroAST ast = parser.statlist();
		
				
		IndepTreePrintVisitor visitor = new IndepTreePrintVisitor();
		System.out.println(visitor.print(ast));
		
		lexer = new RecursiveDescentLexer(" 3 *( 4 + 5) \n");
		parser = new RecursiveDescentParser(lexer);
		ast = parser.statlist();			
		
		System.out.println(visitor.print(ast));
	}
}
