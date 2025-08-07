package _3A_HandsOn;

abstract class Notification{
	
	abstract void send(String message);
}

class Email extends Notification{

	@Override
	void send(String message) {
		System.out.println("Sending Email: "+message);
	}
	
}
class SMS extends Notification{

	@Override
	void send(String message) {
		System.out.println("Sending SMS: "+message);
	}
	
}
class PushNotification extends Notification{

	@Override
	void send(String message) {
		System.out.println("Sending Push Notification : "+message);
	}
	
}


public class program4 {

	public static void main(String[] args) {
		
		Email email = new Email();
		email.send("System maintenance at midnight.");
		
		SMS sms = new SMS();
		sms.send("System maintenance at midnight.");
		
		PushNotification push = new PushNotification();
		push.send("System maintenance at midnight.");
		
	}

}
