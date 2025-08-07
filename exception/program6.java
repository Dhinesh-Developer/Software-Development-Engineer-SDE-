package com.exception;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class program6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Alice",82);
		map.put("Bob", 67);
		map.put("Charlie", 91);
		map.put("Diana", 74);
		map.put("Ethan", 88);
		
		Stack<String> st = new Stack<String>();
		for(Map.Entry<String, Integer> x : map.entrySet()) {
			if(x.getValue() >=75) {
				st.add(x.getKey());
			}
		}
		
		ListIterator<String> itr = st.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		in.close();
	}

}
