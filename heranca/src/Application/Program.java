package Application;

import java.util.ArrayList;
import java.util.List;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();

		list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Ana", 500.0, 500.0));

		double som = 0.0;
		for (Account acc : list){
			som += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", som);

		for (Account acc : list){
			acc.deposit(10.0);
		}

		for (Account acc : list){
			System.out.printf("Update balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
		}
	}
}