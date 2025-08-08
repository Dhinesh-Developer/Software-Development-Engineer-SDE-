package com.Day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			FileOutputStream output = new FileOutputStream("C:\\Arise_Projects\\DIV - Full stack\\Files\\output.txt");
			while(true) {
				String line = in.nextLine();
				 if (line.equalsIgnoreCase("exit")) {
	                    break;
	                }
	                output.write((line + System.lineSeparator()).getBytes());
	            }
			in.close();
			output.close();
			System.out.println("Data written successfully.");
		
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
