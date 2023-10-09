package com.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		int sum =1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}
		System.out.println("Factorail of "+num+" is: "+sum);
	}
}
