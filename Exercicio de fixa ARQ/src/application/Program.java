package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// crianção de uma lista do tipo Product
		List<Product> list = new ArrayList<>();

		System.out.println("Digite o cominho do arquivo: ");
		String strPath = sc.nextLine();

		// pode criar uma objeto onde pode passa uma caminho 
		File path = new File(strPath);
		// cria uma vareavel recebendo o caminho 
		String strFolder = path.getParent();

		System.out.print("Digite a nova subPasta, como um caminho normal do Windows: ");

		// vai criar uma pasta chamada de subdir a partir da pasta digitada
		boolean succes = new File(strFolder + sc.nextLine()).mkdir();
		System.out.println("Pasta criada: " + succes);
		
		System.out.print("Digite um novo arquivo, passando a ultima pasta criada, como um caminho normal do Windows: ");

		// está crianda uma arquivo na subpasta out 
		String strFile = strFolder + sc.nextLine();

		// o BufferedReader é instaciado a partir de uma FileReader e são duas classe usadas para ler arquivos
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			// 
			String item = br.readLine();
			// vai percorrer ate a ultima linha do meu arquivo
			while(item != null){
				
				// O Split é usado para dividir uma string em pequenos pedaços
				String[] fildes = item.split(",");
				String name = fildes[0];
				// está convertendo o String para Double e pegando a informação na posição desejada
				double price = Double.parseDouble(fildes[1]);
				// está convertendo o String para Integer e pegando a informação na posição desejada
				int quantity = Integer.parseInt(fildes[2]);

				// estar adicionando os produtos do vertor na lista 
				list.add(new Product(name, price, quantity));

				item = br.readLine();
			}

			// o BufferedWriter e o FileWriter são utilizadas para escrever diretamente o arquivo 
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strFile))) {

				for (Product produtc : list) {
					// grava a linha de saida indo para a procima linha, só não dá quebra de linha 
					bw.write(produtc.getName() + "," + String.format("%.2f", produtc.valorTotal()));
					// quebra a linha
					bw.newLine();
				}

				System.out.println(strFile + " Criado com sucesso.");

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}