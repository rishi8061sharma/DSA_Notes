package com.jlcindia.binarytrees;

// Print the Nodes at K-Distance

public class Lab8 {

	public static void printKDistanceNodes(Node myroot,int k) {
		
		if(myroot==null) {
			return;
		}
		
		if(k==0) {
			System.out.print(myroot.key+"\t");
		}else {
		printKDistanceNodes(myroot.left,k-1);
		printKDistanceNodes(myroot.right,k-1);
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

		printKDistanceNodes(myroot,0); 
		

	}
}
