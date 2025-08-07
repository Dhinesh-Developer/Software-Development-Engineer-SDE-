package _3A_HandsOn;

import java.util.Scanner;

interface Payment{
	void pay(double amount);
}

class CreditCard implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" via Credit Card.");
	}
	
}

class UPI implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" via UPI.");
	}
	
}

class Wallet implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" via Wallet.");
	}
	
}

class Processing{
	public void paymentProcess() {
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Amount to pay");
		double amount = in.nextDouble();
		
		System.out.println("Select The payment Method:");
		
		
		System.out.println("1.Credit Card");
		System.out.println("2.UPI");
		System.out.println("3. Wallet");
		int n = in.nextInt();
		switch(n){
		case 1:
			Payment cc = new CreditCard();
			cc.pay(amount);
			break;
		case 2:
			Payment upi = new UPI();
			upi.pay(amount);
			break;
		case 3:
			Payment wallet = new Wallet();
			wallet.pay(amount);
			break;
		}
	}
}

public class program3 {

	public static void main(String[] args) {
		
		Processing p = new Processing();
		p.paymentProcess();
	}

}
