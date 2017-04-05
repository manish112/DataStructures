/**
 * 
 */
package in.manishsingh.datastructures.Linkedlist;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public class doublyLinkedListNode<T> {

	private T data;
	private doublyLinkedListNode<T> nextNode; 
	private doublyLinkedListNode<T> previousNode; 
	
	public doublyLinkedListNode(T data){
		this.data=data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public doublyLinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(doublyLinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
		
	public doublyLinkedListNode<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(doublyLinkedListNode<T> previousNode) {
		this.previousNode = previousNode;
	}

	@Override
	public String toString(){
		return this.data.toString();
	}
	
}
