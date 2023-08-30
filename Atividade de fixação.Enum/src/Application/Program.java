package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.Enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		// vai transformar o string para o tipo date
		Date date = sdf.parse(sc.next());

		Client client = new Client(name, email, date); 

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		//converte o valor de string para o valor la no order status
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

		// ele vai pegar a da maquina
		Order order = new Order(new Date(), orderStatus, client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++){
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(pName, pPrice);
			OrderItem orderItem = new OrderItem(quantity, pPrice, product);
			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}
}
