package com.java;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int sum=0;
		int[][] m1 = {
				{4,8,2},
				{2,1,9}
		};
		
		int[][] m2 = {
				{4,3},
				{1,11},
				{8,2}
		};
		
		int[][] r = new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j =0; j<2;j++) {
				sum=0;
				for(int k=0;k<3;k++) {
					sum = sum+(m1[i][k]*m2[k][j]);
				}
				r[i][j]=sum;
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
}
