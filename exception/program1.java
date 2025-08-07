package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class InvalidMultiplicationException extends Exception {
    public InvalidMultiplicationException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class program1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine();
            if (!input1.matches("-?\\d+(\\.\\d+)?")) {
                throw new InvalidNumberException("Invalid input! First number is not numeric.");
            }
            double num1 = Double.parseDouble(input1);

            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine();
            if (!input2.matches("-?\\d+(\\.\\d+)?")) {
                throw new InvalidNumberException("Invalid input! Second number is not numeric.");
            }
            double num2 = Double.parseDouble(input2);

            System.out.print("Enter operation (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    if (num1 == 0 || num2 == 0 || num1 == 1 || num2 == 1) {
                        throw new InvalidMultiplicationException("Invalid multiplication: values should not be 0 or 1.");
                    }
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 == 0) {
                        throw new DivisionByZeroException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid operation! Please use +, -, *, /.");
            }
        } catch (InvalidNumberException | InvalidMultiplicationException | DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
