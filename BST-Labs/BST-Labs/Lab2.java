package com.jlcindia.binarysearchtrees;

import java.util.TreeMap;

public class Lab2 {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> mymap = new TreeMap<Integer,String>();
		mymap.put(25,"25");
		mymap.put(20,"20");
		mymap.put(30,"30");
		mymap.put(15,"15");
		mymap.put(23,"23");
		mymap.put(28,"28");
		mymap.put(35,"35");
		
		System.out.println(mymap);
		System.out.println("--------------");

			
		System.out.println(mymap.containsKey(28));
		System.out.println(mymap.containsKey(27));
		
		mymap.remove(15);
		System.out.println(mymap);
		System.out.println("--------------");
		System.out.println(mymap.firstKey());
		System.out.println(mymap.lastKey());
		
		System.out.println(mymap.ceilingKey(24));
		System.out.println(mymap.floorKey(24));
		System.out.println(mymap.lowerKey(25));
		System.out.println(mymap.higherKey(25));
		
		System.out.println(mymap.ceilingEntry(24));
		System.out.println(mymap.floorEntry(24));
		System.out.println(mymap.lowerEntry(25));
		System.out.println(mymap.higherEntry(25));

	}
}
