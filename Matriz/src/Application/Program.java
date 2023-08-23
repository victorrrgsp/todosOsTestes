package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int [n][n];
		
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++){
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal");
		
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int number = 0;
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++) {
				if (mat[l][c] < 0) {
					 number++;
				}
			}
		}
		System.out.print("Negative numbers = " + number);
		
		sc.close();
	}
}
