package in.manishsingh.datastructures.Queue.LinkedList;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */

public class App {

	public static void main(String[] args) {
		
		Queue<String> l1=new LinkedList<>();
		
		l1.enqueue("T1");
		l1.enqueue("T2");
		l1.enqueue("T3");
		l1.enqueue("T4");
		l1.peek();
		l1.dequeue();
		System.out.println();
		l1.peek();
		System.out.println();
		System.out.println(l1.size());
		
		Queue<Double> l11=new LinkedList<>();
		l11.peek();
		l11.enqueue(11.44);
		l11.enqueue(11.25);
		l11.enqueue(14.866);
		l11.enqueue(17.25);
		l11.enqueue(16.98);
		l11.peek();
		l11.dequeue();
		l11.peek();

		System.out.println();
		
		System.out.println(l11.size());
		
	Queue<testClass> l4=new LinkedList<>();
	
	testClass t1=new testClass("P1", 10);
	testClass t2=new testClass("P2", 20);
	
	l4.enqueue(t1);
	l4.enqueue(t2);
	l4.peek();
		
	}

}
