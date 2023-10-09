package com.java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		System.out.print(0+" "+1);
		
		sc.close();
		int a1=0,a2=1,a3=0;
		
		for(int i=2;i<count;i++) {
			a3 = a1+a2;
			System.out.print(" "+a3);
			a1=a2;
			a2=a3;
		}
	}
}
