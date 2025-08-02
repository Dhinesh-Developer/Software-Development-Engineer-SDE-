package Day5;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num = in.nextInt();
		System.out.println("Enter the denoinator");
		int deno = in.nextInt();
		
		try {
			int res = num/deno;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			in.close();
		}
	}

}
