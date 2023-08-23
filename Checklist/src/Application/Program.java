package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * a lista não aceita tipos primitivos tipo int, terá q usar a wapper class q
		 * Integer e para usar a lista terá que instaciar a lista, o java não aceita
		 * instaciar um tipo que é interface, terá que usar uma classe que implementa
		 * essa interface
		 */
		List<String> list = new ArrayList<>();

		// adicionando elemento na lista
		list.add("Marco");// 0
		list.add("Maria");// 1
		list.add("Victor");// 2
		list.add("Anna");// 3
		list.add("Alex");// 4
		list.add("Debora");// 5
		list.add("Marlon");// 6
		list.add(2, "Rick");

		// vai ver o tamanho da lista
		System.out.println(list.size());

		// percorrer a lista com for each
		for (String x : list) {
			System.out.println(x);
		}

		// remove um elemento da lista
		list.remove("Victor");

		/*
		 * montando um predicado que trabalha com String, que é uma função lambida, onde
		 * vai pegar um valor x(que é do tipo String), e vai returnar se o x.charAt(0)
		 * for = M e pode dar verdadeiro vou falso
		 */
		list.removeIf(x -> x.charAt(0) == 'M');

		System.out.println("---------------------------");

		System.out.println(list.size());

		// percorrer a lista com for each
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------------");

		// encontrar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Debora"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("---------------------------");

		/*
		 * filtra a minha lista so com as pessoas que começa com a letra "A", e terá q
		 * converter a list para tipo stream, que é um tipo especial do java, que aceita
		 * operações lambida, mas ele não é compativel com lista ai vai ter que
		 * converter o strean de novo para lista
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		// percorrer a lista com for each
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		//o findFirst vai pegar o primeiro elemento desse stream, onde irá retornar nulu por conta do orElse
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
