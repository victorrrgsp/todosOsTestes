package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);

		List<? extends Number> list = intList;

		Number x = list.get(0);

		System.out.println(x);
		// Covariancia onde pode acessar essa lista, mas não pode adicionar nada na lista
		//list.add(20);

		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");

		List<? super Number> myNuns = myObjs;

		myNuns.add(10);
		myNuns.add(3.14);

		// Cmontravariancia ja pode adicionar coisas na lista, mas não ser atribuida para uma vareavel do tipo number 
		// Number xs = myNuns.get(0);
		// por que o tipo dessa lista pode ser um tipo de super tipo de Number
		System.out.println(myNuns.get(0));

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoub = Arrays.asList(3.14, 6.28);
		List<Object> myObjss = new ArrayList<>();

		copy(myInts, myObjss);
		printList(myObjss);
		System.out.println();
		copy(myDoub, myObjss);
		printList(myObjss);
	}

	// a lista de origem vai ser qualquer tipo de lista de extends o Number 
	private static void copy(List<? extends Number> source, List<? super Number> myObjss) {
		for (Number num : source) {
			myObjss.add(num);
		}
	}

	public static void printList(List<?> list){
		for (Object object : list) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
}
 