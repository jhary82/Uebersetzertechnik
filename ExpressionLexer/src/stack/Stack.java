/**
 * 
 */
package stack;

/**
 * @author Simon Krause Dieses Interface repräsentiert einen Stack
 * für generische Klasse E
 */
public interface Stack<E> {
	/**
	 * Überprüft, ob der Stack leer ist
	 * 
	 * @return gibt true zurück, wenn leer und false, wenn nicht leer
	 */
	public boolean istLeer();

	/**
	 * Fügt ein Element dem Stack hinzu
	 * @param e das Element wird hinzugefügt
	 */
	public void push(E e);

	/**
	 * Löscht das oberste Element
	 */
	public void pop();

	/**
	 * Liesst das oberste Element aus
	 * @return gibt das oberste Element zurück
	 */
	public E top();

	/**
	 * Liesst das oberste Element aus und löscht es
	 * @return das oberste Element
	 */
	public E popTop();
	
	/**
	 * Löscht den Stack
	 */
	public void clear();
}
