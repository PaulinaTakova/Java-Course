
public class Drink extends Stock {
	
	private String coldOrHot;
	private boolean sparkling;
	
	public Drink(double price, boolean availability, String coldOrHot, boolean sparkling) {
		super(price, availability);
		this.coldOrHot = coldOrHot;
		this.sparkling = sparkling;
	}

	public String getColdOrHot() {
		return coldOrHot;
	}

	public void setColdOrHot(String coldOrHot) {
		this.coldOrHot = coldOrHot;
	}

	public boolean getSparkling() {
		return sparkling;
	}

	public void setSparkling(boolean sparkling) {
		this.sparkling = sparkling;
	}
	
	

}
