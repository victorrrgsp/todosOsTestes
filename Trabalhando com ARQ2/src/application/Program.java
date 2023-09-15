package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// criando um vertor com tres valores nele 
		String[] lines = new String[]{ "Good morning", "Good afternoon", "Good night" };
		
		// está informando qual o caminho do arquivo
		String path = "c:\\temp\\out.txt";

		// o paremetro true indica que o usuario n quer recriar o arquivo, alem de acrescentar em relação ao que já tinha no arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines){
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}