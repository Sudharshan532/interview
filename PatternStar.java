package com.java;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		PatternStar.from1to5(num);
		System.out.println(" -------  -------");
		PatternStar.from5to1(num);
		System.out.println(" -------  -------");
		PatternStar.centerPyramid(num);
		
	}
	
	public static void from1to5(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void from5to1(int num) {
		for(int i=num-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void centerPyramid(int num) {
		int i,j;
		for( i=0;i<num;i++) {
			
			for(j=num-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for( j=0;j<=i;j++) {
				System.out.print("* ");
			}
		
			System.out.println();
		}
	}
}
