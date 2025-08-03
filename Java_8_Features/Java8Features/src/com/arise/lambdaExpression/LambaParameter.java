package com.arise.lambdaExpression;
	
interface Addable{
	int addition(int a,int b);
}

class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}
}
public class LambaParameter {

	public static void main(String[] args) {
		
//		Addable add = (int a,int b) -> a+b; // no need to mention the data type also.
//		
//		Addable add = ( a, b) -> a+b;
//		System.out.println(add.addition(10, 20)); //30
		
		
		Addable add = (a,b) -> {
			int c = a+b;
			return c;
		};
		
		
		
	}

}
