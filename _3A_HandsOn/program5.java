package _3A_HandsOn;

import java.util.Scanner;

interface Taxable {
    double calculateTax();
}

class SalaryIncome implements Taxable {
    private double salary;

    public SalaryIncome(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateTax() {
        return 0.10 * salary;
    }
}

class BusinessIncome implements Taxable {
    private double profit;

    public BusinessIncome(double profit) {
        this.profit = profit;
    }

    @Override
    public double calculateTax() {
        return 0.20 * profit;
    }
}

class FreelanceIncome implements Taxable {
    private double income;

    public FreelanceIncome(double income) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return 0.15 * income;
    }
}

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary income: ");
        double salary = sc.nextDouble();
        Taxable salaryIncome = new SalaryIncome(salary);
        System.out.println("Salary Tax: " + salaryIncome.calculateTax());

        System.out.print("\nEnter business profit: ");
        double profit = sc.nextDouble();
        Taxable businessIncome = new BusinessIncome(profit);
        System.out.println("Business Tax: " + businessIncome.calculateTax());

        System.out.print("\nEnter freelance income: ");
        double freelance = sc.nextDouble();
        Taxable freelanceIncome = new FreelanceIncome(freelance);
        System.out.println("Freelance Tax: " + freelanceIncome.calculateTax());

        sc.close();
    }
}
