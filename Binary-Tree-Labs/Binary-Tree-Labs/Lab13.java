package com.jlcindia.binarytrees;

import java.util.Stack;

// PreOrder -Iterative Style 
// Root -> Left -> Right
public class Lab13 {

	public static void preOrderIterative(Node myroot) {

		if (myroot == null)
			return;

		Stack<Node> mystack = new Stack<Node>();
		mystack.push(myroot);

		while (!mystack.isEmpty()) {
			Node currNode = mystack.pop();
			System.out.print(currNode.key + "\t");

			if (currNode.right != null)
				mystack.push(currNode.right);

			if (currNode.left != null)
				mystack.push(currNode.left);

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

		preOrderIterative(myroot);

	}
}
