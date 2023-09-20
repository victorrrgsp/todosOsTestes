package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService in = new UsaInterestService(1.0);
		double payment = in.payment(amount, months);

		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));

		sc.close();
	}

}
