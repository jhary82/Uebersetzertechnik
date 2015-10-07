/**
 * 
 */
package postFix;

import org.antlr.v4.parse.ANTLRLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import stack.ListStack;
import antlr4.ExprLexer;


/**
 * @author Simon Krause Diese Klasse wertet mathematische Postfix-Strings aus
 */
public final class PostFix {

	/**
	 * Ablage der Werte
	 */
	private ListStack<Double> stack;

	/**
	 * Konstruktor
	 */
	public PostFix() {
		stack = new ListStack<Double>();
	}
	
	/**
	 * Diese Methode wertet einen Postfix-Ausdruck aus
	 * 
	 * @param expression
	 *            Übergabe des auszuwertenden Ausdrucks
	 * @return das Ergebnis der Berechnung
	 */
	public double evalPostfix(String expression) throws PostFixError {		
		try{			
			//ExprLexer lexer = new ExprLexer(expression);
			ExprLexer lexer = new ExprLexer( new ANTLRInputStream(expression)  ); // new
			Token token = null;		
		
			//while((token = lexer.nextToken()).getType() != Lexer.EOF_TYPE) {
			while( (token = lexer.nextToken()).getType() != Token.EOF ) { // new
				switch(token.getType()){
				/*
				 * ein Binäres Lexem
				 * */
				case(ExprLexer.BINOP):
					double value1 = stack.popTop();
					double value2 = stack.popTop();
					switch( (char)(token.getText().charAt(0)) ){
					case('+'):
						stack.push( value1 + value2);						
						break;
					case('-'):
						stack.push( value1 - value2);
						break;				
					case('*'):
						stack.push( value1 * value2);
						break;				
					case('/'):
						stack.push( value2 / value1);
						break;				
					case('^'):						
						stack.push( Math.pow(value1, value2));
						break;				
					}
					break;
				/*
				 * Ein unäres Lexem
				 * */
				case(ExprLexer.UNAOP):
					stack.push( - stack.popTop() );
					break;
				/* 
				 * Ein Operand
				 * */
				case(ExprLexer.OPERAND):
					stack.push( Double.valueOf( token.getText() ) );
					break;
				}
			}
		}catch(Error e){
			throw new PostFixError("Fehler: Der eingegebene Ausdruck enthält fehlerhafte Elemente");
		}catch(Exception e){
			throw new PostFixError("Fehler bei der Auswertung des Ausdrucks.");
		}
		
		if(stack.istLeer()){
			throw new PostFixError("Fehler bei der Berechnung");
		}
		
		return stack.popTop();
	}

}
