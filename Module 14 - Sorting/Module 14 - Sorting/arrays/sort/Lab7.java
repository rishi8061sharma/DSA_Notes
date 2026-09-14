package com.jlcindia.arrays.sort;

import java.util.Arrays;
import java.util.Comparator;

class MyMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return (int) (stu1.marks-stu2.marks);
	}
	
}
class Student implements Comparable<Student>{
	
	int sid;
	String sname;
	double marks;
	
	public Student() {}
		
	public Student(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "[" + sid + ", " + sname + ", " + marks + "]";
	}

	@Override
	public int compareTo(Student stu) {
		return this.sid-stu.sid;
	}

		
}
public class Lab7{
	
	public static void main(String[] args) {
				
		Student stu1 = new Student(102,"sd",70);
		Student stu2 = new Student(103,"ds",60);
		Student stu3 = new Student(101,"sri",50);
		
		Student students[] = {stu1,stu2,stu3};
		
		Arrays.sort(students);
		
		for(Student stu:students) {
			System.out.println(stu);
		}
		
	Arrays.sort(students,new MyMarksComparator());
		
	for(Student stu:students) {
		System.out.println(stu);
	}
	
		
	}
}




