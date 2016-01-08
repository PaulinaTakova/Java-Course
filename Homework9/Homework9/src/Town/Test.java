package Town;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		HashSet<Town> town = new HashSet<Town>();
		
		Town t1 = new Town("Sofia", "Bulgaria", 1500000);
		Town t2 = new Town("Plovdiv", "Bulgaria", 600000);
		Town t3 = new Town("Varna", "Bulgaria", 330000);
		Town t4 = new Town("Burgas", "Bulgaria", 200000);
		Town t5 = new Town("Blagoevgrad", "Bulgaria", 150000);
		
		town.add(t1);
		town.add(t2);
		town.add(t3);
		town.add(t4);
		town.add(t5);
		
		System.out.println(town.contains(t3));
		
		town.remove(t3);
		System.out.println(town.toString());

	}

}
