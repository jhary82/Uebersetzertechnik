/**
 * 
 */
package stack;

/**
 * @author Simon Krause
 *Dies ist die Fehlerklasse zum Interface Stack
 */
public final class StackError extends Error{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6932988445211506283L;

	/**
	 * Konstruktor mit Übergabe der Fehlerbeschreibung
	 * @param str
	 */
	public StackError(String str){
		super(str);
	}
	
}
