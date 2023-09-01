package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++){
			System.out.println("Shape #" + i + " date: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			// a palavra que o usuario digitar vai ser convertida para o objeto do tipo enumerado color 
			Color color = Color.valueOf(sc.next());
			if (ch == 'r'){
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color,radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape sh : list) {
			System.out.printf("%.2f%n", sh.area());
		}
		sc.close();
	}
}
