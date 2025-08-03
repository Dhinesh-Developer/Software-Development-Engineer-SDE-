package com.arise.defaultAndStaticMethodsInInterfaces;
// default methods.

interface Shape{
	void draw();
	
	// used for backward compatibility.
	default void m1() {
		System.out.println("m1 default method");
	}
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle class draw method");
	}
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square class draw method");
	}
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle class draw method");
	}
}


public class defaultAndStaticMethods {

	public static void main(String[] args) {

	}

}
