package in.manishsingh.datastructures.Linkedlist;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */

public class App {

	public static void main(String[] args) {
		
		List<String> l1=new  LinkedList<>();
		l1.tarverseList();
		l1.insert("T1");
		l1.insert("T2");
		l1.insert("T3");
		l1.insert("T4");
		l1.tarverseList();
		l1.remove("T4");
		System.out.println();
		l1.tarverseList();
		System.out.println();
		System.out.println(l1.size());
		
		List<Double> l11=new  LinkedList<>();
		l11.tarverseList();
		l11.insert(11.44);
		l11.insert(11.25);
		l11.insert(14.866);
		l11.insert(17.25);
		l11.insert(16.98);
		l11.tarverseList();
		l11.remove(16.98);
		System.out.println();
		l11.tarverseList();

		System.out.println();
		
		System.out.println(l11.size());
		
	List<testClass> l4=new LinkedList<testClass>();
	
	testClass t1=new testClass("P1", 10);
	testClass t2=new testClass("P2", 20);
	
	l4.insert(t1);
	l4.insert(t2);
	l4.tarverseList();
		
	}

}
