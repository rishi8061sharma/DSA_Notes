package com.jlcindia.binarytrees;

import java.util.Stack;

// InOrder -Iterative Style 

public class Lab12 {

	public static void inOrderIterative(Node myroot) {

		if (myroot == null) {
			return;
		}

		Stack<Node> mystack = new Stack<Node>();
		Node currNode = myroot;

		while (currNode != null || !mystack.isEmpty()) {

			while (currNode != null) {
				mystack.push(currNode);
				currNode = currNode.left;
			}

			currNode = mystack.pop();
			System.out.print(currNode.key+"\t");
			currNode = currNode.right;
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

		inOrderIterative(myroot);

	}
}
