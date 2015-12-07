
public class Stock {
	
	private double price;
	private boolean availability;
	
	public Stock(double price, boolean availability){
		this.price = price;
		this.availability = availability;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	

}
