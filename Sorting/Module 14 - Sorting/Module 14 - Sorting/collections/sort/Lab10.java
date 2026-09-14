package com.jlcindia.collections.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		return (int) (stu1.marks - stu2.marks);
	}

}

class Student implements Comparable<Student> {

	int sid;
	String sname;
	double marks;

	public Student() {
	}

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
		return this.sid - stu.sid;
	}

}

public class Lab10 {

	public static void main(String[] args) {

		Student stu1 = new Student(102, "sd", 70);
		Student stu2 = new Student(103, "ds", 60);
		Student stu3 = new Student(101, "sri", 50);

		List<Student> students = new ArrayList<>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);

		Collections.sort(students);

		for (Student stu : students) {
			System.out.println(stu);
		}
		System.out.println("-----------------------");

		Collections.sort(students, new MyMarksComparator());

		for (Student stu : students) {
			System.out.println(stu);
		}

	}
}
