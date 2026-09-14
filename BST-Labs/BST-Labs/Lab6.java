package com.jlcindia.binarysearchtrees;

// Find Min in BST - Iretartive Way

public class Lab6 {

	public static int findMin(Node myroot) {

		if (myroot == null)
			return -1;

		Node current = myroot;
		while (current.left != null) {
			current = current.left;
		}
		return current.key;
	}

	public static void main(String[] args) {

		Node myroot = new Node(25);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		myroot.left.left = new Node(10);
		myroot.left.right = new Node(23);

		myroot.right.left = new Node(27);
		myroot.right.right = new Node(35);

		//myroot.left.left.left = new Node(6);

		int min = findMin(myroot);
		System.out.println(min);

	}
}
