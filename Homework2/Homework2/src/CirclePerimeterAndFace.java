import java.util.Scanner;

public class CirclePerimeterAndFace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle:");
		double r = sc.nextDouble();
		
		System.out.println("The perimeter of the circle is: " + (2*3.14*r));
		System.out.println("The face of the circle is: " + (3.14*r*r));
		
	}

}
// double pi = Math.PI;