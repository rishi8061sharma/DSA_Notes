package com.jlcindia.sorting;

import java.util.Arrays;

//Insertion Sort

public class Lab14 {

	public static void insertionSort(int arr[]) {

		int n = arr.length;

		for (int i = 1; i <= n-1; i++) { // i<n

			int key = arr[i];
			int j=i-1;
			while ( j >=0 && arr[j]>key) { 
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		} // Outer For
	}

	public static void main(String[] args) {
		int arr[] = { 25, 9, 15, 8, 20, 7, 10 };

		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
//Time - O(n2)
//Aux Space - O(1)