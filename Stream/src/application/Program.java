package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		// o arrays ja emplementa elementos na lista
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		// a criação do stream recebendo a lista como parametro e utiliza o map para aplicar uma função em cada elemento da stream
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		// vai printar a stream na lista, onde o toArray é uma expresão terminal
		System.out.println(Arrays.toString(st1.toArray()));

		// o Stream.of serve para adicionar elementos na Stream
		Stream<String> st2 = Stream.of("Maria","Alex","Bob");
		System.out.println(Arrays.toString(st2.toArray()));
 
		// o iterate meio que pergunta qual é o primeiro elemento da minha stream e a finção de interação dos proximos elementos
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		// estar criando uma Stream com a sequencia de fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L , 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		System.out.println();

		/* o Reduce pega o elemento inicial que no caso vai ser o elemento neutro da operação
		* e uma função que pega dois argumentos e gera um resoltado
		* o reduce tambem é uma operação terminal
		*/ 
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum: " + sum);
		// estar criando um novo Stream                       
		List<Integer> newList = list.stream()
			// o filter vai filtrar o stream de acordo com a função do predicato  
			.filter(x -> x % 2 == 0)
			// vai pegar cada elemento da minha lista e multiplicar vezez 10
			.map(x -> x * 10)
			// a sintaxe .collect(Collectors.toList()) vai transformar a stream em lista novamente
			.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}
}
