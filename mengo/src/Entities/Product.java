package Entities;

public class Product {

	private int login;
	private String name;
	private double valorDeposito;
	
	public Product() {
	}

	public Product(int login, String name) {
		this.login = login;
		this.name = name;
	}

	public Product(int login, String name, double valorDeposito) {
		this.login = login;
		this.name = name;
		somaDeposito(valorDeposito);
	}
	
	public int getLogin() {
		return login;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}
	
	public void somaDeposito (double soma) {
		valorDeposito += soma;
	}

	public void retirada (double subtracao) {
		valorDeposito -= subtracao + 5.00;
	}

	public String toString() {
		return "Account "
				+ login
				+ ", Holder: "
				+ name 
				+ ", Balance: $ "
				+ String.format("%.2f", valorDeposito);
	}
	
}
