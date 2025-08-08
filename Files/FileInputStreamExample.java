package com.Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		
		try {
			FileInputStream input = new FileInputStream("C:\\Arise_Projects\\DIV - Full stack\\Files\\input.txt");

			System.out.println("Data in the File : ");
			try {
				int i = input.read();
				while(i != -1){
					System.out.print((char)i);
					i = input.read();
				
				}
				System.out.println();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
/*
Data in the File : 
Welcome This from input.txt
Hai This is Dhinesh.

 * */
