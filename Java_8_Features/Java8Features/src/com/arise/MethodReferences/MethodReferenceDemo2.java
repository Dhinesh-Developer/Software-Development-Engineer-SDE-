package com.arise.MethodReferences;

@FunctionalInterface
interface Printable{
	void print(String msg);
}
public class MethodReferenceDemo2 {
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		//2. Method references to an instance method of an object
		
		MethodReferenceDemo2 methodReferenceDemo2 = new MethodReferenceDemo2();
		
		// lambda expression
		Printable printable = (msg) -> methodReferenceDemo2.display(msg);
		printable.print("hello world"); //HELLO WORLD
		
		// Method reference -> instance method of an object.
		Printable printableMethodRef = methodReferenceDemo2::display;
		printableMethodRef.print("hello world");//HELLO WORLD
	}

}
