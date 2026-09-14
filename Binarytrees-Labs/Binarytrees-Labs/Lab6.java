package com.jlcindia.binarytrees;

// Maximum in Binary Tree

public class Lab6 {

	public static int getMax(Node myroot) {
		if (myroot == null) {
			return Integer.MIN_VALUE;
		} else {
			int leftMax = getMax(myroot.left);
			int rightMax = getMax(myroot.right);
			int max = Math.max(leftMax, rightMax);
			return Math.max(myroot.key, max);
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

		// myroot.right.right.left= new Node(80);
		// myroot.right.right.left.right= new Node(90);

		int max = getMax(myroot);
		System.out.println(max);

	}
}
