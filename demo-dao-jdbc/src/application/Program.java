package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.Dao.DaoFactury;
import model.Dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactury.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Marlon lei", "marlon@gmail.com", new Date(), 2400.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Mertha Waine");
		seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: seller update ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.daleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}
}
