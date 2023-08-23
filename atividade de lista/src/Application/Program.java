package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();

		System.out.print("Quantos funcionais serao registrados? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Esse Id ja exixte! digite outro Id: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			Product pro = new Product(id, name, salary);
			list.add(pro);
			System.out.println();
		}

		System.out.print("Digite um id valido de um funcionario que tera o salario aumentado: ");
		int idfun = sc.nextInt();
		Integer pos = posi(list, idfun);
		if (pos == null) { 
			System.out.println("Este id nao exixte!");
		}else {
			System.out.print("Digite a porcentage: ");
			double percent = sc.nextDouble();
			list.get(pos).percentege(percent);
			System.out.println();
		}
		
		System.out.println("Lista de funcionarios: ");
		for (Product pro : list) {
			System.out.println(pro);
		}
		
		sc.close();
	}
	
	public static Integer posi(List<Product> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			} 
		}
		return null;
	}
	
	public static boolean hasId(List<Product> list, int id) {
		Product pro = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return pro != null;
	}
}
