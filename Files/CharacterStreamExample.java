package com.Day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
	public static void main(String[] args) {

		String path = "C:\\Arise_Projects\\DIV - Full stack\\Files\\fileConcept.txt";
		FileWriter writer = null;
		try {
			 writer = new FileWriter(path);
			writer.write("Hello, Java File Handling!\n");
			writer.write("This is an example using FileReader and FileWriter.");
			writer.flush();
			System.out.println(" Data written to file successfully.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader reader = null;
		try {
			 reader = new FileReader(path);
			int ch;
			System.out.println("Reading the File content");
			while((ch = reader.read())!=-1) {
				System.out.print((char)ch);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	/*
 Data written to file successfully.
Reading the File content
Hello, Java File Handling!
This is an example using FileReader and FileWriter.

	 * 
	 * 
	 * */
}
