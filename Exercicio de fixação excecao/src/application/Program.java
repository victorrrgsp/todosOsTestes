package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdraw = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdraw);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			System.out.println(account);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid format");
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
			// qualquer outra exceção inesperada ira printar
		} catch (RuntimeException e){
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}
