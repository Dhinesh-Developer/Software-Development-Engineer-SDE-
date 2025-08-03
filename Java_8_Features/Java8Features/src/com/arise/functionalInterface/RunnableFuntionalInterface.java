package com.arise.functionalInterface;


class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("run method called.....");
	}
	
}
public class RunnableFuntionalInterface {

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start(); //run method called.....
		
		
		Runnable runnable = ()->{
			System.out.println("run method called using lambda");
		};
		
		Thread threadLambda  = new Thread(runnable);
		threadLambda.run(); //run method called using lambda
	}

}
