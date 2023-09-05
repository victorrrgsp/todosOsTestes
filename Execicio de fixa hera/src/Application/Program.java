package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.Pessoa;
import Entites.PessoaF;
import Entites.PessoaJ;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List <Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i=1;i<=n;i++){
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char inCom = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anual = sc.nextDouble();
			if (inCom == 'i'){
				System.out.print("Health expenditures: ");
				double impostSaude = sc.nextDouble();
				list.add(new PessoaF(name, anual, impostSaude));
			}else {
				System.out.print("Number of employees: ");
			    int nfuncionarios = sc.nextInt();
				list.add(new PessoaJ(name, anual, nfuncionarios));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa pe : list){
			System.out.println(pe.toString());
		}

		double som = 0.0;
		for (Pessoa pe : list){
			som += pe.getRendaAnul();
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", som));

		sc.close();
	}
}
