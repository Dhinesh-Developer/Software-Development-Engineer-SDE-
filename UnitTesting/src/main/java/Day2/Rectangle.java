package Day2;

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