package in.manishsingh.datastructures.stack.Linkedlist;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */

public class App {

	public static void main(String[] args) {
		
		Stack<String> l1=new LinkedList();
		l1.peek();
		l1.push("T1");
		l1.push("T2");
		l1.push("T3");
		l1.push("T4");
		l1.peek();
		l1.pop();
		System.out.println();
		l1.peek();
		System.out.println();
		System.out.println(l1.size());
		
		Stack<Double> l11=new LinkedList();
		l11.peek();
		l11.push(11.44);
		l11.push(11.25);
		l11.push(14.866);
		l11.push(17.25);
		l11.push(16.98);
		l11.peek();
		l11.pop();
		System.out.println();
		l11.peek();

		System.out.println();
		
		System.out.println(l11.size());
		
	Stack<testClass> l4=new LinkedList();
	
	testClass t1=new testClass("P1", 10);
	testClass t2=new testClass("P2", 20);
	
	l4.push(t1);
	l4.push(t2);
	l4.peek();
		
	}

}
