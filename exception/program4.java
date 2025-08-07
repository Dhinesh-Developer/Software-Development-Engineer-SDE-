package com.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("How many names");
		int size = in.nextInt();
		
		int cnt = 0;
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter name "+i+ " :");
			String name = in.next();
			al.add(name);
			cnt++;
		}
		
		for(String x : al) {
			if(x.length() >= 5) {
				System.out.println(x);
			}
		}
		
		in.close();
		
		
		
	}

}
