package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.90));

		////////////////////////////// Implementação da interface ////////////////////////////////
		// estar convertendo uma lista pra stream e de stream para lista
		// o map vai aplicar a função do UpperCaseName em cada elemento da lista, e por ele produz uma nova lista
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		// vai percorrer a lista de names
		names.forEach(System.out::println);
		System.out.println();

		////////////////////////////// reference method com metodo static ////////////////////////////////
		// estar convertendo uma lista pra stream e de stream para lista
		// o map vai aplicar a função do UpperCaseName em cada elemento da lista, e por ele produz uma nova lista
		List<String> names1 = list.stream().map(Product::UpperCaseName).collect(Collectors.toList());
		// vai percorrer a lista de names
		names1.forEach(System.out::println);
		System.out.println();

		////////////////////////////// reference method com metodo não static ////////////////////////////////
		// estar convertendo uma lista pra stream e de stream para lista
		// o map vai aplicar a função do UpperCaseName em cada elemento da lista, e por ele produz uma nova lista
		List<String> names2 = list.stream().map(Product::noStaticUpperCase).collect(Collectors.toList());
		// vai percorrer a lista de names
		names2.forEach(System.out::println);
		System.out.println();

		////////////////////////////// expressão lambda declarada ////////////////////////////////
		Function<Product, String> namesM = p -> p.getName().toUpperCase();
		// estar convertendo uma lista pra stream e de stream para lista
		// o map vai aplicar a função do UpperCaseName em cada elemento da lista, e por ele produz uma nova lista
		List<String> names3 = list.stream().map(namesM).collect(Collectors.toList());
		// vai percorrer a lista de names
		names3.forEach(System.out::println);
		System.out.println();

		////////////////////////////// expressão lambda inline ////////////////////////////////
		// estar convertendo uma lista pra stream e de stream para lista
		// o map vai aplicar a função do UpperCaseName em cada elemento da lista, e por ele produz uma nova lista
		List<String> names4 = list.stream().map( p -> p.getName().toUpperCase()).collect(Collectors.toList());
		// vai percorrer a lista de names
		names4.forEach(System.out::println);
	}

}
