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
		Token nextToken = null;
		while( c!=EOF){
			if( c == ' ' || c=='\t' || c=='\r') {
				WS();
				continue;
			}			
			else if( c == '+'){
				nextToken = PLUS();				
			}
			else if( isDIGIT() ){
				nextToken = INTEGER();
			}
			else if( isLETTER() ){
				nextToken = ID();
			}
			else if( c == '-'){
				nextToken = MINUS();
			}
			else if( c == '*' ){
				nextToken = MULTI();
			}
			else if( c == '/'){
				nextToken = DIV();
			}
			else if( c == '('){
				nextToken = LBRACK();
			}
			else if( c == ')'){
				nextToken = RBRACK();
			}
			else if( c == '='){
				nextToken = EQUALS();
			}		
			else if( c == '\n'){
				nextToken = NL();
			}
			
			
			if( nextToken != null){
				return nextToken;
			}
			else{
				throw new Error("Invalid Character: "+c);
			}
		}
		return new Token(EOF_TYPE,"<EOF>");
	}

	private Token NL() {
		if( c == '\n' ){
			consume();
			return new Token(NL, "NL");
		}
		else{
			return null;
		}
	}

	private Token EQUALS() {
		if( c == '=' ){
			consume();
			return new Token(EQUALS, "=");
		}
		else{
			return null;
		}
	}

	private Token RBRACK() {
		if( c == ')' ){
			consume();
			return new Token(RBRACK, ")");
		}
		else{
			return null;
		}
	}

	private Token LBRACK() {
		if( c == '(' ){
			consume();
			return new Token(LBRACK, "(");
		}
		else{
			return null;
		}
	}

	private Token DIV() {
		if( c == '/' ){
			consume();
			return new Token(DIV, "/");
		}
		else{
			return null;
		}
	}

	private Token MULTI() {
		if( c == '*' ){
			consume();
			return new Token(MULTI, "*");
		}
		else{
			return null;
		}
	}

	private Token MINUS() {
		if( c == '-' ){
			consume();
			return new Token(MINUS, "-");
		}
		else{
			return null;
		}
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
		if( isLETTER() ){
			return new Token(ID, rekID("") );
		}
		else {
			return null;
		}		
		
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
		if( c == '+' ){
			consume();
			return new Token(PLUS, "+");
		}
		else{
			return null;
		}
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
		if( isDIGIT() ){
			return new Token(INTEGER, rekINTEGER(""));
		}
		else {
			return null;
		}		
		
	}
	

    /** WS : (' '|'\t'|'\r')* ; // ignore any whitespace */
    void WS() {
        while ( c==' ' || c=='\t' || c=='\r' ) consume();
    }
	

}