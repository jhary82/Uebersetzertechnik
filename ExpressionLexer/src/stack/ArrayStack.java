/**
 * 
 */
package stack;

/**
 * @author Simon Krause
 * Ein Stack basierend auf einem Array
 *
 */
public final class ArrayStack<E> implements Stack<E> {

	/**
	 * Das zugrundeliegende Array
	 */
	private E[] array;
	
	/**
	 * Der Zeiger auf das oberste Element
	 */
	private int top;
	
	/**
	 * Konstruktor
	 * @param kapazitaet Die Größe des Stacks
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack(int kapazitaet){
		array = (E[]) new Object[kapazitaet];
		top = -1;
	}
	
	/**
	 * Default-Konstruktor
	 */
	public ArrayStack(){
		this(20);
	}
	
	/**
	 * Copy-Konstruktor
	 * @param obj der zu kopierende Stack
	 */
	public ArrayStack(ArrayStack<E> obj){
		this.array = obj.array.clone();
		this.top = obj.top;
	}
	
	/**
	 * @return gibt true, wenn der Stack leer ist und false, wenn nicht
	 */
	public boolean istLeer() {		
		return top == -1;
	}
	
	/**
	 * 
	 * @return gibt true, wenn der Stack voll ist, und false, wenn nicht
	 */
	public boolean istVoll(){
		return top+1 == array.length;		
	}

	/**
	 * Diese Methode fügt ein Element dem Stack hinzu
	 * @param e wird hinzugefügt
	 */
	@SuppressWarnings("unchecked")
	public void push(E e) {
		if(this.istVoll()){
			E[] newArray = (E[]) new Object[array.length*2];
			for(int i = 0; i <= this.top; i++){
				newArray[i] = this.array[i];
			}
			newArray[++top] = e;
			array = newArray;
		}	
		else{
			array[++top] = e;
		}
	}

	/**
	 * Löscht das oberste Element
	 */
	public void pop() throws StackError{
		if(this.istLeer()){
			throw new StackError("Kein pop möglich, da der Stack leer ist.");
		}
		array[top--] = null;		
	}

	/**
	 * Gibt das oberste Element zurück
	 * @return das oberste Element
	 */
	public E top() throws StackError{
		if(this.istLeer()){
			throw new StackError("Keine Elemente im Stack.");
		}
		return array[top];
	}

	/**
	 * Gibt das oberste Element zurück und löscht es aus dem Array
	 * @return das oberste Element
	 */
	public E popTop()throws StackError {
		E value = this.top();
		this.pop();
		return value;
	}

	@Override
	public void clear() {
		top = -1;		
	}
	
}
