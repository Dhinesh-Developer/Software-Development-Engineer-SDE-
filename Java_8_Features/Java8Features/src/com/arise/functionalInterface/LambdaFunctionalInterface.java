package com.arise.functionalInterface;

// java.util.function package is introduced in java8 -> functional interface provide target types for lambda
// expressions and method references.

@FunctionalInterface
interface Shape{
	void draw();
}

// traditional way to implement the functional interface
class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("rectangle draw method");
	}
	
}

public class LambdaFunctionalInterface {

	public static void main(String[] args) {
		
		// lambda expression to implements the functional interface.
//		lambda expression is a anoyomous function which does not belong to class or object.
		Shape rectanlge = () ->  System.out.println("rectangle draw method");
		rectanlge.draw();
		
		
	}

}

