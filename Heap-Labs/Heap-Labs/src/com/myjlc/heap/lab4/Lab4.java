package com.myjlc.heap.lab4;

public class Lab4 {
	public static void main(String[] args) {
		
		int arr[] = {40,20,30,25,35,45,55};
		MyBinaryHeap myheap = new MyBinaryHeap(arr);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.heapify(0);
		myheap.printHeap();
	}
}
