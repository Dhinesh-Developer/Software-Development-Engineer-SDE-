package com.arise.lambdaExpression;
class ThreadDemo implements Runnable{
	
	@Override
	public void run() {
		System.out.println("run method called....");
	}
}
// Runnable interface is functional interface which contains only one abstract method.
public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		
		Runnable runnable = () ->System.out.println("run method called using Lambda....");
		
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();
		
	}

}
/*
run method called....
run method called using Lambda....

 * */
