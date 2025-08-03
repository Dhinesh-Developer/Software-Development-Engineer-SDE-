package com.arise.functionalInterface;
//java.util.function package is introduced in java8 -> functional interface provide target types for lambda
//expressions and method references.

import java.util.function.Function;

// Example -> Function<T,R> // frequently used functional function interface.
//T -> the function argument
//R -> return the function result.


//Traditional Way.
class FunctionImpl implements Function<String,Integer> {
	
	@Override
	public Integer apply(String s) {
		return s.length();
	}
}

public class predefinedFuntionalInterface {

	public static void main(String[] args) {
		// Traditional Way.
//		FunctionImpl functionImpl = new FunctionImpl();
//		System.out.println(functionImpl.apply("Kumar")); //5
		
//		using the lambda Expression.
		Function<String,Integer> function = (String s) -> {
			return s.length();
		};
		System.out.println(function.apply("kumar")); //5.
		
	}

}
