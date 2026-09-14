package com.jlcindia.circular.singly.linkedlist;

// Insert the Node at given position of Circular Singly LinkedList

public class Lab28 {

	static Node insert(Node headNode,int position, int data) {
		
		Node temp = new Node(data);
		
		//1.Empty List
		if(headNode==null) {
			headNode=temp;
			headNode.next=headNode;
			return headNode;
		}
		
		//2. Position = 1
		if(position==1){
			return insertFirst(headNode, data);
		}

		Node currentNode = headNode;
		for(int i=1;i<=position-2 && currentNode.next != headNode;i++) {
			currentNode=currentNode.next;
		}
		
		if(currentNode.next==headNode) {
			return headNode;
		}
		
		temp.next=currentNode.next;
		currentNode.next = temp;
		
		//HeadNode is Not Changed
		
		return headNode;
		
	}

	static Node insertFirst(Node headNode,int data) {
		
		Node temp = new Node(data);
		
		//1.Empty List
		if(headNode==null) {
			headNode=temp;
			headNode.next=headNode;
			return headNode;
		}
		
		temp.next=headNode.next;
		headNode.next=temp;
		
		//Swap data of 1st and 2nd Nodes
		int x= headNode.data;
		headNode.data= temp.data;
		temp.data=x;
		
		//Head Not Changed
	
		return headNode;
	}
	
static Node insertLast(Node headNode,int data) {
		
		Node temp = new Node(data);
		
		//1.Empty List
		if(headNode==null) {
			headNode=temp;
			headNode.next=headNode;
			return headNode;
		}
		
		temp.next=headNode.next;
		headNode.next=temp;
		
		//Swap data of 1st and 2nd Nodes
		int x= headNode.data;
		headNode.data= temp.data;
		temp.data=x;
		
		//Head has to be Changed
		headNode = temp;
		
    	return headNode;
	}

	static void displayList(Node headNode) {

		Node currentNode = headNode;

		do {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		} while (currentNode != headNode);

		System.out.println("\n");
	}
		
	
	public static void main(String[] args) {

			Node head = null;
			head = insertFirst(head,50);
			head = insertFirst(head,40);
			head = insertFirst(head,30);
			head = insertFirst(head,20);
			head = insertFirst(head,10);
			
			displayList(head);
			System.out.println("-----------------");
			
			head = insert(head,1,99);
			displayList(head);
			
			//
	}

}
// Time - O(n)
//Space - O(1)