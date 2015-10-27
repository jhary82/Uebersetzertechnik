/**
 * 
 */
package halstead;

import list.Multiset;

/**
 * @author Simon Krause
 *	Diese Klasse erstellt eine Halstead-Metrik zu einem eigegebenen
 * Satz mit operatoren und operanden
 */
public final class Halstead<E extends Comparable<E>> {

	private Multiset<E> operators;
	private Multiset<E> operands;
	
	/**
	 * Konstruktor
	 * @param operators
	 * @param operands
	 */
	public Halstead(Multiset<E> operators, Multiset<E> operands){
		this.operands = operands;
		this.operators = operators;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(getProgramLength()+ " : Programmlaenge\n");
		str.append(getCountOperators() + " : Anzahl aller Operatoren\n");
		str.append(getCountOperands() + " : Anzahl aler Operanden\n");
		str.append(getVocabulary() + " : Vokabulargroesse\n");
		str.append(getDifOperators() + " : Anzahl verschiedener Operatoren\n");
		str.append(getDifOperands()+ " : Anzahl verschiedener Operanden\n");
		str.append(getVolumen()+" : Volumen des Programms\n");
		str.append(getDifficulty() + " : Schwierigkeitsgrad ein Programm zu verstehen\n");
		str.append(getEffort()+" : Implementierungsaufwand\n");
		return str.toString();
	}
	
	/**
	 * Gibt den Implementierungsaufwand zur�ck
	 * E = V * D
	 * @return
	 */
	public double getEffort(){
		return getVolumen() * getDifficulty();
	}
	
	/**
	 * Gibt den Schwierigkeitsgrad zur�ck
	 * D = ( n1 / 2 ) * ( N2 / n2 )
	 * @return
	 */
	public double getDifficulty(){
		return (getDifOperators() / 2)  * (getCountOperands() / getDifOperands());
	}
	
	/**
	 * Berechnet den log zur Basis 2
	 * @param num
	 * @return
	 */
	private double log2(double num)
	{
		return (Math.log(num)/Math.log(2));
	} 
	
	/**
	 * Gibt das Volumen zur�ck
	 * V = N * log2(n)
	 * @return
	 */
	public double getVolumen(){		
		return getProgramLength() * log2(getVocabulary());
	}
	
	/**
	 * Gibt die unterschiedlichen Elemenete n1 von Operators zur�ck
	 * @return
	 */
	public int getDifOperators(){
		return operators.distinct();
	}
	
	/**
	 * Gibt die unterschiedlichen Elemente n2 von Operands zur�ck
	 * @return
	 */
	public int getDifOperands(){
		return operands.distinct();
	}
	
	/**
	 * Gibt die VokabularGr��e n zur�ck
	 * @return
	 */
	public int getVocabulary(){
		return getDifOperands() + getDifOperators();
	}
	
	/**
	 * Gibt die Programmlaenge N zurueck
	 * @return
	 */
	public int getProgramLength(){
		return getCountOperators() + getCountOperands();
	}
	
	/**
	 * Gibt die Anzahl aller Elemente N2 in Operands zur�ck
	 * @return
	 */
	public int getCountOperands(){
		return operands.size();
	}
	
	/**
	 * Gibt die Anzahl aller Elemente N1 in operators zur�ck
	 * @return
	 */
	public int getCountOperators(){
		return operators.size();
	}
}
