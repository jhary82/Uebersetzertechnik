/**
 * 
 */
package visitor;


import java.util.LinkedList;
import java.util.Queue;

import ast.*;

/**
 * Independent PrintVisitor
 * der einen textbasierten Baum zeichnet
 * @author skrause
 *
 */
public class IndepTreePrintVisitor implements IPrintVisitor{
		

	/**
	 * Konstruktor
	 */
	public IndepTreePrintVisitor() {	
    }

	
	public String print(HeteroAST node) {
		StringBuilder str = new StringBuilder();
		Queue<QueueElement> queue = new LinkedList<>();
		Queue<QueueElement> workingQueue = new LinkedList<>();
		int depth = 0;
		QueueElement elem;
		
		workingQueue.add( new QueueElement( (ExprNode)node, 0));
		workingQueue.add( new QueueElement() );
		
		queue.add( new QueueElement( (ExprNode)node, 0));		
		queue.add( new QueueElement() );		
		
		/*
		 * traversiere Baum
		 */
		while( !workingQueue.isEmpty() ){			
			elem = workingQueue.poll();
			
			/*
			 * Abbruchbedingung 
			 */
			if(elem.isNull() && workingQueue.peek() == null){
				break;
			}
			/*
			 * Eine Ebene abgearbeitet
			 */
			if( elem.isNull() ){
				depth++;
				workingQueue.add(elem);
				queue.add( new QueueElement() );
			}
			/*
			 * BinaryNode
			 */
			else if( elem.node.getClass() == AddNode.class || elem.node.getClass() == MinusNode.class
					|| elem.node.getClass() == DivNode.class || elem.node.getClass() == MultiNode.class){
				
				QueueElement left = new QueueElement( ((BinaryNode) elem.node).getLeft(), elem.pos-1);
				QueueElement right = new QueueElement( ((BinaryNode) elem.node).getRight(), elem.pos+1);
				workingQueue.add( left);
				workingQueue.add( right);
				queue.add(left);
				queue.add(right);
			}			
		}
		
		int middle = depth * depth;
		/*
		 * Erzeuge String
		 */
		while( ! queue.isEmpty() ){
			elem = queue.poll();
						
			if( elem.isNull() ){
				str.append("\n");
			}
			else{
				for(int i = 0; i < elem.pos + middle; i++){
					str.append(" ");
				}
				str.append( elem.node.toString() );
			}
		}
		
		return str.toString();
	}

	@Override
	public String print(BinaryNode node) {		
		return "";
	}


	@Override
	public String print(UMinusNode node) {
		return "";
	}


	@Override
	public String print(AtomicNode node) {
		return "";
	}
	
	
	/**
	 * Private Klasse, 
	 * erzeugt einen Datentyp ExprNode, Position im Baum
	 * @author skrause
	 *
	 */
	private class QueueElement{
		private int pos;
		private ExprNode node;
		
		private QueueElement(ExprNode n, int p){
			this.pos = p;
			this.node = n;
		}
		
		private QueueElement(){
			pos = 0;
			node = null;
		}
		private boolean isNull(){
			return node == null;
		}
	}





}
