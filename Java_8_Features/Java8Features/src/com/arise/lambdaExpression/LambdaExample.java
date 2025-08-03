package com.arise.lambdaExpression;


interface Shape{
	void draw();
}

//class Rectangle implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("Rectangle class draw method");
//	}
//}

//class Square implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("Square class draw method");
//	}
//}
//
//class Circle implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("Circle class draw method");
//	}
//}
public class LambdaExample {
	public static void main(String[] args) {
		
		String str = "hello";
		
		// lambda expression. // in single line. if one statement in method.
		Shape rectangle = () -> System.out.println("Rectangle class draw method");
//		rectangle.draw();
		
		// lambda expression. // if in block line. if more than one statement in method.
		Shape square = () -> {
			System.out.println("Square class draw method");
		};
		
		Shape circle = () -> {
			System.out.println("Circle class draw method");
		};
		
		print(rectangle);
		print(square);
		print(circle);
		
		/*Actual look Functional programming*/ 
		print(()-> System.out.println("Rectangle class draw method"));
		print(()-> System.out.println("Square class draw method"));
		print(()-> System.out.println("Circle class draw method"));
	}
	
	
	private static void print(Shape shape) {
		shape.draw();
	}
}

/* OUTPUT.
Rectangle class draw method
Square class draw method
Circle class draw method
 * */


