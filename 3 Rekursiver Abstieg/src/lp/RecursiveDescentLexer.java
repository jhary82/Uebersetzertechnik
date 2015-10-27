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
	
	public static String[] tokenNames =  { "n/a", "<EOF>", "ID", "INTEGER", "PLUS", "MINUS", "MULTI", "DIV", "LBRACK", "RBRACK", "EQUALS" };	
	
	public RecursiveDescentLexer(String input) {
		super(input);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Token nextToken() {
		Token nextToken = null;
		while( c!=EOF){
			if( c == '+'){
				nextToken = PLUS();				
			}
			else if( isDIGIT() ){
				nextToken = INTEGER("");
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
	
	private Token INTEGER(String str){
		if( isDIGIT() ){
			str = str + c;
			consume();
			return INTEGER(str);
		}
		else if(str.isEmpty() ){
			return null;
		}
		else{
			return new Token(INTEGER, str);
		}
	}
	
	public static void main(String[] args) {
		Lexer lexer = new RecursiveDescentLexer("+124590+578+");
		Token t = lexer.nextToken();
        while ( t.type != Lexer.EOF_TYPE ) {
            System.out.println(t);
            t = lexer.nextToken();
        }
	}

}