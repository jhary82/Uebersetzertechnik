/**
 * 
 */
package halstead;


import list.*;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import Tree.TreeMultiset;
import antlr4.HalsteadLexer;

/**
 * @author Simon Krause
 * Diese Klasse wendet die HalsteadMetrik auf 
 * eine Eingabe von c Quellcode an
 */
public final class Halstead_C {

	/**
	 * Diese Methode erzeugt für eine Datei einen HalsteadLexar
	 * und wertet dann per Halstead- Metrik aus
	 * @param input
	 */
	public static String getAuswertung(CharStream input){
		HalsteadLexer lex = new HalsteadLexer( input ); 
		Token t =  lex.nextToken();
		Multiset<String> operators = new TreeMultiset<>();//oder LinkedListMultiset
		Multiset<String> operands = new TreeMultiset<>();
		
		while ( t==null || t.getType()!= HalsteadLexer.EOF ) {//Token.EOF works as well				
				if( t.getType() == HalsteadLexer.OPERAND){
					operands.add(t.getText());
				}
				if( t.getType() == HalsteadLexer.OPERATOR){
					operators.add(t.getText());
				}
				t = lex.nextToken(); 
		}
		
		return( new Halstead<String>(operators, operands).toString() );
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		try {		
			for(int i = 0; i < args.length; i++){
				System.out.println( getAuswertung( new ANTLRFileStream(args[i]) ));
			}
		}catch(Exception e){e.printStackTrace();}

		

	}

}
