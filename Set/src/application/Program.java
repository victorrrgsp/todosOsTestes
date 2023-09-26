package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// o HashSet é mais rapido mas ela não garante a ordenação
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Sansung");
		set.add("Xiomi");
		set.add("Windows");

		// o Contains verifica se o objeto existe que é baseada no equals e hashcode, 
		// e se o equals e hashCode não existir, será usada a comparação de ponteiros ou referencias
		System.out.println(set.contains("Notebook"));
		// ele exclui o Tablet do conjunto
		set.remove("Tablet");
		// esse predicato vai remover todo elemento que o tamanho do elemento do String for maior ou igual 8
		set.removeIf(x -> x.length() >= 8);
		// vai remover todo mundo q tem a letra T como inicial
		set.removeIf(x -> x.charAt(0) == 'T');

		for (String string : set) {
			System.out.println(string);
		}
		System.out.println();

		// O TreeSet é mais lento mas ele ordem os elementos
		Set<String> set2 = new TreeSet<>();

		set2.add("TV");
		set2.add("Tablet");
		set2.add("Iphone");

		System.out.println(set.contains("Notebook"));

		for (String string : set2) {
			System.out.println(string);
		}
		System.out.println();

		// O LinkedHashSet é mais lento que o HashSet e mais rapido que o TreeSet, mas ele ordena na ordem que foi add na lista 
		Set<String> set3 = new LinkedHashSet<>();

		set3.add("TV");
		set3.add("Tablet");
		set3.add("Iphone");

		System.out.println(set.contains("Notebook"));

		for (String string : set3) {
			System.out.println(string);
		}
		System.out.println();

		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

		// União
		Set<Integer> c = new TreeSet<>(a);// criando um conjunto C que é uma copia do Conjunto A
		// estar fazendo a união do conjunto C que é a copia do conjuto com o conjuto B
		c.addAll(b);
		System.out.println(c);

		// Intersecção
		Set<Integer> d = new TreeSet<>(a);// criando um conjunto D que é uma copia do Conjunto A
		// vai pegar aqueles elementos Iguais nos Conjuntos D e B
		d.retainAll(b);
		System.out.println(d);

		// Diferenca
		Set<Integer> e = new TreeSet<>(a);// criando um conjunto E que é uma copia do Conjunto A
		// vai remover o conjunto E todo mundo que estar no conjunto B
		e.removeAll(b);
		System.out.println(e);
		System.out.println();


		Set<Product> setP = new HashSet<>();
		
		setP.add(new Product("TV", 900.00));
		setP.add(new Product("Notebook", 1200.00));
		setP.add(new Product("Tablet", 400.00));

		Product pro = new Product("Notebook", 1200.00);

		/*  o Contains verifica se o objeto existe que é baseada no equals e hashcode
		* A classe Product não tem a inplementação do hashcode e equals
		* e se o equals e hashCode não existir, será usada a comparação de ponteiros ou referencias
		*/
		System.out.println(setP.contains(pro));// vai dar false pois foi instacias diferentes
		System.out.println();

		/* quando usa o TreeSet para comparar, 
		a classe terá que ser uma inplementação de Comparable
		para que o TreeSet seja possivel ordena seus odjetos
		*/ 
		Set<Product> setP1 = new TreeSet<>();
		
		setP1.add(new Product("TV", 900.00));
		setP1.add(new Product("Notebook", 1200.00));
		setP1.add(new Product("Tablet", 400.00));

		for (Product product : setP1) {
			System.out.println(product);		
		}
	}
}
