package com.jlcindia.binarysearchtrees;

import java.util.TreeSet;

public class Lab1 {
	public static void main(String[] args) {
		
		TreeSet<Integer> myset = new TreeSet<Integer>();
		myset.add(25);
		myset.add(20);
		myset.add(30);
		myset.add(15);
		myset.add(23);
		myset.add(28);
		myset.add(35);
		
		System.out.println(myset);
		System.out.println("--------------");

		for(int x:myset)
			System.out.print(x+"\t");
		
		System.out.println("\n--------------");
		
		System.out.println(myset.contains(28));
		System.out.println(myset.contains(27));
		
		myset.remove(15);
		System.out.println(myset);
		System.out.println("\n--------------");
		System.out.println(myset.first());
		System.out.println(myset.last());
		System.out.println(myset.lower(23));
		System.out.println(myset.higher(28));
		System.out.println(myset.floor(24));
		System.out.println(myset.ceiling(24));
	
	}
}
