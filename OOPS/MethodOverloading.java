package Day4;

class AreaCalculator {
    public static final double PI = 3.14;

    // Area of Circle
    public double area(int radius) {
        return PI * radius * radius;
    }

    // Area of Rectangle
    public int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of Triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Square
    public double area(float side) {
        return side * side;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        AreaCalculator ac = new AreaCalculator();

        System.out.println("Area of Circle: " + ac.area(7));                    
        System.out.println("Area of Rectangle: " + ac.area(5, 10));            
        System.out.println("Area of Triangle: " + ac.area(8.0, 4.0));           
        System.out.println("Area of Square: " + ac.area(6.0f));                
    }
}
/* OUTPUT.
Area of Circle: 153.86
Area of Rectangle: 50
Area of Triangle: 16.0
Area of Square: 36.0
 * */
