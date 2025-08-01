package Day4;

// online banking system
class BankAccount {
	
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private int pin;
	
	public BankAccount(String accountNumber,String accountholder,double balance,int pin) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountholder;
		this.balance = balance;
		this.pin = pin;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount < 1) {
			System.out.println("Insufficient Money to deposit");
		}
		balance += amount;
		System.out.println("Amount deposited Successfully");
	}
	
	public void withdraw(double amount,int enteredPin) {
		if((enteredPin == this.pin )&& amount > 0 && amount<= balance ) {
			balance -= amount;
			System.out.println("Balance After Withdraw "+balance);
		}else {
			System.out.println("Insuffcient balance");
		}
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		
	}

}
