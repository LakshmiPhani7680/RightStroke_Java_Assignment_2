package com.rightstroke.com;

import java.util.*;

public class MatrixMultiplication {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.of Rows");
		int R = scan.nextInt();
		System.out.println("Enter no.of Columns");
		int C = scan.nextInt();
		int [][] array1 = new int[R][C];
		int [][] array2 = new int[R][C];
		for (int i=0; i<R;i++) {
			for (int j=0;j<C;j++) {
				System.out.println("Enter element for Array1 in position "+i+","+j);
				array1[i][j]=scan.nextInt();
			}
		}
		for (int i=0; i<R;i++) {
			for (int j=0;j<C;j++) {
				System.out.println("Enter element for Array2 in position "+i+","+j);
				array2[i][j]=scan.nextInt();
			}
		}
//-----------------------------------------------------------------------------------------
		System.out.println("The Multiplication of two Matrices : ");
		int [][]array3 = new int[R][C];
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				array3[i][j]=0;
				for(int k=0;k<R;k++) {
					array3[i][j]+=(array1[i][k]*array2[k][j]);
				}System.out.print(array3[i][j]+" ");
			}System.out.println(" ");
		}
		scan.close();
	}
}
