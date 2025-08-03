package com.arise.MethodReferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		//4. References to a constructor.
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Mango");
		
//		Using the Lambda Expression.
		Function<List<String>,Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList); 
		System.out.println(setFunction.apply(fruits));
		
//		Method references
		Function<List<String>,Set<String>> setFunctionMethodRef = HashSet::new; 
		System.out.println(setFunctionMethodRef.apply(fruits));
	}

}
