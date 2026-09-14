package com.jlcindia.binarytrees;

import java.util.Stack;

// PostOrder -Iterative Style 
// Left -> Right -> Root 
public class Lab14 {

	public static void postOrderIterative(Node myroot) {

		if (myroot == null)
			return;

		Stack<Integer> output = new Stack<Integer>();

		Stack<Node> mystack = new Stack<Node>();
		mystack.push(myroot);

		while (!mystack.isEmpty()) {
			Node currNode = mystack.pop();
			output.push(currNode.key);

			if (currNode.left != null)
				mystack.push(currNode.left);

			if (currNode.right != null)
				mystack.push(currNode.right);
		}
		while (!output.isEmpty()) {
			System.out.print(output.pop()+"\t");
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

		postOrderIterative(myroot);

	}
}
