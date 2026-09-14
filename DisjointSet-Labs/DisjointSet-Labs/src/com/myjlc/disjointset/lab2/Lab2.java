package com.myjlc.disjointset.lab2;

public class Lab2 {
	public static void main(String[] args) {
		MyDisjointSet myset = new MyDisjointSet(5);
		
		System.out.println(myset.find(1));
		System.out.println(myset.find(2));
		myset.union(2, 3);
		myset.union(1,3);
		myset.union(1,3);
		System.out.println(myset.find(1));
		System.out.println(myset.find(2));
	}
}
