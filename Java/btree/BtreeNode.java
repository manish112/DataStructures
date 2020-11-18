package in.manishsingh.ds.btree;

public class BtreeNode<T> {
	
	private T data;
	private BtreeNode<T> leftNode;
	private BtreeNode<T> rightNode;
	
	
	public BtreeNode(T data) {
		
		this.data=data;
	}


	public BtreeNode<T> getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(BtreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}


	public BtreeNode<T> getRightNode() {
		return rightNode;
	}


	public void setRightNode(BtreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}


	public T getData() {
		return data;
	}
	
	
	
	
	
	
	
	
}


