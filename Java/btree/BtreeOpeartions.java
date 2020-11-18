package in.manishsingh.ds.btree;

public interface BtreeOpeartions<T> {
	
	public boolean insertData(T data);
	
	public boolean removeData(T data);
	
	public int treeDepth();


}
