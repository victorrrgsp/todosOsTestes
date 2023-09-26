package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		// é um recurso sintático do Java para uso seguro de recursos de forma segura
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<Product> set = new HashSet<>();
			String line = br.readLine();
			
			while (line != null) {
				// ele vai recortar o que estar dentro da linha pelo espaco em branco 
				String [] fields = line.split(" ");
				set.add(new Product(fields[0], Date.from(Instant.parse(fields[1]))));
				line = br.readLine();
			}
			// o sixe é o tamanho do meu conjunto
			System.out.println("Total users: " + set.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally{
			sc.close();
		}
	}
}
