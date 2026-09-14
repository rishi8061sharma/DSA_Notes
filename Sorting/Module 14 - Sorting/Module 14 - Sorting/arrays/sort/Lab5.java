package com.jlcindia.arrays.sort;

import java.util.Arrays;
import java.util.Comparator;

class MyEvenComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer a, Integer b) {
		return a%2-b%2;
	}
}

class MyOddComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer a, Integer b) {
		return b%2-a%2;
	}
}

public class Lab5{
	
	public static void main(String[] args) {
				
		Integer arr[] = {10,5,20,15,30,25};
		
		Arrays.sort(arr,new MyEvenComparator());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new MyOddComparator());
		System.out.println(Arrays.toString(arr));
	}
}




