import java.util.Scanner;

 class IntervalsEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		if(a >= 1 && a <= 5 && a%2 == 0){
			System.out.println("The number is in interval [1;5] and even.");
		} else if(a <= 5 && a%2 != 0){
			System.out.println("The number is in interval [1;5] and odd");
		}
		
		if(a >= 6 && a<= 15 && a%3 == 0){
			System.out.println("The numer is in interval [6;15] and divided by 3.");
		}else if(a >= 6 && a <= 15 && a%3 != 0) {
			System.out.println("The number is in interval [6;15] and it is not divided by 3.");
		}
		
		if(a > 15){
			System.out.println("The number is positive.");
		} else if(a < 0){
			System.out.println("The number is negative.");
		}else if(a == 0){
			System.out.println("The number is zero.");
		}
		sc.close();
	}

}
