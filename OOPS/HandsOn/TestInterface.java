package Day5;

import java.util.Scanner;

interface Shapes{
	public static final double PI = 3.14;
	double DEFAULT_VALUE = 1.0;
	double calculateArea();
	double CalculatePerimeter();
	default String getDescription() {
		return "A shape with unspecified Dimensions";
	}
}

class Circles implements Shapes{
	
	public double radius;
	
	public Circles(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	@Override
	public double CalculatePerimeter() {
		return 2  * PI * radius;
	}
	
}

class Rectangles implements Shapes{
	
	public double length;
	public double width;
	
	public Rectangles (double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double CalculatePerimeter() {
		return 2 + (length + width);
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius");
		float radius = in.nextFloat();
		
		System.out.println("Area and perimeter of a Circle");
		Shapes circle = new Circles(radius);
		System.out.println(circle.calculateArea());
		System.out.println(circle.CalculatePerimeter());
		
		System.out.println("Enter the Length of the Rectangle");
		float length = in.nextFloat();
		System.out.println("Enter the width of the Rectangle");
		float width = in.nextFloat();
		
		System.out.println("Area and perimeter of a Rectangle");
		Shapes rect = new Rectangles(length,width);
		System.out.println(rect.calculateArea());
		System.out.println(rect.CalculatePerimeter());
		
		in.close();
		
	}
}
/** output
Enter the Radius
5
Area and perimeter of a Circle
78.5
31.400000000000002
Enter the Length of the Rectangle
4.5
Enter the width of the Rectangle
7.6
Area and perimeter of a Rectangle
34.19999957084656
14.099999904632568
 */
