package in.manishsingh.ds.btree;

public class Btree {

	public static void main(String[] args) {
		
		BtreeOpeartions<Integer> tree = new BtreeOperationsImpl();
		
		tree.insertData(20);
		
		tree.insertData(10);
		
		tree.insertData(23);
		
		tree.insertData(24);
		
		tree.insertData(17);
		
		tree.insertData(13);
		tree.insertData(19);
		tree.insertData(18);
		//tree.insertData(10);
	//	tree.insertData(11);
		
		
		System.out.println(tree.treeDepth());
		
	

	}

}
