package com.java;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int temp = num;
		int sum=0;
		int rem =0;
		
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num=num/10;
		}
		
		if(sum==temp) {
			System.out.println(temp +" is a palindrome number");
		}else {
			System.out.println(temp +" is not a palindrome number");
		}
	}
}
