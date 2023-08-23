package Entities;

public class Product {

	private int id;
	private String name;
	private double salary;

	public Product() {
	}

	public Product(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void percentege(double percentege) {
		salary += salary * percentege / 100.0;
	}

	@Override
	public String toString() {
		return id 
				+ ", " 
				+ name 
				+ ", " 
				+ String.format("%.2f", salary);
	}

}
