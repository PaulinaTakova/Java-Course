
public class ExchangeOfValues {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;
		
		
		System.out.println("First value of a:" + a);
		System.out.println("First value of b:" + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Second value of b:" + b);
		System.out.println("Second value of a:" + a);

	}

}
