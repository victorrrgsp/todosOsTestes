package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++){
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char x = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (x == 'i'){
				System.out.print("Cuntoms fee: ");
				double cunsf = sc.nextDouble();
				list.add(new ImportedProduct(name, price, cunsf));
			}else if(x == 'u'){
				System.out.print("Manufature date (DD/MM/YYYY): ");
				Date date  = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}else{
				list.add(new Product(name, price));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product pro : list){
			System.out.println(pro.priceTag());
		}
		sc.close();
	}

}
