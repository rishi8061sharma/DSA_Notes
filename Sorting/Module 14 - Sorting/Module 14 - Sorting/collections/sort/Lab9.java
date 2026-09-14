package com.jlcindia.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer implements Comparable<Customer>{
	
	int cid;
	String cname;
	long phone;
	
	public Customer() {}
	
	public Customer(int cid, String cname, long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "[" + cid + ", " + cname + ", " + phone + "]";
	}

	@Override
	public int compareTo(Customer cust) {
		return this.cid-cust.cid;
	}
		
}
public class Lab9{
	
	public static void main(String[] args) {
				
		Customer cust1 = new Customer(102,"sd",222);
		Customer cust2 = new Customer(103,"ds",333);
		Customer cust3 = new Customer(101,"sri",111);
		
		List<Customer> customers = new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		
		Collections.sort(customers);
		
		for(Customer cust:customers) {
			System.out.println(cust);
		}
		
		
	}
}




