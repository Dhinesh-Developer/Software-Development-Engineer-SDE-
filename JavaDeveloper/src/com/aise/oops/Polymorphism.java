package com.aise.oops;

/* 1:M 
 * child reference : child object called as tight coupling
 * parent reference : parent object called as loose coupling
 * 
 * using parent reference we can only access the overridden method, cannot access special Method.
 * when we want to access it then we need to downcast
 * 
 * Advantages
 * code flexibility.
 * 
 * */

class Plane{
	
	void fly() {
		System.out.println("Plane is flying");
	}
	
	void land() {
		System.out.println("Plane is landed");
	}
}

class CargoPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("Cargo plane is flying");
	};
	
	@Override
	void land() {
		System.out.println("CargoPlane is landed");
	}
}

class FighterPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("Fighter Plane is flying");
	}
	
	@Override
	void land() {
		System.out.println("FighterPlane is landed");
	}
}

class GoodsPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("Goods Plane is flying");
	}
	
	@Override
	void land() {
		System.out.println("GoodsPlane is landed");
	}
}

class Airport{
	
	void permit(Plane ref) {
		ref.fly();
		ref.land();
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		GoodsPlane dp = new GoodsPlane();
		Airport air = new Airport();
		
		air.permit(cp);
		air.permit(fp);
		air.permit(dp);
		
	}
}

/*
Cargo plane is flying
CargoPlane is landed
Fighter Plane is flying
FighterPlane is landed
Goods Plane is flying
GoodsPlane is landed

 * */
