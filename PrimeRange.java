package com.java;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int from = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int to = sc.nextInt();
		
		sc.close();
		
		for(int i=from; i<=to;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int k=2;k<=Math.sqrt(num);k++) {
			if(num%k==0) {
				return false;
			}
		}
		return true;
	}
}
