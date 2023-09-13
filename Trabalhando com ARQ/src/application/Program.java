package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		// está instaciando um objeto do tipo arquivo FILE com um caminho para acessar um arquivo 
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			// testa se ainda tem linha no arquivo
			while (sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		// o OIEexception é a classe base para exceções geradas ao acessar informações usando fluxos, arquivos e diretórios.
		} catch (IOException e) {
			// testa o que o IOException fala sobre a exceção
			System.out.println("Error: " + e.getMessage());
		} finally{
			if (sc != null){
			sc.close();
			}
		}
	}
}
