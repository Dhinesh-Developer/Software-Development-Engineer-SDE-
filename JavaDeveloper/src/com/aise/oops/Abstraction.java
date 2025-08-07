package com.aise.oops;
/**
 * Hiding the implementation details and showing only the necessary details.
 * 
 * pure and impure abstraction.
 * 
 * 
 */
// three way to use a abstract class and Methods
abstract class Demo{
	
	abstract void disp();
}

abstract class Demo1{
	void disp() {
		
	}
	abstract void disp1();
}

abstract class Demo2{
	void disp() {
		
	}
	
	void displ() {
		
	}
}

abstract class parent{
	abstract void readBooks();
}

abstract class test extends parent{
	
	
}

class test1 extends parent{

	@Override
	void readBooks() {
		System.out.println("I read books");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		
	}

}
