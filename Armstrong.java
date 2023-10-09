package com.java;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int digit=0;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		
		temp=num;
		int sum = 0,rem=0;
		while(temp>0) {
			rem = temp%10;
			sum= sum +(int)(Math.pow(rem, digit));
			temp=temp/10;
		}
		
		if(num==sum) {
			System.out.println(num+ "=="+ sum+" so it is an armstrong number");
		}else {
			System.out.println(num+ "!="+ sum+" so it is not an armstrong number");
		}
	}
}
