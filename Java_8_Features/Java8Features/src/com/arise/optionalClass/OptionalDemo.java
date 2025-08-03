package com.arise.optionalClass;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
//		of,empty,ofNullable -> static methods
		
		
		String email = "dhinesh@gmail.com";
		
		// empty method.
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional); //Optional.empty

		
		// of method -> if email is null  then throw NullPointerException
		Optional<String> of = Optional.of(email);
		System.out.println(of); // checking requireNonNull  Optional[dhinesh@gmail.com]
		
		
		// ofNullable method   if email is null  then don-t throw NullPointerException
		// get() method return the values from optional values. ->if Null then Return NoSuchElementFound exception.
		Optional<Object> ofNullable = Optional.ofNullable(email);
		System.out.println(ofNullable); //Optional[dhinesh@gmail.com]
		System.out.println(ofNullable.get());  //dhinesh@gmail.com 
		
		// isPresent() method.
		if(ofNullable.isPresent()) {
			System.out.println(ofNullable.get());
		}else {
			System.out.println("No value present");
		}
		
		// orElse() method -> to get a default value is value is not present.
		Optional<String> stringOptional = Optional.ofNullable(email);
		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		// orElseGet() method
		String orElseGet = stringOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(orElseGet);
		
		// orElseThrow() method. // if not also this method doesn't throw exception.
		String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));
		System.out.println(optionalObject);
		
		// ifPresent() method. returns the boolean value.
		Optional<String> gender= Optional.of("MALE");
		System.out.println(gender.isPresent()); //true
		
		
		// filter() method.
		String result = " abc ";
		if(result != null && result.contains("abc")) {
			System.out.println(result);// abc
		}
		Optional<String> optionalString1 = Optional.of(result);
		optionalString1.filter(res -> result.contains("abc"))
				.map(String::trim)
				.ifPresent((res) ->System.out.println(res)); //abc

		// Map method in optional provides a way to transform value in optional from one type to another.
		
		
		
	}

}
