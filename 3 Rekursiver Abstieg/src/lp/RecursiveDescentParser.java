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
		do{		
			stat();
		}while( lookahead.type != EOF_TYPE);
	}
	
	/**
	 * stat -> (sum NL |NL | ID = sum NL)
	 */
	public void stat(){
		if( lookahead.type == NL){ 
			match( NL );
		}
		else if( lookahead.type == ID && nextToken.type == EQUALS){
			match( ID );
			match( EQUALS );
			sum();
			match(NL);
		}
		else{
			sum();
			match( NL );
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
			else {
				throw new Error("+ or - expected");
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
			else {
				throw new Error(" * or / expected");
			}
			term();
		}
	}
	
	/**
	 * term -> + term | - term | ( term ) | INTEGER | ID
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
		else if( lookahead.type == ID ){
			match( ID );
		}
		else {
			throw new Error("+,-,( ,INTEGER or ID expected");
		}
	}

}