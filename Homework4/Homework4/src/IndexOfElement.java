import java.util.Scanner;

public class IndexOfElement {

	public static void main(String[] args) {
		
		int[] arr = {9, 1, 3, 4, 8, 6, 2, 5, 7};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nubmer between 1 and 9:");
		int a = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == a){
				System.out.println("The index of number is: " + i);
			}
		}
		
		sc.close();
		
	}

}
