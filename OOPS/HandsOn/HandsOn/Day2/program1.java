package Day2;

import java.util.Scanner;

class Rectangle{
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {
	}
	
	public Rectangle(float length,float width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * (length+width);
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}

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
