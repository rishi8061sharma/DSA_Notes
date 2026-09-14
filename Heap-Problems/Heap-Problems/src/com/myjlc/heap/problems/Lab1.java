package com.myjlc.heap.problems;

import java.util.Arrays;
import java.util.PriorityQueue;

//1. Sort the K-Sorted Array

public class Lab1 {
	int arr[] = {9,8,7,18,19,17};

	public static void sortK(int arr[],int k) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		
		int myindex=0;
		for(int i=k;k<arr.length;i++) {
			arr[myindex++] = pq.poll();
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			arr[myindex++] = pq.poll();
		}
		System.out.println(pq);

	}
	
	public static void main(String[] args) {
		
		int arr[] = {9,8,7,18,19,17};
			int k=3;
			System.out.println(Arrays.toString(arr));
			sortK(arr,k);
			System.out.println(Arrays.toString(arr));
	}
}
