package com.jlcindia.arrays.sort;

import java.util.Arrays;

public class Lab2 {
	
	public static void main(String[] args) {
				
		int arr1[] = {10,5,20,15,30,25};
		char arr2[] = {'C','D','E','B','A'};
		
		Arrays.sort(arr1,2,6);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr2,3,5);
		System.out.println(Arrays.toString(arr2));
		

	}
}




