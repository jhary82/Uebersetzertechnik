/**
 * 
 */
package stack;

/**
 * @author Simon Krause
 * abstrakte Fehlerklasse für Informatik 2
 */
public abstract class Error extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3258512523884308034L;
	
	/**
	 * Fehlertext
	 */
	private String message;
	
	/**
	 * Konstruktor
	 * @param str ÜbergabeString für die Fehlerausgabe
	 */
	public Error(String str){
		this.message = str;
	}
	
	/**
	 * toString-Methode
	 */
	public String toString(){
		return message;
	}
}
