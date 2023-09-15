package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// vai pegar o nome do arquivo e printar na tela, onde so pega o nome do arquivo e despreza o caminho
		System.out.println("getName: " + path.getName());
		// o getParent vai pegar todo o caminho menos e dispreza o local
		System.out.println("getParent: " + path.getParent());
		// vai mostrar todo o caminho conpleto
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
