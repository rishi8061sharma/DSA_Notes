package com.myjlc.heap.java;

import java.util.Collections;
import java.util.PriorityQueue;

public class Lab9 {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(2);
		pq.add(4);
		pq.add(8);
		pq.add(25);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}
}

//PriorityQueue - based on MinHeap Data Structure