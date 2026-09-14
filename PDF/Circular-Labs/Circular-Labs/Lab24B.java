package com.jlcindia.circular.singly.linkedlist;

// Traverse the Circular Singly LinkedList 
//Prefer this
public class Lab24B {

	static void displayList(Node headNode) {
		if (headNode == null) {
			return;
		}

		Node currentNode = headNode;

		do {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		} while (currentNode != headNode);

		System.out.println("\n");
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = head;

		displayList(head);

	}

}
