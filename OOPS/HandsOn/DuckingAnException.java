package Day5;

import java.util.Scanner;

class Arr {
    static int[] ar = new int[3];

    public void acceptInput() throws ArrayIndexOutOfBoundsException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 integer values: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }

        System.out.println("Accessing 6th element: " + ar[5]); 

        in.close(); 
    }
}

public class DuckingAnException {

    public static void main(String[] args) {
        Arr a = new Arr();

        try {
            System.out.println("Program started");
            a.acceptInput();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("Program Terminated");
        }
    }
}
/*
Program started
Enter 3 integer values: 
1 2 3 
Exception occurred: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
Program Terminated
 * */
 