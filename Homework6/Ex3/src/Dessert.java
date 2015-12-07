
public class Dessert extends Stock {
	
	private double weight;
	private String brand;

	public Dessert(double price, boolean availability, double weight, String brand) {
		super(price, availability);
		this.weight = weight;
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
