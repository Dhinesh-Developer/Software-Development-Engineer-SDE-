package com.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringOccurence{
	
	static Scanner in = new Scanner(System.in);
	static Map<Character,Integer> map= new HashMap<Character,Integer>();
	public static  String s;
	 public void validate() {
		 System.out.println("Enter the String");
		  s = in.next();
		  
		  for(int i=0;i<s.length();i++) {
			  char ch = s.charAt(i);
			  if(map.containsKey(ch)) {
				  map.put(ch, map.get(ch)+1);
			  }else {
				  map.put(ch, 1);
			  }
		  }
		  
		  for(Map.Entry<Character, Integer> x : map.entrySet()) {
			  System.out.println(x.getKey()+" "+x.getValue());
		  }
		  
		  in.close();
	 }
		  
}

public class program3 {

	public static void main(String[] args) {
		
		StringOccurence s = new StringOccurence();
		s.validate();
	}

}
