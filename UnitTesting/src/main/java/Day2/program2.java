package Day2;

import java.util.Scanner;


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
