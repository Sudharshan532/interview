package com.java.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWriting {

	public static void main(String[] args) {
		
		 
		
		try {
			FileWriter fwriter = new FileWriter("C:\\Users\\91939\\Desktop\\newfile.txt");
			 fwriter.write("Hello World");
			 fwriter.write("\n");
			 fwriter.write("This is a file handling program");
			 fwriter.close();
			 Scanner sc = new Scanner("File has been written.");
			 sc.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
