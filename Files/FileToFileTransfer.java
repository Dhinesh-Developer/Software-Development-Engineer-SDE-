package com.Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFileTransfer {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("C:\\Arise_Projects\\DIV - Full stack\\Files\\output.txt");
			FileOutputStream output = new FileOutputStream("C:\\Arise_Projects\\DIV - Full stack\\Files\\input.txt");
			
			int i;
			while ((i = input.read()) != -1) 
				output.write(i);
			input.close();
			output.close();
			System.out.println("Copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
