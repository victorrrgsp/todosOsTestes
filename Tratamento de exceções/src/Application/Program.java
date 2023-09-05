package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {
			String [] vert = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vert[position]);
			//
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		} catch (InputMismatchException e) {
			System.out.println("Input");
		}
		System.out.println("End of ptogram");
	
		sc.close();
	}

}
