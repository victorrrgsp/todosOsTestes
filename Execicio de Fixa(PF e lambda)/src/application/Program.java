package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			System.out.println("Email of people whose salary ir more than " + String.format("%.2f", salary) + ": ");
			List<String> emails = list.stream()
				.filter(x -> x.getSalary() > salary)
				.map(x -> x.getEmail())
				.sorted()
				.collect(Collectors.toList());
			
			emails.forEach(System.out::println);

			Double nameS = list.stream()
				.filter(p -> p.getNames().charAt(0) == 'M')
				.map(p -> p.getSalary())
				.reduce(0.0, (x, y) -> x + y);

			System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",nameS));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally{
			sc.close();
		}
	}
}
