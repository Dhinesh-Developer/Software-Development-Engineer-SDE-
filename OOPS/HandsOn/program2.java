package Day4.HandsOn;

import java.util.Scanner;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int _id,String _name,double _salary) {
		id = _id;
		name = _name;
		salary = _salary;
	}
	
	public double calculateYearlySalary(double monthlySalary) {
		return monthlySalary * 12;
	}
	
	public double calculateYearlySalary(double dailySalary, int workingDays) {
		return dailySalary * workingDays;
	}
	
	public double calculateYearlySalary(int workingDays, double hourlySalary,int hoursPerDay) {
		return workingDays * hoursPerDay * hourlySalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}


public class program2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ID");
		int id = in.nextInt();
		System.out.println("Enter The name");
		String name = in.next();
		System.out.println("Enter the salary");
		double salary = in.nextDouble();
		
		Employee emp = new Employee(id,name,salary);
		
		double salary1 = emp.calculateYearlySalary(100000.0);
		System.out.println("Yearly salary (Monthly basics): "+salary1);
		
		double salary2 = emp.calculateYearlySalary(500.0, 250);
        System.out.println("Yearly Salary (Daily basis): " + salary2);

        double salary3 = emp.calculateYearlySalary(250, 100.0, 8);
        System.out.println("Yearly Salary (Hourly basis): " + salary3);
        
        System.out.println(emp);
			
		
	}

}

/**
Enter the ID
1
Enter The name
kumar
Enter the salary
100000
Yearly salary (Monthly basics): 1200000.0
Yearly Salary (Daily basis): 125000.0
Yearly Salary (Hourly basis): 200000.0
Employee [id=1, name=kumar, salary=100000.0]

*/
