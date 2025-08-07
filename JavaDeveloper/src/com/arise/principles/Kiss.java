package com.arise.principles;

/*
 * KISS -> keep it simple, stupid.
 *      A design should be kept as simple as possible.
 *      complexity should only be introduced when absolutely necessary.
 * */

public class Kiss {
	
	// using the Kiss principle.
	public static boolean isEven(int n) {
		return n%2==0;
	}

	public static void main(String[] args) {
		// program to check if the number is even or not.
		
		/* uses extra variable .adds unnnecessary if-else logic.
		int n = 4;
		boolean isEven = false;
		if(n % 2==0) {
			isEven= true;
		}else {
			isEven= false;
		}
		 * */
		
		
	}

}
