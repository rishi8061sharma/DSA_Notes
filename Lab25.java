package com.jlcindia.sorting;

import java.util.Arrays;

// Counting Sort

public class Lab25 {
	
	public static void countingSort(int arr[],int k) {
		
		int n = arr.length;
		
		//1. Create the Count Array
		int count[] = new int[k];
		
		//2. Count the Occurrences
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		//3. Update the Count Array
		for(int i=1;i<k;i++) {
			count[i] = count[i]+ count[i-1];
		}
		
		//4. Create Output Array
		int output[] = new int[n];
		
		//5. Fill the Output Array
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		
		//6. Move output elements to main Array
		for(int i=0;i<n;i++) {
			arr[i] = output[i];
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 2,5,5,2,0,1,2,3,2,3,2,5,1,1,0,3,2,-5};
		int k=6;
		
		System.out.println(Arrays.toString(arr));
		countingSort(arr,k);
		System.out.println(Arrays.toString(arr));

	}
}
