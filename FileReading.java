package com.java.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		
		File fi = new File("C:\\Users\\91939\\Desktop\\file1.txt");
		try {
			Scanner sc = new Scanner(fi);
			while(sc.hasNext()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
