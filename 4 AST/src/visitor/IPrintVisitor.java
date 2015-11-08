/**
 * 
 */
package visitor;

import ast.*;

/**
 * @author skrause
 *
 */
public interface IPrintVisitor {
	
	public String print(HeteroAST node);
	public String print(BinaryNode node);
	public String print(UMinusNode node);
	public String print(AtomicNode node);
	
}
