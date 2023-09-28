package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.90));

		double min = 100.00;

		// vai receber uma expresão lambda, que é anonima, quarta versão
		Predicate<Product> pred = p -> p.getPrice() >= min;
 
		// primeira versão do Predicate
		list.removeIf(new ProductPredicate());
		// segundo versão do Predicarte 
		list.removeIf(Product::staticProductPredicte);
		// terceira versão do Predicarte 
		list.removeIf(Product::staticProductPredictee);
		//quinta versão - expressão lambda inline
		list.removeIf(p -> p.getPrice() >= min);

		for (Product product : list) {
			System.out.println(product);
		}
	}	
}
