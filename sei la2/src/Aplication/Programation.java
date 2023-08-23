package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entitis.Rectangle;

public class Programation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle Widht and Height: ");
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		System.out.println();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();	
		
	}

}
