package Day2;

import java.util.Scanner;

class Account{
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		if(amount > 0) {
			balance += amount;
		}else {
			System.out.println("Insufficeint money to add");
		}
		return balance;
	}
	
	public int debit(int amount) {
		if(amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public int transferTo(String accountId,int amount) {
		if(amount <= balance) {
			System.out.println("Transfered "+amount+ " To "+accountId);
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

public class program3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the id");
		String _id = in.nextLine();
		System.out.println("Enter the name");
		String _name = in.nextLine();
		System.out.println("Enter the balance");
		int _balance = in.nextInt();
		
		Account acc = new Account(_id,_name,_balance);
		System.out.println("ID : "+acc.getId());
		System.out.println("Name : "+acc.getName());
		System.out.println("Balance : "+acc.getBalance());
		
		System.out.println("Enter the amount to credit ");
		int _creditAmount = in.nextInt();
		System.out.println("Balance "+acc.credit(_creditAmount));
		
		
		System.out.println("Enter the amount to debit ");
		int _debitAmount = in.nextInt();
		System.out.println("Balance "+acc.debit(_debitAmount));
		
		System.out.println("Enter the Id to transfer the Money ");
		String _transferId = in.nextLine();
		System.out.println("Enter the Amount to Transfer ");
		int _transferAmount = in.nextInt();
		System.out.println("Transfered "+_transferAmount+" To "+_transferId);
	
		in.close();
	}

}
