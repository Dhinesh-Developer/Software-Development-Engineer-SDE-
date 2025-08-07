package com.aise.oops;

import java.util.Scanner;

class Customer{
	private int cId;
	private String cName;
	private int cPhone;
	
	public Customer(int cId,String cName,int cPhone) {
		this.cId = cId;
		this.cName = cName;
		this.cPhone = cPhone;
	}
	
	public int getCId() {
		return cId;
	}
	
	public String getName() {
		return cName;
	}
	
	public int getCPhone() {
		return cPhone;
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String _cname = in.next();
		int _cid = in.nextInt();
		int _cphone = in.nextInt();
		
		Customer _customer = new Customer(_cid,_cname,_cphone);
		
		System.out.println(_customer.getCId());
		System.out.println(_customer.getName());
		System.out.println(_customer.getCPhone());
		
		in.close();
		
	}

}
