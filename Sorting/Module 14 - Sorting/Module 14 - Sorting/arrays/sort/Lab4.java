package com.jlcindia.arrays.sort;

import java.util.Arrays;
import java.util.Comparator;

class MyIntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		return b-a;
	}
	
}
public class Lab4{
	
	public static void main(String[] args) {
				
		Integer arr[] = {10,5,20,15,30,25};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new MyIntegerComparator());
		System.out.println(Arrays.toString(arr));
	}
}




