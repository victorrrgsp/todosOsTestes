package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.CalculationService;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		String path = "c:\\temp\\inn.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				list.add(new Product(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}
			System.out.println("Most expensivel: " + CalculationService.max(list));
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
