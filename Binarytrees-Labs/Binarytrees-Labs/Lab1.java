package com.jlcindia.binarytrees;

// In Order Traversal
// Left => Root => Right

public class Lab1 {

	public static void inorder(Node myroot) {
		if (myroot != null) {
			inorder(myroot.left);
			System.out.println(myroot.key + "\t");
			inorder(myroot.right);
		}
	}

	public static void main(String[] args) {

		Node myroot = new Node(10);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		 myroot.left.left = new Node(40); 
		 myroot.left.right = new Node(50);
		 
		 myroot.right.left = new Node(60); 
		 myroot.right.right = new Node(70);
		
		inorder(myroot);
	}
}
