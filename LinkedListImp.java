

public class LinkedListImp {
	
	protected class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	protected Node head;
	
	
	//Insertion
	public void addAtFirst(int data) {
		Node nn = new Node(data);
		nn.next = head;
		head = nn;
	}
	
	public void addAtEnd(int data) {
		Node nn= new Node(data);
		if(head == null) {
			head = nn;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}
	
	public void addAtMiddle(int indx, int data) {
		Node nn = new Node(data);
		if(indx < 0) {
			return;
		}
		if(indx == 0) {
			addAtFirst(data);
			return;
		}
		
		Node temp = head;
		for(int i =0; i<indx-1; i++) {
			temp = temp.next;
		}
		
		nn.next = temp.next;
		temp.next = nn;
		
	}
	
	
	//Traversal
	public void printList() {
		System.out.println("*****************************");
		Node temp = head;
		while(temp !=  null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println("*****************************");
	}
	
	
	//Deletion
	public void deleteAtFirst() {
		head = head.next;
	}
	
	public void deleteAtLast() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	public void deleteAtMiddle(int indx) {
		Node temp = head;
		for(int i=0; i< indx-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	
	//Searching
	public boolean search(int data) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == data)
				return true;
			temp = temp.next;
		}
			return false;
	}
	
	
	//Sorting
	void sortLinkedList() {
	    Node current = head;
	    Node index = null;
	    int temp;

	    if (head == null) {
	      return;
	    } else {
	      while (current != null) {
	        // index points to the node next to current
	        index = current.next;

	        while (index != null) {
	          if (current.data > index.data) {
	            temp = current.data;
	            current.data = index.data;
	            index.data = temp;
	          }
	          index = index.next;
	        }
	        current = current.next;
	      }
	    }
	  }

	
	//Reverse
	public void reverse() {
		Node prev = null, curr= head , next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	//L0->L1->L2->....->Ln-1->Ln  CONVERT TO  L0->Ln->L1->Ln-1->L2->Ln-2->....
	//O(n)
	public void foldALL() {
			Node slow = head, fast = head;
			while(fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			
			Node prev = null, curr= slow , next = null;
			
			while(curr != null) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			
			Node first = head, second = prev, temp=null;
			
			while(second.next != null) {
				temp=first.next;
				first.next=second;
				first = temp;
				temp = second.next;
				second.next=first;
				second=temp;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImp ll = new LinkedListImp();
		
//		ll.addAtFirst(3);
//		ll.addAtFirst(2);
//		ll.addAtFirst(1);
//		ll.addAtEnd(4);
		//ll.addAtMiddle(3, 8);
		
//		ll.printList();
		
		
//		ll.deleteAtLast();
//		ll.printList();
//		
//		ll.deleteAtFirst();
//		ll.printList();
//		
//		ll.deleteAtMiddle(2);
//		ll.printList();
//		
//		System.out.println(ll.search(3));   
//		System.out.println(ll.search(4));
//		System.out.println(ll.search(0));
//		System.out.println(ll.search(-1));
//		
//		ll.sortLinkedList();
//		ll.printList();
//		
//		ll.reverse();
//		ll.printList();
		
//		ll.foldALL();
//		ll.printList();
	}

}
