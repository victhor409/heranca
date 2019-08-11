package entites;

public class SavingAccount extends Account {

	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Double interestRate,Integer number, String holder, Double balance) {
		super();
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
}
