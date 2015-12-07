
public class Fruit extends Stock {
	
	private String origin;
	private String howToEat;

	public Fruit(double price, boolean availability, String origin, String howToEat) {
		super(price, availability);
		this.origin = origin;
		this.howToEat = howToEat;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getHowToEat() {
		return howToEat;
	}

	public void setHowToEat(String howToEat) {
		this.howToEat = howToEat;
	}
	
	

}
