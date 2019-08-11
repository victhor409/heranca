package entites;

public class BusinessAccount extends Account {

	private Double loaLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Double loaLimit,String holder,Integer number,Double balance) {
		super();
		this.loaLimit = loaLimit;
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public Double getLoaLimit() {
		return loaLimit;
	}

	public void setLoaLimit(Double loaLimit) {
		this.loaLimit = loaLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loaLimit) {
		balance += amount - 10.0;
		}
	}
}
