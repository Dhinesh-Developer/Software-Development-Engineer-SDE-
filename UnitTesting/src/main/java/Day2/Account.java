package Day2;

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
	
	public boolean transferTo(Account recipient, int amount) {
	    if (amount <= 0) {
	        System.out.println("Transfer amount must be positive.");
	        return false;
	    }
	    
	    if (amount <= this.balance) {
	        this.balance -= amount;
	        recipient.credit(amount);
	        System.out.println("Transferred " + amount + " to " + recipient.getName());
	        return true;
	    } else {
	        System.out.println("Amount exceeded balance");
	        return false;
	    }
	}

	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
