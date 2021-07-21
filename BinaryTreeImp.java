import java.util.Scanner;

public class BinaryTreeImp {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Node root = createTree();
		System.out.println("Root node is "+root.data);
		
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}


	private static Node createTree() {
		Node root = null;
		System.out.println("Enter data");
		int data = in.nextInt();
		
		if(data == -1) return null;
		root = new Node(data);
		
		System.out.println("Enter left node to the "+ data);
		root.left = createTree();
		
		System.out.println("Enter right node to the "+ data);
		root.right = createTree();
		
		return root;
	}
	
	private static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	private static void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	private static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
}

class Node{
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
