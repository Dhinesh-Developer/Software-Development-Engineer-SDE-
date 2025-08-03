package com.arise.MethodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {

	public static int addition(int a,int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		// 1. Method reference to a static method
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4)); //2.0

		//using the method references
		Function<Integer,Double> functionMethodRef = Math::sqrt;
		System.out.println(functionMethodRef.apply(4)); // 2.0
		
		//lambda expression for static method
		BiFunction<Integer, Integer, Integer> biFuntionalLambda = (a,b) -> MethodReferenceDemo.addition(a,b);
		System.out.println(biFuntionalLambda.apply(10, 20)); // 30
		
		//using the method references
		BiFunction<Integer, Integer, Integer> biFunctionalMethodRef = MethodReferenceDemo::addition;
		System.out.println(biFunctionalMethodRef.apply(10, 20)); //30
	}

}
