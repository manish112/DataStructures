/**
 * 
 */
package in.manishsingh.datastructures.stack.Array;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public interface Stack<T> {
	
	public void push(T data);
	public void pop();
	public void peek();
	public int size();

}
