package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.println("How many values? "); 
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			String values = sc.next();
			ps.addValue(values);
		}

		ps.print();
		// questin
		String x =  ps.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
