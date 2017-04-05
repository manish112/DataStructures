/**
 * 
 */
package in.manishsingh.datastructures.Linkedlist;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public class LinkedList<T> implements List<T> {

	private Node<T> n1 = null;
	private int size = 0;

	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub

		++this.size;

		if (n1 == null) {

			n1 = new Node<T>(data);
			n1.setNextNode(null);

		} else {
			insertDataAtBegining(data);
		}

	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub

		if (n1 == null)
			return;

		--this.size;

		if (this.n1.getData().toString().equals(data.toString())) {
			
			n1 = n1.getNextNode();
			return;
		} else {
			removeNode(data, n1, n1.getNextNode());
		}

	}

	@Override
	public void tarverseList() {
		if(n1==null){
			System.out.println("List is empty");
			return;
		}
		
		Node<T> tempNode = this.n1;
		
		while(tempNode!=null){
			System.out.print(tempNode+"->");
			tempNode=tempNode.getNextNode();
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	private void insertDataAtBegining(T data) {

		Node<T> n2 = new Node<T>(data);
		n2.setNextNode(n1);
		this.n1 = n2;
	}

	private void removeNode(T data, Node<T> previousNode, Node<T> n2) {

		while (n2 != null) {

			if (n2.getData().toString().equals(data.toString())) {

				previousNode = n2.getNextNode();
				n2 = null;
				return;
			}

			previousNode = n2;
			n2 = n2.getNextNode();

		}

	}

}
