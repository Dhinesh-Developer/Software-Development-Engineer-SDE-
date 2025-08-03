package com.arise.defaultAndStaticMethodsInInterfaces;
// preserve the backward comparability.

interface Vehicle{
	String getBrand();
	String speedUp();
	String slowDown();
	
	default String turnAlarmOn() {
		return "turning vehicle alarm on";
	}
	
	default String turnAlramOff() {
		return "turning vehicle alarm off";
	}
	
	static String getCompany() {
		return "BMW";
	}
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "the car is speeding up";
	}

	@Override
	public String slowDown() {
		return "the car is slowing down";
	}
	
}
public class DefaultDemo {
	
	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println(v.getBrand());
		System.out.println(v.speedUp());
		System.out.println(v.slowDown());
		System.out.println(v.turnAlarmOn());
		System.out.println(v.turnAlramOff());
		
//		calling the static methods present in the interface
		System.out.println(Vehicle.getCompany()); //BMW
	}
}
/*
BMW
the car is speeding up
the car is slowing down
turning vehicle alarm on
turning vehicle alarm off 
 
 * */
