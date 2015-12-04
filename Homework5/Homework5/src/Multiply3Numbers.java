
public class Multiply3Numbers {

	public static void main(String[] args) {
		
		multiplyNumbers(4, 3, 5);
		multiplyNumbers(5, 6, 2);
		multiplyNumbers(4, 7, 3);
		multiplyNumbers(10, 12, 5);
		multiplyNumbers(20, 14, 17);
	}
	
	public static void multiplyNumbers(int a, int b, int c){
		int result = a*b*c;
		System.out.println("The result is: " + result);
	}

}
