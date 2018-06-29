package FirstPackage;

public class MakingStack {
	
	private int size;
	private int capacity;
	private int arr[];
	
	public MakingStack() {
		// TODO Auto-generated constructor stub
		
		size = 0;
		capacity = 5;
		arr = new int[5];
	}
	
	private void copy(int [] temp) {
		
		int i = 0;
		while(i < size) {
			
			temp[i] = arr[i];
			i++;
		}
	}
	
	private void expandSize() {
		
		capacity *= 2;
		int temp[] = new int[capacity];
		copy(temp);
		arr = temp;
		
	}
	
	public void push(int num) {
		
		if(size == capacity) {
			
			expandSize();
		}
		arr[size++] = num;
	}
	
	public void pop() {
		if (size == 0)
			System.out.println("Stack is Empty!!");
		else {
			
			arr[size-1] = 0;
			size--;
		}
	}
	
	public boolean isEmpty() {
		
		return (size == 0);
	}
	
	public int getSize() {
		
		return size;
	}
	
	public int getCapacity() {
		
		return capacity;
	}
	
	public int top() {
		if (size == 0) 
		{
			System.out.println("Stack is Empty!! Returning -1...");
			return -1; 
		}
		return arr[size-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakingStack obj = new MakingStack();
		for(int i = 0; i <=12; i++) {
			
			obj.push(i+1);
			System.out.println("Added : " + obj.top());
			System.out.println("Size : " + obj.getSize());
			System.out.println("Capacity : " + obj.getCapacity() + "\n");
		}
		
		if(obj.isEmpty()) {
			System.out.println("Stack is Empty !!");
		} else {
			System.out.println("Stack is not Empty!!");
		}
		
		for(int i = 0; i <=12; i++) {
			
			obj.pop();
			System.out.println("Last : " + obj.top());
			System.out.println("Size : " + obj.getSize());
			System.out.println("Capacity : " + obj.getCapacity() + "\n");
		}
		
		if(obj.isEmpty()) {
			System.out.println("Stack is Empty !!");
		} else {
			System.out.println("Stack is not Empty!!");
		}

	}

}
