package com.arise.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int rating;
	private int salary;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", rating=" + rating + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int rating, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}

public class StreamSortingExample {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		// using stream API to sort the List.
		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
		// stream API to sort in descending order.
		List<String> sortedListReversed = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedListReversed);
		
		//using the Lambda Expression to sort the list in descending order.
		List<String> sortedList1 = fruits.stream().sorted((a1,a2) -> a2.compareTo(a1)).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		// way3 
		List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);
		
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10,"Kumar",30,400000));
		employees.add(new Employee(20,"santhosh",29,350000));
		employees.add(new Employee(30,"karthi",30,450000));
		employees.add(new Employee(40,"dhinesh",29,500000));
		
		// traditional way
		List<Employee> employeeSortedList = employees.stream().sorted(new Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				return (int)(e1.getSalary()-e2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(employeeSortedList);
		
		// using the Lambda Expression. -> in descending order.
		List<Employee> employeeLambda = employees.stream()
				.sorted((Employee e1,Employee e2) -> (int)(e2.getSalary()-e1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(employeeLambda);
		
		List<Employee> employeeComparator = employees.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(employeeComparator);
	}

}
/*
[Apple, Banana, Mango, Orange]
[Orange, Mango, Banana, Apple]
[Orange, Mango, Banana, Apple]
[Apple, Banana, Mango, Orange]
[Employee [id=20, name=santhosh, rating=29, salary=350000], Employee [id=10, name=Kumar, rating=30, salary=400000], Employee [id=30, name=karthi, rating=30, salary=450000], Employee [id=40, name=dhinesh, rating=29, salary=500000]]
[Employee [id=40, name=dhinesh, rating=29, salary=500000], Employee [id=30, name=karthi, rating=30, salary=450000], Employee [id=10, name=Kumar, rating=30, salary=400000], Employee [id=20, name=santhosh, rating=29, salary=350000]]
[Employee [id=20, name=santhosh, rating=29, salary=350000], Employee [id=10, name=Kumar, rating=30, salary=400000], Employee [id=30, name=karthi, rating=30, salary=450000], Employee [id=40, name=dhinesh, rating=29, salary=500000]]

 * */
