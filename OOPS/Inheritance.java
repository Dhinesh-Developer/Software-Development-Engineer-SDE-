package Day4;


// Ride sharing system
class User{
	
	private String id;
	private String name;
	private String email;
	private String password;
	
	 public User(String id, String name, String email, String password) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.password = password;
	   }
	
	public boolean login(String _email , String _password) {
		if(this.email.equals(_email)  && this.password.equals(_password)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout() {
		System.out.println(name+" logout successfully");
	}
}

class Driver extends User{
	private int licenseNo;
	private double rating;
	
	public Driver(String id,String name,String email,String password,int licenseNumber) {
		 super(id, name, email, password);
	        this.licenseNo = licenseNumber;
	        this.rating = 5.0;
	}
	
	public void acceptRide() {
		System.out.println("ride accepted");
	}
}

class Customer{
	
	private String paymentMode;
//	 public Customer(String id, String name, String email, String password, String paymentMode) {
//	        super(id, name, email, password);
//	        this.paymentMode = paymentMode;
//	    }
	
	public String bookRide(int _licenseNo,double rating,String _name) {
		return (_name +" Booked Ride using" +paymentMode);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		

	}

}
