package Day2;

import java.util.Scanner;


public class program3 {

	public static void main(String[] args) {
		
		Account a1 = new Account("101", "Dhinesh", 5000);
		Account a2 = new Account("102", "Sakthi", 3000);

		a1.transferTo(a2, 1000);
		System.out.println(a1.getBalance()); // Should be 4000
		System.out.println(a2.getBalance()); // res = 4000.

		
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
