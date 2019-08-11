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
		
		Account acc = new Account(1001,"Alex",0.0);
		BusinessAccount bcc = new BusinessAccount(500.00,"Maria",1002,0.0);
		
		//UPCASTING
		
		Account acc2 = bcc;
		Account acc3 = new BusinessAccount(500.00,"Maria",1002,0.0);
		Account acc4 = new SavingAccount(0.01,1004,"Bob",0.0);
		
		//DOWNCASTING
		
		BusinessAccount acc5 = (BusinessAccount)acc2;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount)acc2;
			acc6.loan(200.00);
			System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc7 = (SavingAccount)acc4;
			acc7.updateBalance();
			System.out.println("Update");
			
		}
		
		
		sc.close();

	}

}
