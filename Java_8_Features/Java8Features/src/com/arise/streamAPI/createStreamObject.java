package com.arise.streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class createStreamObject {

	public static void main(String[] args) {
		
		// stream of array.
		
		Stream<String> stream = Stream.of("a","b","c");
		stream.forEach(System.out::println); //abc
		
		// create a stream from sources
		Collection<String> collection = Arrays.asList("JAVA","J2EE","spring","Hibernate");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		List<String> list = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		String[] arr = {"a","b","c"};
		Stream<String> stream5 = Arrays.stream(arr);
		stream5.forEach(System.out::println);
	}

}
