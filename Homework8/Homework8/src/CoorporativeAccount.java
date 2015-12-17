
public class CoorporativeAccount extends Account{
	
	private String nameOfCompany;
	private long bulstat;
	
	public CoorporativeAccount() {
		super();
	}
	
	public CoorporativeAccount(double amount, String nameOfCompany, long bulstat) {
		super(amount);
		this.nameOfCompany = nameOfCompany;
		this.bulstat = bulstat;
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	public long getBulstat() {
		return bulstat;
	}

	public void setBulstat(long bulstat) {
		this.bulstat = bulstat;
	}
	
	public long invalidAccount(CoorporativeAccount obj) throws InvalidAccountException {
		if(obj instanceof Account){
			System.out.println("The bulstat of the company is: " + obj.getBulstat());
			return obj.getBulstat();
		}else {
			throw new InvalidAccountException("Invalid coorporative account.");
		}
		
	}

}