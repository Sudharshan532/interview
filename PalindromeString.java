package com.java;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";
		sc.close();
		
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
		}
		if(rev.equals(str)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}
	}
}
