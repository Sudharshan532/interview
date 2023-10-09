package com.java.file;

import java.io.File;

public class FileDeleting {

	public static void main(String[] args) {
		
		File fd = new File("C:\\Users\\91939\\Desktop\\deletingFile.txt");
		if(fd.delete()) {
			System.out.println("File Deleted Successfully"+ fd.getName());
		}else {
			System.out.println("Failed in deleting");
		}
	}
}
