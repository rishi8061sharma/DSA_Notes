package com.jlcindia.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab8 {
	
	public static void main(String[] args) {
				
		List<Integer> mylist = new ArrayList<>();
		mylist.add(10);
		mylist.add(5);
		mylist.add(20);
		mylist.add(25);
		mylist.add(15);
		
		Collections.sort(mylist);		
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());		
		System.out.println(mylist);
		
	}
}




