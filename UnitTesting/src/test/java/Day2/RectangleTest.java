package Day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RectangleTest {
	
	@Test
	public void testDefaultConstructor() {
		Rectangle rect = new Rectangle();
		assertEquals(1.0f, rect.getLength());
		assertEquals(1.0f, rect.getWidth());
	}
	
	@Test
	public void testParameterizedConstructor() {
		Rectangle rect = new Rectangle(4.5f,2.0f);
		assertEquals(4.5f,rect.getLength());
		assertEquals(2.0f,rect.getWidth());
	}
	
	@Test
	public void testArea() {
		Rectangle rect = new Rectangle(4.0f,3.0f);
		assertEquals(12.0,rect.getArea());
	}

	@Test
	public void testPerimeter() {
		Rectangle rect1 = new Rectangle(5,10);
		assertEquals(50.0,rect1.getArea());
		Rectangle rect = new Rectangle(4.0f,3.0f);
		assertEquals(14.0f,rect.getPerimeter());
		
	}
	
	@ParameterizedTest
	@CsvSource({
	    "5, 10, 50",
	    "3, 4, 12",
	    "0, 7, 0"
	})
	void testRectangleArea(int width, int height, int expectedArea) {
	    Rectangle r = new Rectangle(width, height);
	    assertEquals(expectedArea, r.getArea());
	}

	
}
