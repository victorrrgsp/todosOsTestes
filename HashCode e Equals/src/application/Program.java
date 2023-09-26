package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";

		// Equals teste se a variavel a A é Igual a 
		System.out.println(a.equals(b));

		// HashCode retorna um codigo do tipo inteiro que é a informação do do objeto
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = new String("Test");
		// tratamento literal
		String s2 = "Test";

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		// são objetos que estao em posições diferentes
		System.out.println(c1 == c2); 
		// só dar verdadeiro por que ele dar um tratamento especial para literais
		System.out.println(s1 == s2);

	}
}
