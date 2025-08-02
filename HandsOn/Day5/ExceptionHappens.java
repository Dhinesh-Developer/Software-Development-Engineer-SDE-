package Day5;

import java.util.Scanner;

public class ExceptionHappens {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int res = a/b;
		System.out.println(res);
	}

}
/*  Output.
100
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Day5.ExceptionHappens.main(ExceptionHappens.java:12)
 * */
