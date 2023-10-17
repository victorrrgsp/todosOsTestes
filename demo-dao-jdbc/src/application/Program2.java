package application;

import java.util.List;
import java.util.Scanner;

import model.Dao.DaoFactury;
import model.Dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactury.createDepartmentDao();

		System.out.println("=== TEST 1: seller findAll ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== TEST 2: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

		System.out.println("\n=== TEST 3: seller insert ===");
		Department department2 = new Department(null, "Music");
		departmentDao.insert(department2);
		System.out.println("Inserted! new id = " + department2.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: seller update ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.daleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}
}
