package in.manishsingh.ds.btree;

public class BtreeOperationsImpl<T extends Comparable<T>> implements BtreeOpeartions<T> {

	BtreeNode<T> rootNode = null;

	int treeDepth = 0;

	@Override
	public boolean insertData(T data) {
		// TODO Auto-generated method stub

		if (rootNode == null) {
			rootNode = new BtreeNode<T>(data);
			return true;
		}

		int flag = 1;

		BtreeNode<T> newData = new BtreeNode<T>(data);

		BtreeNode<T> currNode = rootNode;

		while (flag == 1) {
			if (data.compareTo(currNode.getData()) <= 0) {

				if (currNode.getLeftNode() != null) {

					currNode = currNode.getLeftNode();

				} else {
					currNode.setLeftNode(newData);
					return true;
				}

			} else {

				if (currNode.getRightNode() != null) {

					currNode = currNode.getRightNode();

				} else {
					currNode.setRightNode(newData);
					return true;
				}

			}
		}

		return false;

	}

	@Override
	public boolean removeData(T data) {
		// TODO Auto-generated method stub

		return false;
	}
	
	int currentDepth=0;

	@Override
	public int treeDepth() {
		// TODO Auto-generated method stub

		if (rootNode != null) {

			treeDepth++;
			currentDepth++;
			treeFullDepth(rootNode);

		}

		return treeDepth;
	}
	
	

	public void treeFullDepth(BtreeNode<T> node) {

		if (node.getLeftNode() != null) {
			
			currentDepth++;
			if(treeDepth<currentDepth) {
			treeDepth++;
			}
			
			
			treeFullDepth(node.getLeftNode());
		}else {
			//currentDepth--;
			//return;
		}
		
		if(node.getRightNode()!=null) {
			
			currentDepth++;
			if(treeDepth<currentDepth) {
			treeDepth++;
			}
			
			
			treeFullDepth(node.getRightNode());
		}else {
			
			//currentDepth--;
			//return;
			
		}
		currentDepth--;
		return;

	}

}
