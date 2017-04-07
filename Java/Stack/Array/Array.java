package in.manishsingh.datastructures.stack.Array;

public class Array<T> implements Stack<T> {
	
	private T [] stackArray;
	private int elements=0;
	
   	public Array() {
		
		this.stackArray = (T[]) new Object[1];
	}

	@Override
	public void push(T data) {
		// TODO Auto-generated method stub
	if(this.elements==this.stackArray.length){
		resize(2*this.stackArray.length);
	}
	
	stackArray[elements++]=data;
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
		if(this.elements==0){
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.print(this.stackArray[--elements].toString());
		
		if(elements>0&&(elements==(this.stackArray.length)/4)){
			resize((this.stackArray.length/2));
		}
		
	}

	@Override
	public void peek() {
		
		
		if(this.elements==0){
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println(stackArray[elements-1].toString());
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return elements;
	}
	
	private void resize(int size){
		
		T[] tempStack = (T[]) new Object[size];
		
		int stackSize=this.stackArray.length;
		
		for(int i=0;i<stackSize;i++){
			
			tempStack[i]=stackArray[i];
			
		}
		
		stackArray=tempStack;
		
	}

}
