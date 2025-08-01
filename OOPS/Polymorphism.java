package Day4;

// E-commerce payment Gateway

interface PaymentMethod{
	public boolean pay(double amount);
}

class CreditCard implements PaymentMethod{
	
	String cardNumber;
	int cvv;
	
	public CreditCard(String cardNumber, int cvv) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	@Override
	public boolean pay(double amount) {
		 System.out.println("Paid ₹" + amount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
	     return true;
	}
	
}

class UPI implements PaymentMethod{
	
	String upiId;
	
	public UPI(String upiId) {
		this.upiId = upiId;
	}

	public boolean pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
        return true;
    }
	
}
public class Polymorphism {

	public static void main(String[] args) {

	}

}
