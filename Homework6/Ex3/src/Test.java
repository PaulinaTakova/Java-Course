
public class Test {

	public static void main(String[] args) {
		
		Stock[] stock = new Stock[10];
		
		stock[0] = new Meat(10.2, true, "chiken", "28.12.2015" );
		stock[1] = new Fruit(2.5, false, "Bulgaria", ".......");
		stock[2] = new Drink(1.95, true, "cold", true);
		stock[3] = new Dessert(0.5, true, 50, "Mura");
		stock[4] = new Vegetable(1.2, false, true, "spring");
		stock[5] = new Meat(9.3, true, "beef", "10.01.2016");
		stock[6] = new Fruit(3.5, true, "Germany", ".......");
		stock[7] = new Drink(2.15, false, "hot", false);
		stock[8] = new Dessert(2.5, true, 100, "Lindt");
		stock[9] = new Vegetable(1.6, true, true, "summer");
			
		for (int i = 0; i < stock.length; i++) {
			System.out.println(stock[i].getPrice() + " " + stock[i].getAvailability());
		}		

	}

}
