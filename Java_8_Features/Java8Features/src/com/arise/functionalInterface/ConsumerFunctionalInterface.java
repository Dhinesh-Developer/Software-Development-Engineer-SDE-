package com.arise.functionalInterface;

// package belong to java.util 
import java.util.function.Consumer;

//Example -> Consumer<T>  // is an generic interface T-> Type of the input to the operation & returns no result.


// Traditional way.
class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		
		ConsumerImpl consumerImpl = new ConsumerImpl();
		consumerImpl.accept("kumar"); //kumar
		
		Consumer<String> consumer = (String s)-> {
			System.out.println(s);
		};
		
		consumer.accept("kumar");
	}

}
