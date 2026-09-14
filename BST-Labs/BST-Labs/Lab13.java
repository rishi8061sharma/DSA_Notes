package com.jlcindia.binarysearchtrees;

// Delete Operation in BST -  Recursive

public class Lab13 {

	public static Node findMin(Node myroot) {
		
		if(myroot==null)
			return new Node(-1);
				
		if(myroot.left==null)
			return myroot;
		else 
			return findMin(myroot.left);
	}
	
	
	public static void inorder(Node myroot) {
		if (myroot != null) {
			inorder(myroot.left);
			System.out.println(myroot.key + "\t");
			inorder(myroot.right);
		}
	}

	public static Node delete(Node root, int element) {

		if(root==null) {
			return root;
		}
		
		if(element<root.key) {
			root.left = delete(root.left,element);
		}else if(element>root.key) {
			root.right = delete(root.right,element);
		}else  if(element == root.key) {
			//Element Found to Delete
			if(root.left==null && root.right==null) {
				//1. No Children
				root=null;
				return root;
			}else if(root.right==null) {
				//2. One Left Child
				root = root.left;
				return root;
			}	else if(root.left==null) {
				//3. One Right Child
				root = root.right;
				return root;
			}else {
				//4. Two Childen
				Node min = findMin(root.right);
				root.key = min.key;
				root.right = delete(root.right,min.key);
				return root;
			}
		}
		
		return root;
	}

	public static void main(String[] args) {

		Node myroot = new Node(50);

		myroot.left = new Node(25);
		myroot.right = new Node(75);

		 myroot.left.left = new Node(20); 
		 myroot.left.right = new Node(30);
		 
		 myroot.right.left = new Node(60); 
		 myroot.right.right = new Node(90);
		 myroot.right.right.left = new Node(85);
		 myroot.right.right.right = new Node(95);
		 myroot.right.right.left.right = new Node(87);
		 myroot.right.right.left.left = new Node(80);

		inorder(myroot);
		myroot = delete(myroot,75);
		System.out.println("------------");
		inorder(myroot);

	}
}
