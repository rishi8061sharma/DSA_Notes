package com.jlcindia.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

// Level Order Traversal( Breadth First)
//Left -> Right
public class Lab9 {

	public static void levelOrder(Node myroot) {
		
		if(myroot==null) {
			return;
		}
		
		Queue<Node> myque = new LinkedList<Node>();
		myque.add(myroot);
		
		while(!myque.isEmpty()) {
		Node currNode = myque.poll();
		System.out.print(currNode.key+"\t");
		
		if(currNode.left!=null) 
			myque.add(currNode.left);	
		
		if(currNode.right!=null) 
			myque.add(currNode.right);	
		
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

		levelOrder(myroot);

	}
}
