package Day4.HandsOn;

class Circle{
	private double radius;
	private String color = "red";
	public static final double PI = 3.14;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}

class Cylinder extends Circle{
	
	private double height = 1.0;
	
	public Cylinder() {
	}
	
	Cylinder(double radius){
		setRadius(radius);
	}
	
	Cylinder(double radius,double height){
		super(radius);
		this.height = height;
	}
	
	Cylinder(double radius,double height,String color){
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return PI * getRadius() * getRadius() * height;
	}
	
}

public class program1 {

	public static void main(String[] args) {
		
		 // Testing circle
        Circle c1 = new Circle(); 
        c1.setRadius(5);
        c1.setColor("blue");
        System.out.println("Circle Radius: " + c1.getRadius());
        System.out.println("Circle Color: " + c1.getColor());
        System.out.println("Circle Area: " + c1.getArea());
        System.out.println(c1); 

        System.out.println("----------------------");

        // testing cylinder
        Cylinder cy1 = new Cylinder();
        cy1.setRadius(4);
        cy1.setHeight(10);
        System.out.println("Cylinder Radius: " + cy1.getRadius());
        System.out.println("Cylinder Height: " + cy1.getHeight());
        System.out.println("Cylinder Volume: " + cy1.getVolume());

        System.out.println("----------------------");

        Cylinder cy2 = new Cylinder(3.0, 7.0, "green");
        System.out.println("Radius: " + cy2.getRadius());
        System.out.println("Height: " + cy2.getHeight());
        System.out.println("Color: " + cy2.getColor());
        System.out.println("Volume: " + cy2.getVolume());
		
	}

}
/* -------------------- OUTPUT ---------------------
Circle Radius: 5.0
Circle Color: blue
Circle Area: 78.5
Circle [radius=5.0, color=blue]
----------------------
Cylinder Radius: 4.0
Cylinder Height: 10.0
Cylinder Volume: 502.40000000000003
----------------------
Radius: 3.0
Height: 7.0
Color: green
Volume: 197.82

 * */
