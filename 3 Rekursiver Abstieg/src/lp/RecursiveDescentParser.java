/**
 * 
 */
package lp;

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
	
	public void statlist() {
		stat();
	}
	
	public void stat(){
		if( lookahead.type == RecursiveDescentLexer.NL){
			match( RecursiveDescentLexer.NL );
		}
		else {
			sum();
		}
	}
	
	public void sum(){
		prod();
		while( lookahead.type == RecursiveDescentLexer.PLUS || lookahead.type == RecursiveDescentLexer.MINUS ){
			if( lookahead.type == RecursiveDescentLexer.PLUS ){
				match( RecursiveDescentLexer.PLUS );
			}
			else if( lookahead.type == RecursiveDescentLexer.MINUS ){
				match( RecursiveDescentLexer.MINUS );
			}
			prod();
		}
	}
	
	public void prod(){
		term();
		while( lookahead.type == RecursiveDescentLexer.MULTI || lookahead.type == RecursiveDescentLexer.DIV ){
			if( lookahead.type == RecursiveDescentLexer.MULTI ){
				match( RecursiveDescentLexer.MULTI );
			}
			else if( lookahead.type == RecursiveDescentLexer.DIV ){
				match( RecursiveDescentLexer.DIV );
			}
			term();
		}
	}
	
	public void term(){
		
	}

}
//
//public ListParser(Lexer input) { super(input); }
//
///** list : '[' elements ']' ; // match bracketed list */
//public void list() {
//    match(ListLexer.LBRACK); elements(); match(ListLexer.RBRACK);
//}
///** elements : element (',' element)* ; */
//void elements() {
//    element();
//    while ( lookahead.type==ListLexer.COMMA ) {
//        match(ListLexer.COMMA); element();
//    }
//}
///** element : name | list ; // element is name or nested list */
//void element() {
//    if ( lookahead.type==ListLexer.NAME ) match(ListLexer.NAME);
//    else if ( lookahead.type==ListLexer.LBRACK ) list();
//    else throw new Error("expecting name or list; found "+lookahead);
//}