package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emp = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++){
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y / n)? ");
			//ler o caracter x
			char out = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");		
			double valuePerHour = sc.nextDouble();
			if (out == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				emp.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			}else{
				emp.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENT: ");
		for (Employee empp : emp){
			System.out.println(empp.getName() + " - $ " + String.format("%.2f", empp.payment()));
		}
		
		sc.close();
	}
}