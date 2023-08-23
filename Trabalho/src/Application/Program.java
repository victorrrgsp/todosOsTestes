package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContracts;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class Program {

	//esse metodo agora pode gerar esse tipo de esseção que de tipo ParseException 
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//está manipulando uma data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		/* está instacinado um novo objeto do tipo worker,
		 * os dados desse objeto é o nome que eu digitei,
		 * uma instacia do tipo enumerado workerlevel que eu digitei,
		 * um valor de salario base que eu digitei
		 * e associado a esse objeto tera outro objeto do tipo department
		 * que vai ser o department que eu digitei
		*/
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

		System.out.print("How many contrats to this worker? ");
		int n = sc.nextInt();

		for (int i=1;i<=n;i++){
			System.out.println("Enter contract #" + i + " date: ");
			System.out.print("Date (DD/MM/YYYY): ");
			//vai ler uma variavel do tipo dete rescebendo o que o usuario digitar no (DD/MM/YYYY)
			Date contratcDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContracts contract = new HourContracts(contratcDate, valuePerHour, hours);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and yaer to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getWorkerName());
		//tem o objeto trabalhador que vai assecar outro objeto está associado a ele e depois vai associar o nome
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));

		sc.close();
	}
}
