package com.aise.oops;
/*
 * object also called as instance.
 * UML -> unified Modeling language.
 * instance block also called as object members
 * static variables also class as class members
 * instantiation means creating the object.
 * 
 *  acquiring the properties and Behaviour of an class by another class.
 *  
 *  Advantages 
 *  code resuability
 *  profit will gradually increase
 *  
 *  Types
 *  single , multi-level, hierarchical, hybrid , cyclic, multiple
 * */

class Parent{
	
	void readBooks() {
		System.out.println("I will read Books");
	}
}

class Child extends Parent{
	
}
public class Inheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.readBooks();
	}

}
/*I will read Books*/
