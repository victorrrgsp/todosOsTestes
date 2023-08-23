package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p;

		System.out.print("Enter account number: ");
		int login = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y / n)? ");
		//ler o caracter x
		char x = sc.next().charAt(0);

		if (x == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorDeposito = sc.nextDouble();
			p = new Product(login, name, valorDeposito);
		}else {
			p = new Product(login, name);
		}
		
		System.out.println();
		System.out.print("Account data: ");
		System.out.println(p);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		p.somaDeposito(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.println(p);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		p.retirada(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.println(p);

		sc.close();
	}
}
