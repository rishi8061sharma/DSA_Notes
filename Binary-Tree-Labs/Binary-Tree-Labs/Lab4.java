package com.jlcindia.binarytrees;

// Height of Binary Tree

public class Lab4 {

	public static int height(Node myroot) {
		if (myroot == null) {
			return 0;
		}else{
			int leftHight =  height(myroot.left);
			int rightHight =  height(myroot.right);
			int max= Math.max(leftHight, rightHight);
			return 1+ max;
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
		 
		 myroot.right.right.left= new Node(80);
		 myroot.right.right.left.right= new Node(90);
		 
			int height = height(myroot);
			System.out.println(height);
		
	}
}
