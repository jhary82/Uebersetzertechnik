/**
 * 
 */
package lp;

import static lp.RecursiveDescentLexer.*;

/**
 * @author skrause
 *
 */
public class RecursiveDescentParser extends Parser {

	/**
	 * @param input
	 */
	public RecursiveDescentParser(Lexer input) {
		super(input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * statlist -> stat+
	 */
	public void statlist() {
		stat();
		while( lookahead.type != EOF){
			stat();
		}
	}
	
	/**
	 * stat -> (sum NL |NL)
	 */
	public void stat(){
		if( lookahead.type == NL){
			match( NL );
		}
		else {
			sum();
		}
	}
	
	/**
	 * sum -> prod [(+|-)prod]*
	 */
	public void sum(){
		prod();
		while( lookahead.type == PLUS || lookahead.type == MINUS ){
			if( lookahead.type == PLUS ){
				match( PLUS );
			}
			else if( lookahead.type == MINUS ){
				match( MINUS );
			}
			prod();
		}
	}
	
	/**
	 * prod -> term [(+|-)term]*
	 */
	public void prod(){
		term();
		while( lookahead.type == MULTI || lookahead.type == DIV ){
			if( lookahead.type == MULTI ){
				match( MULTI );
			}
			else if( lookahead.type == DIV ){
				match( DIV );
			}
			term();
		}
	}
	
	/**
	 * term -> + term | - term | ( term ) | INTEGER
	 */
	public void term(){
		if( lookahead.type == PLUS){
			match( PLUS ); term();
		}
		else if( lookahead.type == MINUS ){
			 match( MINUS ); term();
		}
		else if( lookahead.type == LBRACK ){
			match( LBRACK ); sum(); match( RBRACK );
		}
		else if( lookahead.type == INTEGER){
			match( INTEGER );
		}
		else {
			throw new Error("+,-,( or INTEGER expected");
		}
	}

}