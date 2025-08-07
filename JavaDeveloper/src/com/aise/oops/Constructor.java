package com.aise.oops;

class Vehicle{
	
	private int vehicleNumber;
	private String brand;
	private int seats;
	private int tiers;
	
	
	public Vehicle(int vehicleNumber,String brand,int seats,int tiers) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.seats = seats;
		this.tiers = tiers;
	}
	
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public int getTiers() {
		return tiers;
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		Vehicle _vehicle = new Vehicle(7777,"FZ",2,2);
		System.out.println(_vehicle.getVehicleNumber()+" "+_vehicle.getBrand()+" "+_vehicle.getSeats()+" "+_vehicle.getTiers());
	}

}
