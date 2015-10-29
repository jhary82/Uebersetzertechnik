/**
 * 
 */
package lp;

/**
 * @author skrause
 *
 */
public class RecursiveDescentLexer extends Lexer {

	public static int ID = 2;
	public static int INTEGER = 3;
	public static int PLUS = 4;
	public static int MINUS = 5;
	public static int MULTI = 6;
	public static int DIV = 7;
	public static int LBRACK = 8;
	public static int RBRACK = 9;
	public static int EQUALS = 10;
	public static int NL = 11;
	
	public static String[] tokenNames =  { "n/a", "<EOF>", "ID", "INTEGER", "PLUS", "MINUS", "MULTI", "DIV", "LBRACK", "RBRACK", "EQUALS", "NL" };	
	
	public RecursiveDescentLexer(String input) {
		super(input);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Token nextToken() {
		while( c!=EOF){
			switch( c ){
				case ' ':case '\t':case'\r':	WS();continue;
				case '+': return PLUS();
				case '-': return MINUS();
				case '*': return MULTI();
				case '/': return DIV();
				case '=': return EQUALS();
				case '(': return LBRACK();
				case ')': return RBRACK();
				case '\n': return NL();
				default:
					if( isDIGIT() ){
						return INTEGER();
					}
					if( isLETTER() ){
						return ID();
					}
					throw new Error("Invalid Character: "+c);
			}
		}
		return new Token(EOF_TYPE,"<EOF>");
	}

	private Token NL() {
		consume();
		return new Token(NL, "NL");		
	}

	private Token EQUALS() {		
		consume();
		return new Token(EQUALS, "=");
		
	}

	private Token RBRACK() {
		consume();
		return new Token(RBRACK, ")");
	}

	private Token LBRACK() {
		consume();
		return new Token(LBRACK, "(");		
	}

	private Token DIV() {
		consume();
		return new Token(DIV, "/");
	}

	private Token MULTI() {
		consume();
		return new Token(MULTI, "*");
	}

	private Token MINUS() {
		consume();
		return new Token(MINUS, "-");
	}

	private String rekID(String str){
		if( isLETTER() || isDIGIT() ){
			str = str + c;
			consume();
			return rekID(str);
		}
		else {
			return str;
		}
	}
	
	private Token ID() {
		return new Token(ID, rekID("") );	
	}

	@Override
	public String getTokenName(int tokenType) {
		return tokenNames[tokenType];
	}

	private boolean isLETTER() {
		return c>='a'&&c<='z' || c>='A'&&c<='Z'; 
	}
	
	private boolean isDIGIT(){
		return (c >= '0' && c<='9');
	}
	
	private Token PLUS(){
		consume();
		return new Token(PLUS, "+");
	}
	
	private String rekINTEGER( String str ){
		if( isDIGIT() ){
			str = str + c;
			consume();
			return rekINTEGER(str);
		}
		else{
			return str;
		}
	}
	
	private Token INTEGER(){
		return new Token(INTEGER, rekINTEGER("") );		
	}
	

    /** WS : (' '|'\t'|'\r')* ; // ignore any whitespace */
    void WS() {
        while ( c==' ' || c=='\t' || c=='\r' ) consume();
    }
	

}