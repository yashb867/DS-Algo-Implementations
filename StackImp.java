

public class StackImp {
	int[] stack;
	int top;
	int size;
	
	public StackImp(int size) {
		stack = new int[size];
		top = -1;
		//System.out.println(size);

	}
	//O(1)
	public void push(int item) {
		if(isFull()) {
			return;
		}
		top++;
		stack[top] = item;
	}
	//O(1)
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int temp = stack[top];
		stack[top] = 0;
		top--;
		return temp;
	}
	//O(n)
	public void display() {
		System.out.println("**************************");
		
		for(int i=top; i>=0; i--) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
		System.out.println("**************************");
	}
	//O(1)
	public int peek() {
		return stack[top];
	}

	public boolean isFull() {
		return top == stack.length-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	public static void main(String[] args) {

		StackImp stk = new StackImp(4);
//		stk.push(110);
//		stk.display();
//		stk.push(220);
//		stk.display();
//		stk.push(330);
//		stk.display();
//		stk.push(440);
//		stk.display();
//		System.out.println(stk.peek());
//		stk.pop();
//		stk.display();
	}

}
