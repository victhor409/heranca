package entites;

public class BusinessAccount extends Account {

	private Double loaLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number,String holder,Double balance,Double loaLimit) {
		super(number, holder,balance);
		this.loaLimit = loaLimit;
		
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
	@Override
	public void Withdrow (double amount) {
		 super.Withdrow(amount);	
		 balance -= 2.0;
	}
}
