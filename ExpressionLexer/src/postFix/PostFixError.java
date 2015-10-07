/**
 * 
 */
package postFix;

/**
 * @author Simon Krause
 * Fehlerklasse zur Klasse PostFix
 */
public final class PostFixError extends Error{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8109324218142196547L;	
	
	
	/**
	 * Konstruktor
	 * @param s
	 */
	public PostFixError(String s){
		super(s);
	}
}
