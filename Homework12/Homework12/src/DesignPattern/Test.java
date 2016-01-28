package DesignPattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in, "UTF-8");
		System.out.println("Enter the kind of device you want to add:");
		String device = sc.nextLine();
		DeviceFactory factory = DeviceFactory.getInstance();
		
		System.out.print("Brand: ");
		String brand = sc.nextLine();

		System.out.print("Model: ");
		String model = sc.nextLine();

		if (device.toLowerCase().equals("laptop")) {
			System.out.print("Procesor: ");
			String procesor = sc.nextLine();
			Device newDevice = factory.createDevice(device, brand, model, procesor);

			System.out.println();
			newDevice.infoAboutDevice();
			
		} else if (device.toLowerCase().equals("phone")) {
			System.out.print("Memory: ");
			String memory = sc.nextLine();
			Device newDevice = factory.createDevice(device, brand, model, memory);

			System.out.println();
			newDevice.infoAboutDevice();
			
		} else if (device.toLowerCase().equals("tablet")) {
			System.out.print("Camera: ");
			String camera = sc.nextLine();
			Device newDevice = factory.createDevice(device, brand, model, camera);

			System.out.println();
			newDevice.infoAboutDevice();
			
		} else {
			System.out.print("There isn't an option for adding this type of device!");
		}

		sc.close();

	}

}
