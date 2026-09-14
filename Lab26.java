package com.jlcindia.sorting;

import java.util.Arrays;

// Radix Sort

public class Lab26 {

	public static void countingSort(int arr[], int exp) { //1,10,100

		int n = arr.length;

		// 1. Create the Count Array
		int count[] = new int[10];

		// 2. Count the Occurrences
		for (int i = 0; i < n; i++) {
			count[(arr[i]/exp)%10]++;
		}

		// 3. Update the Count Array
		for (int i = 1; i < 10; i++) {
			count[i] = count[i] + count[i - 1];
		}

		// 4. Create Output Array
		int output[] = new int[n];

		// 5. Fill the Output Array
		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i]/exp)%10] - 1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}

		// 6. Move output elements to main Array
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}

	public static void radixSort(int arr[]) {
		
		int n = arr.length;
		
		int max = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int exp = 1; max/exp>0; exp = exp * 10) {
			countingSort(arr, exp);
		}
	
	}

	public static void main(String[] args) {
		int arr[] = { 319,212,6,8,100,50 };

		System.out.println(Arrays.toString(arr));
		radixSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
