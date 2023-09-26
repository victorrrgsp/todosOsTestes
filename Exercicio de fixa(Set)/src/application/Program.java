package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Product> turm = new HashSet<>();

		System.out.print("How many stadents for course A? ");
		int n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			turm.add(new Product(codigo));
		}
		
		System.out.print("How many stadents for course B? ");
		n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			turm.add(new Product(codigo));
		}

		System.out.print("How many stadents for course C? ");
		n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			turm.add(new Product(codigo));
		}

		System.out.println("Total studants: " + turm.size());
		sc.close();
	}
}
