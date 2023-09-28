package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import inter.ProductConsumer;


public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.90));

		///////////////////Implementação da interface////////////////////
		// o forEch vai percorrer a lista e aplicar o que estar dentro da instacia
		list.forEach(new ProductConsumer());
		// vai percorrer a lista e printar na tela 
		list.forEach(System.out::println);// onde estar usando um metodo referesemeted
		System.out.println();

		/////////////////// Referece method com metodo static////////////////////
		// o forEch vai percorrer a lista e aplicar o que estar dentro da instacia
		list.forEach(Product::staticPriceUpdate);
		// vai percorrer a lista e printar na tela 
		list.forEach(System.out::println);// onde estar usando um metodo referesemeted
		System.out.println();

		/////////////////// Referece method com metodo não static////////////////////
		// o forEch vai percorrer a lista e aplicar o que estar dentro da instacia
		list.forEach(Product::noStaticPriceUpdate);
		// vai percorrer a lista e printar na tela 
		list.forEach(System.out::println);// onde estar usando um metodo referesemeted
		System.out.println();

		///////////////////Expressão lambda declarada////////////////////
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		// o forEch vai percorrer a lista e aplicar o que estar dentro da instacia
		list.forEach(cons);
		// vai percorrer a lista e printar na tela 
		list.forEach(System.out::println);// onde estar usando um metodo referesemeted
		System.out.println();

		///////////////////Expressão lambda inline////////////////////
		// o forEch vai percorrer a lista e aplicar o que estar dentro da instacia
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		// vai percorrer a lista e printar na tela 
		list.forEach(System.out::println);// onde estar usando um metodo referesemeted
		System.out.println();
	}	
}
