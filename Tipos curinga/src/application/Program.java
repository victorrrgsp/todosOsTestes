package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*  estar falando q uma lista de Integer não é uma Lista de Object
		* a lista do tipo de ? é um super tipo de qualquer tipo de lista
		*/
		/* List <?> myObjs = new ArrayList<>();
		List <Integer> myNumbers = new ArrayList<>();
		myObjs = myNumbers;

		Object obj;
		Integer x = 10;
		obj = x; */
		
		// estar instaciando uma lista de inteiros, ja informando os valores
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	private static void printList(List<?> myInts) {
		for (Object obj : myInts) {
			System.out.println(obj);
		}
	}
}
