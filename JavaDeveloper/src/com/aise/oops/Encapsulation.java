package com.aise.oops;

import java.util.Scanner;

class ATM{
	
	private int accountNumber;
	private int password;
	
	public void setAccountNumber(int _accountNumber) {
		accountNumber = _accountNumber;
	}
	
	public void setPassword(int _password) {
		password = _password;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getPassword() {
		return password;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		int _accountNumber = in.nextInt();
		
		System.out.println("Enter the Password");
		int _password = in.nextInt();
		
		atm.setAccountNumber(_accountNumber);
		atm.setPassword(_password);
		
		System.out.println(atm.getAccountNumber());
		System.out.println(atm.getPassword());
		
		in.close();
	}

}
