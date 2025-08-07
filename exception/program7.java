package com.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
	
	private String firstName;
	private String lastName;
	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}



public class program7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Person> li = new ArrayList<Person>();
	
		System.out.println("How many people do you want to enter? ");
		int n = in.nextInt();
		in.nextLine();
		
		for(int i=1;i<=n;i++) {
			 System.out.print("Enter first name of person " + i + ": ");
	            String firstName = in.nextLine();

	            System.out.print("Enter last name of person " + i + ": ");
	            String lastName = in.nextLine();
	            
	            li.add(new Person(firstName,lastName));
		}
		
		Collections.sort(li,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareToIgnoreCase(o2.getLastName());
			}
			
		});
		
		for(Person x : li) {
			System.out.println(x.getFirstName()+" "+x.getLastName());
		}
		
		in.close();
		
	}

}
