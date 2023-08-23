package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ": ");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numQuar = sc.nextInt();
			System.out.println();
			//estar atribindo o numero do quarto ao vetor, na posicao digitada 
			quartos[numQuar] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("busy rooms: ");
		for (int i=0; i<10; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		sc.close();
	}

}
