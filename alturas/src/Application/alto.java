package Application;

import java.util.Locale;
import java.util.Scanner;


public class alto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n]; 
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
		}
		double media = soma / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				cont = cont + 1;
			}
		}
		
		double perce = cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", perce);
		
		for (int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i] + " com " + idade[i]);;
			}
		}
		
		sc.close();
	}
}
