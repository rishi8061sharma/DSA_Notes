package com.myjlc.heap.lab2;

public class Lab2 {
	public static void main(String[] args) {
		
		MyBinaryHeap myheap = new MyBinaryHeap(10);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.insert(10);
		myheap.insert(20);
		myheap.insert(30);
		myheap.insert(40);
		myheap.insert(50);
		myheap.insert(60);
		myheap.insert(70);
		myheap.insert(80);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.insert(12);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.insert(5);
		myheap.printHeap();
		System.out.println("---------------------");
	}
}
