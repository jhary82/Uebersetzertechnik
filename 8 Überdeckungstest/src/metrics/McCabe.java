/**
 * 
 */
package metrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import cymbol.CymbolLexer;

/**
 * @author simon
 *
 */
public class McCabe {

	/**
	 * Berechnet den McCabe-Überdeckungsgrad
	 * @param is einen File-Inputstream
	 * @return den McCabe-Überdeckungsgrad
	 * @throws IOException 
	 */
	public static int mcCabe(InputStream is) throws IOException{
		ANTLRInputStream input = new ANTLRInputStream(is);        
		CymbolLexer lexer = new CymbolLexer(input);
		int counter = 1;
		for(Token token : lexer.getAllTokens()){
			if( token.getText().equals("if")){
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
        InputStream is = new FileInputStream("t1.cym");
		
		System.out.println("McCabe-Value = "+mcCabe(is));
       
       
	}

}
