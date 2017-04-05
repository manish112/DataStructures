/**
 * 
 */
package in.manishsingh.datastructures.Linkedlist;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public class doublyLinkedList<T> implements List<T> {

	private doublyLinkedListNode<T> n1 = null;
	private int size = 0;

	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub

		++this.size;

		if (n1 == null) {

			n1 = new doublyLinkedListNode<T>(data);
			n1.setNextNode(null);
			n1.setPreviousNode(null);

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
			removeNode(data, n1);
		}

	}

	@Override
	public void tarverseList() {
		if (n1 == null) {
			System.out.println("List is empty");
			return;
		}

		doublyLinkedListNode<T> tempNode = this.n1;

		while (tempNode != null) {
			System.out.print(tempNode + "<->");
			tempNode = tempNode.getNextNode();
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	private void insertDataAtBegining(T data) {

		doublyLinkedListNode<T> n2 = new doublyLinkedListNode<T>(data);
		n2.setNextNode(n1);
		n1.setPreviousNode(n2);
		this.n1 = n2;
	}

	private void removeNode(T data, doublyLinkedListNode<T> n2) {

		doublyLinkedListNode<T> nTemp;

		while (n2 != null) {

			if (n2.getData().toString().equals(data.toString())) {

				nTemp = n2.getPreviousNode();

				if (nTemp != null) {

					nTemp.setNextNode(n2.getNextNode());
				} else {

					n1 = n2.getNextNode();
				}
				n2 = null;
				return;
			}

			n2 = n2.getNextNode();

		}

	}

}
