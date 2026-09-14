package com.jlcindia.binarytrees;

// Minimum in Binary Tree

public class Lab7 {

	public static int getMin(Node myroot) {
		if (myroot == null) {
			return Integer.MAX_VALUE;
		} else {
			int leftMin = getMin(myroot.left);
			int rightMin = getMin(myroot.right);
			int min = Math.min(leftMin, rightMin);
			return Math.min(myroot.key, min);
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

		int min = getMin(myroot); 
		System.out.println(min);

	}
}
