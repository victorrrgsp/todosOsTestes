package application;

import entities.ComboDevice;
import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissetation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}

}
