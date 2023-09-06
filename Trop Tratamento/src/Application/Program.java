package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
		System.out.println("End of ptogram");
		
	}

	public static void method1 () {
		System.out.println("*** METHOD1 START ***");
		method2();
		System.out.println("*** METHOD1 END ***");
	}
	
	public static void method2 () {
		
		System.out.println("*** METHOD2 START ***");
		// pode ler arquivos e nao somente do console
		Scanner sc = new Scanner(System.in);

		try {
			String [] vert = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vert[position]);
			//
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			// vai emprimir o rastreio do Stack
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("*** METHOD2 END ***");
	}
}