package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			// o readLine vai ler uma linha do meu arquivo, se o arquivo esteve no final, ele ira retornar null
			String line = br.readLine();
			while (line != null){
				System.out.println("");
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null){
					br.close();
				} if (fr != null){
					fr.close();
				}
			} catch (IOException e){
				// o printStackTrace ver direitinho o que ouve no programa 
				e.printStackTrace();
			}
		}
	}
}