package com.java;

public class MatrixAddition {

	public static void main(String[] args) {
		
		int [][] m1 = {
						{2,6,8},
						{4,9,1}
					  };
		int [][] m2 = {
						{6,1,2},
						{0,4,5}
		  			  };
		
		int [][] r = new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<=2;j++) {
				r[i][j] = m1[i][j]+m2[i][j];
			}
		}
		
		for (int[] is : r) {
			for(int i:is) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
