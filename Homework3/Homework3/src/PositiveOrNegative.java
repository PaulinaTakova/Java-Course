import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first real number:");
		double a = sc.nextDouble();
		System.out.println("Rnter the second real number:");
		double b = sc.nextDouble();
		
		if((a/b) > 0){
			System.out.println("The sign is +.");
		}else{
			System.out.println("The sign is -.");
		}
		sc.close();
	}

}
