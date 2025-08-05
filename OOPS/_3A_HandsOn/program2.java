package _3A_HandsOn;

abstract class Employee {
    protected String name;
    protected int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("-----------------------------");
    }
}

class FullTimeEmployee extends Employee {
    private double fixedMonthlySalary;

    public FullTimeEmployee(String name, int empId, double fixedMonthlySalary) {
        super(name, empId);
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    public double calculateSalary() {
        return fixedMonthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class program2 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 1001, 50000);

        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 2001, 120, 200);

        fullTimeEmp.displayInfo();
        partTimeEmp.displayInfo();
    }
}
