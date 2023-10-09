package com.java;

import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int rev=0,rem;
		
		while(num>0) {
			 rem = num%10;
			 rev = (rev*10)+rem;
			num = num/10;
		}
		
		System.out.println("Reversed Number: "+rev);
	}
}
