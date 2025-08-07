package com.arise.principles;

/*
  DRY -> Don't repeat yourself.
      It means that each piece of knowledge or logic should have a single, unambiguous representation within the system.
 * */
class AreaCalulator{
	public static int calculateArea(int length,int width) {
		return length * width;
	}
}

public class Dry {

	public static void main(String[] args) {
		/* identified repeatitive code -> use DRY principle.
		int length1 = 10,width1 = 5;
		int area1 = length1 * width1;
		System.out.println(area1);
		
		int length2 = 8,width2 = 2;
		int area2 = length2 * width2;
		System.out.println(area2);
		 * */
		
		// Using the DRY principle.
		
		int area1 = AreaCalulator.calculateArea(10, 5);
		int area2 = AreaCalulator.calculateArea(8, 4);
	}

}
