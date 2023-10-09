package com.java.file;

import java.io.File;
import java.io.IOException;

public class FileCreating {


	public static void main(String[] args) {
		
		 
		File fi = new File("C:\\Users\\91939\\Desktop\\deletingFile.txt");
		
		try {
			while(fi.createNewFile()) {
				System.out.println("File created: "+fi.getName());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
