package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strpath = sc.nextLine();

		File path = new File(strpath);

		// criando um vertor onde vai listar contendo cada um dos caminhos, de quem é diretorio ou pasta
		File [] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders){
			System.out.println(folder);
		}

		// vai pegar somente a lista de arquivos 
		File [] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files){
			System.out.println(file);
		}

		// vai criar uma pasta chamada de subdir a partir da pasta temp
		boolean succes = new File(strpath + "\\subdir").mkdir();
		System.out.println("Directory created successfulley: " + succes);
		
		sc.close();
	}

}
