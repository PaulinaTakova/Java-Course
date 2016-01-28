package DesignPattern;

public class DeviceFactory {
	
	private static DeviceFactory instance = new DeviceFactory();

	private DeviceFactory() {
		
	}

	public static DeviceFactory getInstance() {
		return instance;
	}

	public Device createDevice(String device, String model, String brand, String... arg) {
		if (device.equals("tablet")) {
			return new Tablet(model, brand, arg[0]);
		} 
		else if (device.equals("phone")) {
			return new Phone(model, brand, arg[0]);
		} 
		else if (device.equals("laptop")) {
			return new Laptop(model, brand, arg[0]);
		}
		else
			return null;
	}


}
