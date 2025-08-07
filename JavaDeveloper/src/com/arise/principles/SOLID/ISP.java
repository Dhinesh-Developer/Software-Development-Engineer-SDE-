package com.arise.principles.SOLID;

/*
 * ISP -> Interface Segregation Principle
 * 	  clients should not be forced to depend on interfaces they dont't use.
 * 		Don't create large, bloated interfaces.
 * 		Break them into smaller and more specific ones.
 * */


//Using such an interface would force riders to implement methods they don't need, like acceptRide() and trackEarnings(). For instance:
interface Uber{
	void bookRide();
	void acceptRide();
	void trackEarnings();
	void ratePassenger();
	void rateDriver();
}

// instead of above use below. using the Interface segregation principle
interface uberUser{
	void bookRide();
	void rateDriver();
}

interface UberDriver{
	void acceptRide();
	void tractEarning();
	void ratePassenger();
}
public class ISP {

	public static void main(String[] args) {
		
	}

}
