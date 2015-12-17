
public class Test {

	public static void main(String[] args) {
		
		Car[] car = new Car[10];
		
		car[0] = new Automobile(2000, 10);
		car[1] = new Automobile(2500, 6);
		car[2] = new Automobile(3300, 8);
		car[3] = new Automobile(2100, 5);
		car[4] = new Automobile(4000, 9);
		car[5] = new SUV(4200, true);
		car[6] = new SUV(3700, false);
		car[7] = new SUV(5200, true);
		car[8] = new SUV(2800, false);
		car[9] = new SUV(3900, true);
		
		
		for (int i = 0; i < car.length; i++) {
			for (int j = 0; j < car.length; j++) {
				if(car[i].getPrice() > car[j].getPrice()){
					Car a = car[i];
					car[i] = car[j];
					car[j] = a;
				}
			}
			
		}
		
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].getPrice());
		}
		

    }
}