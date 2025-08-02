package Day5;

import java.util.Scanner;

abstract class Shape{
	public static final float PI = 3.14f;
		
	public void draw() {
		System.out.println("Draw is a method belongs to a Shape class");
	};
	
	public abstract float area();
	public abstract float perimeter();
	
 
}

class Circle extends Shape{
	
	public float radius;
	
	Circle(float radius){
		this.radius = radius;
	}
	

	@Override
	public float area() {
		return PI * radius * radius;
	}

	@Override
	public float perimeter() {
		return 2 * PI * radius * radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}

class Rectangle extends Shape{
	
	public float length;
	public float width;
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public float area() {
		
		return length * width;
	}

	@Override
	public float perimeter() {
		return 2 + (length * width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
		
}

public class TesterAbstractClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius");
		float radius = in.nextFloat();
		
		System.out.println("Area and perimeter of a Circle");
		Shape circle = new Circle(radius);
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		
		System.out.println("Enter the Length of the Rectangle");
		float length = in.nextFloat();
		System.out.println("Enter the width of the Rectangle");
		float width = in.nextFloat();
		
		System.out.println("Area and perimeter of a Rectangle");
		Shape rect = new Rectangle(length,width);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		
		in.close();
	}

}
/* output
Enter the Radius
5
Area and perimeter of a Circle
78.5
157.0
Enter the Length of the Rectangle
4.5
Enter the width of the Rectangle
7.6
Area and perimeter of a Rectangle
34.2
36.2*/
