package appication;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// o map trabalha com chave e seu valor, o TreeMap vai ordenar pela chave, que no caso é por ordem alfabetica
		Map<String, String> cookies = new TreeMap<>();

		// o put é uma operação que adiciona elementos no Map
		cookies.put("usermane", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		// o remove vai remover a partir da chave
		cookies.remove("email");
		// estar sobrecrevendo a chave phone, onde não pode ter duas chaves iguais no map
		cookies.put("phone", "99771133");

		// testa se o Map tem a chave especifica 
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		// consulta o valor da chave especifica
		System.out.println("Phone number: " + cookies.get("phone"));
		// tenta pegar um valor q não existe, onde ele retorna null
		System.out.println("Email: " + cookies.get("email"));
		// mostra o tamanho do meu Map 
		System.out.println("Size: " + cookies.size());

		System.out.println("ALL COOKIES: ");
		// o keySet reotrna as chaves do meu map
		for (String sst : cookies.keySet()) {
			// vai emprimir na tela a chave e o valor da mesma
			System.out.println(sst + ": " + cookies.get(sst));;
		}
		System.out.println();

		Map<Product, Double> stock = new HashMap<>();

		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0 + p2.getPrice());
		stock.put(p3, 15000.0);

		Product ps = new Product("Tv", 900.00);

		// faz uma comparação das informações de ps com as q estão dentro do Map
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
		System.out.println(stock.values());
	}
}
