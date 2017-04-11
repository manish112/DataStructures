package in.manishsingh.datastructures.Queue.LinkedList;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */

public class testClass {

	private String name;
	private int age;
	
	public testClass(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}
