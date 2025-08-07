package com.exception;

import java.util.Scanner;

class InvalidTransactionException extends Exception{
	private static final long serialVersionUID = 1L;

	public String getMessage(String message) {
		return message;
	}
}

class Bank{
	private int balance = 5000;
	
	public void deposit(int amount) {
		if(amount <=0 ) {
			InvalidTransactionException it = new InvalidTransactionException();
			System.out.println(it.getMessage("Transaction Failed: Amount must be greater than zero."));
		}else {
			balance += amount;
			System.out.println("Transaction seuccess: remaining Balance "+balance);
		}
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			InvalidTransactionException it = new InvalidTransactionException();
			System.out.println(it.getMessage("Transaction Failed: Withdrawal amount exceeds current balance."));
		}else {
			balance -=amount;
			System.out.println("Transaction seuccess: remaining Balance "+balance);
		}
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [balance=" + balance + "]";
	}
	
	
}

public class program2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter transaction type (deposit/withdraw): ");
		String _choosen = in.next();
		
		Bank _bank = new Bank();
		
		System.out.println("Enter amount: ");
		int _amount = in.nextInt();
		
		if(_choosen.equals("withdraw")) {
			_bank.withdraw(_amount);
		}else if(_choosen.equals("deposit")) {
			_bank.deposit(_amount);
		}
		
		in.close();
		
	}

}
