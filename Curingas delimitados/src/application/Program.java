package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		// estou criando duas listas com duas figuras
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	// esse metodo faz a soma de tudo de estar na lista de myShapes, 
	//onde essa lista de Shape pode ser de qualquer tipo que seja subTIPO de Shape
	private static String totalArea(List<? extends Shape> myShapes) {
		double soma = 0.0;
		for (Shape shape : myShapes) {
			soma += shape.area();
		}
		return String.format("%f", soma);
	}
}
