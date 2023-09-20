package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// estar uma lista do tipo String
		List<Employee> list = new ArrayList<>();
		// estar criando uma variavel do tipo String recebendo um caminho de um arquivo
		String path = "C:\\temp\\in.txt";

		// aqui é instaciado uma classe do java para ler arquivos
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// vai ler uma linha do arquivo e armazenando na variavel name 
			String employeeCsv = br.readLine();
			// ele vai ler a linha do arquivo e armazenar o que estar dentro da linha na lista, e vai cair fora quando a linha for igual a null 
			while (employeeCsv != null) {
				// cria um vertor onde 
				String[] fields = employeeCsv.split(",");
				String name = fields[0];
				double salary = Double.parseDouble(fields[1]);
				list.add(new Employee(name, salary));
				employeeCsv = br.readLine();
			}
			// vai ordenar os elementos da minha lista em ordem alfabetica
			Collections.sort(list);
			// percorre a lista e printa na tela os conteudos da lista
			for (Employee emp: list) {
				System.out.println(emp.getName() + ", " + String.format("%.2f", emp.getSalary()));
			}
		//caso dê error, o programa vai entrar no catch
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}