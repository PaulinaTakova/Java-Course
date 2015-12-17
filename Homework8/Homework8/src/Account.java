
public abstract class Account {
	
	private double amount;

	public Account() {
		super();
	}

	public Account(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) throws NegativeMoneyException {
		if(amount < 0){
			throw new NegativeMoneyException("The amont you want to add is negative.");
		}
		this.amount = amount;
	}
	
	
	

}
