/**
 * 
 */
package in.manishsingh.datastructures.Queue.LinkedList;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public class LinkedList<T> implements Queue<T> {

	private Node<T> firstNode = null;
	private Node<T> lastNode = null;
	private int size = 0;

	@Override
	public void enqueue(T data) {
		// TODO Auto-generated method stub

		++this.size;

		if (firstNode == null) {

			firstNode = new Node<T>(data);
			firstNode.setNextNode(null);

			lastNode = firstNode;

		} else {
			insertDataAtTail(data);
		}

	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub

		if (firstNode == null)
			return;

		--this.size;

		System.out.println(firstNode.getData());

		firstNode = firstNode.getNextNode();

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	private void insertDataAtTail(T data) {

		Node<T> tempNode = new Node<T>(data);
		lastNode.setNextNode(tempNode);

		this.lastNode = tempNode;
	}

	@Override
	public void peek() {
		
		if(firstNode!=null)
		System.out.println(firstNode.getData());
		
	}

}
