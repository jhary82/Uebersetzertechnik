/**
 * 
 */
package stack;

/**
 * @author Simon Krause Diese Klasse repräsentiert einen Stack, der mit einer
 *         verketteten Liste implementier wurde
 * 
 */
public final class ListStack<E> implements Stack<E> {

	/**
	 * Zeiger auf das oberste Zellen-Objekt
	 */
	private Zelle<E> top;

	/**
	 * Konstruktor
	 */
	public ListStack() {
		top = null;
	}
	
	/**
	 * Diese Methode gibt false, wenn Stack nicht leer ist und true, wenn er leer ist
	 */
	@Override
	public boolean istLeer() {
		return top == null;
	}

	/**
	 * Diese Methode fügt das Element e dem Stack hinzu
	 */
	@Override
	public void push(E e) {
		Zelle<E> obj = new Zelle<E>(e);
		obj.setNext(top);
		top = obj;
	}

	/**
	 * Diese Methode löscht das oberste Stackelement
	 */
	@Override
	public void pop() throws StackError {
		if(this.istLeer()){
			throw new StackError("Löschen nicht möglich, da der Stack leer ist.");
		}
		top = top.getNext();
		
	}

	/**
	 * Diese Methode gibt den Wert des obersten Elements zurück
	 */
	@Override
	public E top() throws StackError{
		if(this.istLeer()){
			throw new StackError("Stack ist leer.");
		}
		return top.getValue();
	}

	/**
	 * Diese Methode gibt den Wert des obersten Elements zurück und löscht es
	 */
	@Override
	public E popTop()throws StackError {
		E value = this.top();
		this.pop();
		return value;
	}
	
	/**
	 * Clone-Methode nur für nicht leere Stacks
	 */
	public ListStack<E> clone(){
		ListStack<E> newStack = new ListStack<>();				
		ListStack<E> tmpStack = new ListStack<>();
		Zelle<E> obj = this.top;
		
		if(obj == null){
			return newStack;
		}
		
		do{
			tmpStack.push( obj.getValue() );
			obj = obj.getNext();
		}while( obj != null );
		while( ! tmpStack.istLeer() ){
			newStack.push( tmpStack.popTop() );
		}
		
		return newStack;
	}

	@Override
	public void clear() {
		top = null;		
	}

}
