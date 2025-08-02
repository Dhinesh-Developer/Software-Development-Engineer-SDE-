package Day2;

import java.util.Scanner;



public class program1 {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		
		// Getting the user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Length");
		float length = in.nextFloat();
		System.out.println("Enter the Width");
		float width = in.nextFloat();
		
		// setting the length, width 
		rect.setLength(length);
		rect.setWidth(width);
		
		// displaying the output.
		System.out.println("Length of the Rectangle "+rect.getLength());
		System.out.println("width of the Rectangle "+rect.getWidth());
		System.out.println("Area of the Rectangle "+rect.getArea());
		System.out.println("perimeter of the Rectangle "+rect.getPerimeter());
		
		in.close();
		
	}

}
