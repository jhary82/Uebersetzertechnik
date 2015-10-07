/**
 * 
 */
package stack;

/**
 * @author Simon Krause
 *Diese Klasse repräsentiert eine Zelle(Element) einer verketteten List/Stack/Queue/etc
 */
public final class Zelle<E> {
	/**
	 * Inhalt der Zelle
	 */
	private E inhalt;
	
	/**
	 * Zeiger auf die nächste Zelle
	 */
	private Zelle<E> next;
	
	/**
	 * Konstruktor
	 * @param value Inhalt der Zelle
	 */
	public Zelle(E value){
		this.inhalt = value;
		next = null;
	}
	
	/**
	 * Gibt den Inhalt der Zelle zurück
	 * @return
	 */
	public E getValue(){
		return inhalt;
	}
	
	/**
	 * Gibt einen Zeiger auf die nächste Zelle zurück
	 * @return
	 */
	public Zelle<E> getNext(){
		return next;
	}
	
	/**
	 * Setzt den Zeiger next auf den Übergabeparameter
	 * @param next
	 */
	public void setNext(Zelle<E> next){
		this.next = next;
	}
	
	/**
	 * toString-methode
	 */
	public String toString(){
		return this.inhalt+"";
	}

}
