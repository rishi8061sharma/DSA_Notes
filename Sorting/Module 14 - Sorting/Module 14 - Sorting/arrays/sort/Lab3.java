package com.jlcindia.arrays.sort;

import java.util.Arrays;
import java.util.Collections;

public class Lab3 {
	
	public static void main(String[] args) {
				
		Integer arr[] = {10,5,20,15,30,25};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}




