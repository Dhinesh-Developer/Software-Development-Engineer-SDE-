package Day4.HandsOn;

interface FlightBooking{
	void bookTicket();
	void cancelTicket();
}

class Indigo implements FlightBooking{

	@Override
	public void bookTicket() {
		System.out.println("Indigo AirPlane ticket Booked");
	}

	@Override
	public void cancelTicket() {
		System.out.println("Indigo AirPlane ticket Cancelled");
	}
	
}

class AirIndia implements FlightBooking{

	@Override
	public void bookTicket() {
		System.out.println("AirIndia AirPlane ticket Booked");
	}

	@Override
	public void cancelTicket() {
		System.out.println("AirIndia AirPlane ticket Cancelled");
	}
	
}

class SpiceJet implements FlightBooking{

	@Override
	public void bookTicket() {
		System.out.println("SpiceJet AirPlane ticket Booked");
	}

	@Override
	public void cancelTicket() {
		System.out.println("SpiceJet AirPlane ticket Cancelled");
	}
	
}

public class program3 {

	public static void main(String[] args) {
		
		Indigo fb = new Indigo();
		fb.bookTicket();
		fb.cancelTicket();
		
		AirIndia ai = new AirIndia();
		ai.bookTicket();
		ai.cancelTicket();
		
		SpiceJet sj = new SpiceJet();
		sj.bookTicket();
		sj.cancelTicket();
		
	}

}
