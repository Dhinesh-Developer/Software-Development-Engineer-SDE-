package Day2;

import java.util.Scanner;

class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return firstName +" " +lastName;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int SetRaiseSalary(int percent) {
		int newSalary = (salary + ((salary * percent)/100));
		return newSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
}

public class program2 {

	public static void main(String[] args) {
		
		// Getting input from the user.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String _firstName = in.nextLine();
		System.out.println("Enter the last name");
		String _lastName = in.nextLine();
		System.out.println("Enter the salary");
		int _salary = in.nextInt();
		System.out.println("Enter the bonus Amount in percent");
		int _bonus = in.nextInt();
		System.out.println("Enter the id");
		int _id = in.nextInt();
		
		// setting the user input
		Employee emp = new Employee(_id,_firstName,_lastName,_salary);
		
		// displaying the user input.
		System.out.println("Employee Details");
		System.out.println("Id "+emp.getId()+" FirstName "+emp.getFirstName()+" LastName "+emp.getLastName()+" Salary "+emp.getSalary());
		System.out.println("Annual Salary : "+emp.getAnnualSalary());
		System.out.println("Bonus Salary "+emp.SetRaiseSalary(_bonus));
		
		in.close();
	}

}

/* --------- output :----------
 * Enter the first name
kumar
Enter the last name
dk
Enter the salary
100000
Enter the bonus Amount in percent
10
Enter the id
101
Employee Details
Id 101 FirstName kumar LastName dk Salary 100000
Annual Salary : 1200000
Bonus Salary 110000
*/
