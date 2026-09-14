package com.myjlc.heap.lab6;

public class Lab6 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,45};
		MyBinaryHeap myheap = new MyBinaryHeap(arr);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.delete(3);
		myheap.printHeap();
	}
}
