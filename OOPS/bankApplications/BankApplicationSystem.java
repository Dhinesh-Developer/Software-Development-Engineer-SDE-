package com.dk.bankApplications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(String toAccount, double amount);
    double checkBalance();
}

abstract class Person {
    protected String id;
    protected String name;
    protected String email;
    protected String phone;

    public Person(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public abstract void displayDetails();

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
}

class Account {
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountType() {
        return accountType;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class Customer extends Person implements BankOperations {
    private String pin;
    private Account account;
    private static List<Customer> allCustomers = new ArrayList<>();

    public Customer(String id, String name, String email, String phone, String pin, Account account) {
        super(id, name, email, phone);
        this.pin = pin;
        this.account = account;
        allCustomers.add(this);
    }

    public String getPin() {
        return pin;
    }

    public Account getAccount() {
        return account;
    }

    public static List<Customer> getAllCustomers() {
        return allCustomers;
    }

    public static Customer getCustomerById(String id) {
        for(Customer x : allCustomers) {
            if(x.getId().equals(id)) {
                return x;
            }
        }
        return null;
    }

    private static Customer getCustomerByAccount(String accountNumber) {
        for(Customer x : allCustomers) {
            if(x.getAccount().getAccountNumber().equals(accountNumber)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        account.displayDetails();
    }

    @Override
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }
        account.deposit(amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }
        if(account.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    @Override
    public void transfer(String toAccount, double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }

        Customer recipient = Customer.getCustomerByAccount(toAccount);
        if(recipient == null) {
            System.out.println("Recipient account not found.");
            return;
        }

        if (account.withdraw(amount)) {
            recipient.getAccount().deposit(amount);
            System.out.println("Transfer successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Transfer failed due to insufficient balance.");
        }
    }

    @Override
    public double checkBalance() {
        return account.getBalance();
    }
}

class Employee extends Person {
    private String position;
    private static List<Employee> allEmployees = new ArrayList<>();

    public Employee(String id, String name, String email, String phone, String position) {
        super(id, name, email, phone);
        this.position = position;
        allEmployees.add(this);
    }

    public static Employee getEmployeeById(String id) {
        for(Employee x : allEmployees) {
            if(x.getId().equals(id)) {
                return x;
            }
        }
        return null;
    }

    public static List<Employee> getAllEmployees() {
        return allEmployees;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public void createCustomer(Scanner scanner) {
        System.out.println("\n--- Create New Customer ---");
        System.out.print("Enter Customer ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Set PIN (4 digits): ");
        String pin = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        Account account = new Account(accountNumber, balance, accountType);
        new Customer(id, name, email, phone, pin, account);
        System.out.println("Customer created successfully!");
    }

    public void viewAllCustomers() {
        System.out.println("\n--- All Customers ---");
        List<Customer> customers = Customer.getAllCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        for (Customer customer : customers) {
            customer.displayDetails();
            System.out.println("-----------------------");
        }
    }
}

public class BankApplicationSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeSampleData();
        
        while (true) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Employee Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    employeeLogin();
                    break;
                case "2":
                    customerLogin();
                    break;
                case "3":
                    System.out.println("Exiting system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeSampleData() {
        new Employee("emp001", "John Doe", "john@bank.com", "1234567890", "Manager");
        new Employee("emp002", "Jane Smith", "jane@bank.com", "0987654321", "Teller");
        
        Account acc1 = new Account("ACC1001", 5000.0, "Savings");
        new Customer("cust001", "Alice Johnson", "alice@email.com", "1112223333", "1234", acc1);
        
        Account acc2 = new Account("ACC1002", 3000.0, "Checking");
        new Customer("cust002", "Bob Williams", "bob@email.com", "4445556666", "5678", acc2);
    }

    private static void employeeLogin() {
        System.out.println("\n--- Employee Login ---");
        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();
        
        Employee employee = Employee.getEmployeeById(id);
        if (employee != null) {
            System.out.println("\nWelcome, " + employee.getName() + "!");
            employeeMenu(employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void employeeMenu(Employee employee) {
        while (true) {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Create New Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. View My Details");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    employee.createCustomer(scanner);
                    break;
                case "2":
                    employee.viewAllCustomers();
                    break;
                case "3":
                    employee.displayDetails();
                    break;
                case "4":
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void customerLogin() {
        System.out.println("\n--- Customer Login ---");
        System.out.print("Enter Customer ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        
        Customer customer = Customer.getCustomerById(id);
        if (customer != null && customer.getPin().equals(pin)) {
            System.out.println("\nWelcome, " + customer.getName() + "!");
            customerMenu(customer);
        } else {
            System.out.println("Invalid ID or PIN.");
        }
    }

    private static void customerMenu(Customer customer) {
        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. View My Details");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter amount to deposit: ");
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        customer.deposit(amount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount. Please enter a number.");
                    }
                    break;
                case "2":
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        customer.withdraw(amount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount. Please enter a number.");
                    }
                    break;
                case "3":
                    System.out.print("Enter recipient account number: ");
                    String toAccount = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        customer.transfer(toAccount, amount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount. Please enter a number.");
                    }
                    break;
                case "4":
                    System.out.println("Your current balance: " + customer.checkBalance());
                    break;
                case "5":
                    customer.displayDetails();
                    break;
                case "6":
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}