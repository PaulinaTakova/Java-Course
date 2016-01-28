package DesignPattern;

public class Tablet  extends Device{
	
	private String camera;

	public Tablet() {
		super();
	}

	public Tablet(String model, String brand,String camera) {
		super(model, brand);
		this.camera = camera;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	public void infoAboutDevice(){
		System.out.println("The model: " + getModel() + " The brand: " + getBrand() + " Camera: " + getCamera());
	}

}
