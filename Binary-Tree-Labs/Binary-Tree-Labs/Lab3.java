package com.jlcindia.binarytrees;

// Post Order Traversal
//  Left => Right => Root 

public class Lab3 {

	public static void postorder(Node myroot) {
		if (myroot != null) {
			postorder(myroot.left);
			postorder(myroot.right);
			System.out.println(myroot.key + "\t");
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

		 postorder(myroot);
	}
}
