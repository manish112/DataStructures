/**
 * 
 */
package in.manishsingh.datastructures.Queue.Array;

/**
 * @author Manish Singh
 * @email manish@manishsingh.in
 *
 */
public class Array<T> implements Queue<T> {

	private int size = 0;
	private T[] queueArray = (T[]) new Object[10];

	@Override
	public void enqueue(T data) {
		// TODO Auto-generated method stub

		if (this.size == 9) {
			System.out.println("Queue is full. Can't insert more elements!");
			return;
		} else {
			this.queueArray[this.size++] = data;
		}

	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub

		if (this.size == 0) {
			System.out.println("Queue is empty!");
			return;
		}

		System.out.println(this.queueArray[0]);

		for (int i = 0; i < this.size; i++) {
			this.queueArray[i] = this.queueArray[i + 1];
		}

		--this.size;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void peek() {

		if (this.size == 0) {
			System.out.println("Queue is empty");
		} else {
			System.out.println(this.queueArray[0]);
		}

	}

}
