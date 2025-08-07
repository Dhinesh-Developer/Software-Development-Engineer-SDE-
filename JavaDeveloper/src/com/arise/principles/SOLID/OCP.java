package com.arise.principles.SOLID;
/*
 * OCP -> Open closed principle.
 * 	Software entities (classes,modules,functions) should be open for extension and closed for modification.
 * 	you should be able to add new behavior to a class or module, without changing its code.
 * 
 * */
// Tax strategy Interface
interface TaxCalculator{
	double calculateTax(double amount);
}

class IndianTaxCalculator implements TaxCalculator{

	@Override
	public double calculateTax(double amount) {
		return amount * 0.18; // GST
	}
	
}

class USTaxCaluculator implements TaxCalculator{

	@Override
	public double calculateTax(double amount) {
		return amount * 0.08; //sales Tax
	}
	
}

/* -> This is not following the OCP principles.
class InvoiceProcessor {
    public double calculateTotal(String region, double amount) {
        if (region.equalsIgnoreCase("India")) {
            return amount + amount * 0.18;
        } else if (region.equalsIgnoreCase("US")) {
            return amount + amount * 0.08;
        } else if (region.equalsIgnoreCase("UK")) {
            return amount + amount * 0.12;
        } else {
            return amount; // No tax for unknown region
        }
    }
}

 * */

public class OCP {

	public static void main(String[] args) {
		
	}

}
