package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account(1001,"Alex",1000.0);
		acc1.Withdrow(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingAccount(1002,"Maria",1000.0,0.01);
		acc2.Withdrow(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Maria",1000.0,500.0);
		acc3.Withdrow(200.0);
		System.out.println(acc3.getBalance());
		sc.close();

	}

}
