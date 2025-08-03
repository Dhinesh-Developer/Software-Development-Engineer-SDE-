package com.arise.MethodReferences;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		//3. References to the instance method of an arbitrary object
		
		// Sometimes, we call a method of argument in the lambda expression.
		// In that case, we can use a method references to call an instance.
		// method of an arbitrary object of a specific class.
		
	
		Function<String,String> stringFunction = (String input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("Dhinesh kumar"));//dhinesh kumar
		
		Function<String,String> stringFunctionMethodReferences = String::toLowerCase;
		System.out.println(stringFunctionMethodReferences.apply("KUMAR")); //kumar
		
		String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};
		
		// using the lambda expression.
		Arrays.sort(strArray, (s1,s2) -> s1.compareToIgnoreCase(s2));
		
		// using the method references.
		Arrays.sort(strArray, String::compareToIgnoreCase);
	}

}
