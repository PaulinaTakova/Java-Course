package DesignPattern;

public class Device {
	
	private String model;
	private String brand;
	
	public Device() {
		super();
	}

	public Device(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void infoAboutDevice(){
		System.out.println("The model:" + model + " The brand: " + brand);
	}

}
