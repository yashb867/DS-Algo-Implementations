
public class QueueImp {
	int[] queue;
	int front;
	int size;                     //no of elements in the queue

	public QueueImp(int queueSize) {
		queue = new int[queueSize];
		front = 0;
		size = 0;
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			return;
		}
		queue[(front + size) % queue.length] = item;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return 0;
		}
		int temp = queue[front];
		queue[front] = 0;
		front = (front+1) % queue.length;
		size--;
		return temp;
	}
	
	public void display() {
		System.out.println("----------------------------------------");
		for(int i=front; i<front+size; i++) {
			System.out.print(queue[i% queue.length] +" ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
	}
	
	public int getFront() {
		if(isEmpty()) {
			return 0;
		}
		return queue[front];
	}
	
	
	private boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == queue.length;
	}

	public static void main(String[] args) {
		QueueImp que = new QueueImp(5);
		
		que.enqueue(0);
		que.display();
		que.enqueue(1);
		que.display();
		que.enqueue(2);
		que.display();
		que.enqueue(3);
		que.display();
		que.dequeue();
		que.display();
		que.dequeue();
		que.display();
		
		System.out.println(que.getFront());
		
	}

}
