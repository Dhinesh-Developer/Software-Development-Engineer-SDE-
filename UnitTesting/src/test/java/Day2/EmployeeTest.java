package Day2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EmployeeTest {
	
	Employee emp;


	@BeforeEach
	public void setUp() {
		 emp = new Employee(101,"first","last",5000);
	}
	
	@Test
	public void testGetId() {
		assertEquals(101,emp.getId());
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("first",emp.getFirstName());
	}
	
	@Test
	public void testGetLastName() {
		assertEquals("last",emp.getLastName());
	}
	
	@Test
	public void testGetName() {
		assertEquals("first last",emp.getName());
	}
	
	@Test
	public void testSetRaiseSalary() {
		int raisedSalary = emp.SetRaiseSalary(10);
		assertEquals(5500,raisedSalary);
	}
	
	@Test
	public void testGetAnnualSalary() {
		assertEquals(60000,emp.getAnnualSalary());
	}
	
	@ParameterizedTest
	@CsvSource({
		"102, dhinesh, kumar, 100000",
		"103, sakthi, vel ,70000",
		"104, shrithij, kumar, 200000"
	})
	public void testEmployeeDetails(int id, String first, String last, int salary) {
		emp = new Employee(id,first,last,salary);
		assertEquals(id,emp.getId());
		assertEquals(first,emp.getFirstName());
		assertEquals(last,emp.getLastName());
		assertEquals(salary,emp.getSalary());
		
	}
	
	
}
