
public class Automobile extends Car {
	
	private int fuelConsumption;

	public Automobile(int price, int fuelConsumption) {
		super(price);
		this.fuelConsumption = fuelConsumption;
		
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
	

}
