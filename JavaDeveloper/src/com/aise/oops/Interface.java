package com.aise.oops;

/*to achieve abstraction,polymorphism,multipe abstraction ,standarization.
 * by default public abstract 
 * 
 * */

interface Calculator{
	void add();
	void sub();
}

class MyCalc1 implements Calculator{

	@Override
	public void add() {
		System.out.println(10+20);
	}

	@Override
	public void sub() {
		System.out.println(20-10);
	}
	
}

class MyCalc2 implements Calculator{

	@Override
	public void add() {
		int a = 10;
		int b = 20;
		int res1 = a+b;
		System.out.println(res1);
	}

	@Override
	public void sub() {
		int c = 30;
		int d = 40;
		int res2 = c-d;
		System.out.println(res2);
	}
	
}

class Calc{
	void permit(Calculator ref) {
		ref.add();
		ref.sub();
	}
}
public class Interface {

	public static void main(String[] args) {
		
		MyCalc1 c1 = new MyCalc1();
		MyCalc2 c2 = new MyCalc2();
		Calc c = new Calc();
		c.permit(c1);
		c.permit(c2);
	}

}
// 30 10 30 -10

