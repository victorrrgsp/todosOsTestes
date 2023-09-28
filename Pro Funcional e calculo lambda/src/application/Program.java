package application;

import java.util.Arrays;

// programação iperativa
public class Program {
	public static int globalValue = 10;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		// vai mudar os valores iMpares
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}
	// esse metodo pega o vetor e percorre o mesmo 
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}