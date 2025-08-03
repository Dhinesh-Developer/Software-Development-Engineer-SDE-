package com.arise.functionalInterface;

// Belong to java.lang package.

// Functional Interface is an interface which contains only one abstract methods.
// my default public static abstract ->prefix as belongs to methods.
// can contains any number of static and default methods.

@FunctionalInterface
public interface MyfunctionalInterface {
	void print(String msg);
	
	default void m1() {
		System.out.println("default method");
	}
	
	static void m2() {
		System.out.println("static method.");
	}
}
