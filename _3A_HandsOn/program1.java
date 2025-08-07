package _3A_HandsOn;

class Vehicle{
	
	public void start() {
		System.out.println("Vehicle is starting....");
	}
}

class Car extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Car is starting with a key.");
	}
}

class Bike extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Bike is starting with a kick.");
	}
}
class Truck extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Truck is starting with a button.");
	}
}
public class program1 {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Vehicle truck = new Truck();
		
		Vehicle[] ar = {car,bike,truck};
		for(Vehicle x : ar) {
			x.start();
		}
		
	}

}
