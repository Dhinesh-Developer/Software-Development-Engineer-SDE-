package com.aise.oops;

/* ---order of execution---
 * static variable
 * static block
 * main() method
 * instance block
 * constructor
 * instance variable
 * instance Method
 * 
 * */

class Test{
	
	static int a,b;
	
	static {
		a = 100;
		b = 200;
		System.out.println("Inside static block");
	}
	
	static void disp1() {
		System.out.println("Inside static Method");
	}
	
	int x,y;
	
	{
		x = 300;
		y = 400;
		System.out.println("Inside instance block");
	}
	
	void disp2() {
		System.out.println("Inside instance Method");
	}
}

public class Static {

	public static void main(String[] args) {
		
		Test.disp1();
		Test _test = new Test();
		_test.disp2();
	}
}
/*
Inside static block
Inside static Method
Inside instance block
Inside instance Method

 * */
 