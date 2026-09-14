package com.myjlc.heap.lab7;

public class Lab7 {
	public static void main(String[] args) {
		
		int arr[] = {10,5,20,2,4,8,25};
		MyBinaryHeap myheap = new MyBinaryHeap(arr);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.buildHeap();
		myheap.printHeap();
	}
}
