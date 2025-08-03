package com.arise.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/* interface Supplier<T> 
 * T- > the type of results supplied by this supplier.
 * having the get() methods.
 * 
 * */

class SupplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}
	
}

public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		
		SupplierImpl supplierImpl = new SupplierImpl();
		System.out.println(supplierImpl.get()); //2025-08-03T08:37:58.979068900
		
		Supplier<LocalDateTime> supplier = () ->{
			return LocalDateTime.now();
		};
		
		System.out.println(supplier.get()); //2025-08-03T08:39:02.096043200
		
	}

}
