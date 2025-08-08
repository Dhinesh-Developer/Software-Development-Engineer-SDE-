package com.Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


class Student{
	Integer rno;
	String name;
	String dept;

	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student(Integer rno, String name, String dept) {
		super();
		this.rno = rno;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", dept=" + dept + "]";
	}


}

// based on the name
class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

// Based on the department
class MyComparator1 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.dept.compareTo(o2.dept);
	}
}

// based on the ID
class Mycomparator2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.rno.compareTo(o2.rno);
	}

}
public class ComparatorExample {

	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();
		list.add(new Student(3, "Ezaj","CSE"));
		list.add(new Student(1, "Rahul","IT"));
		list.add(new Student(2, "Arun","TECH"));
		list.add(new Student(4,"Partiban","AI"));
		list.add(new Student(5,"Shrithij","TRAINER"));

		// name
		Collections.sort(list,new MyComparator());
		for(Student x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------------");
		// dept
		Collections.sort(list,new MyComparator1());
		for(Student x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------------");

		// rno
		Collections.sort(list,new Mycomparator2());

		for(Student x : list) {
			System.out.println(x);
		}
	}

}
