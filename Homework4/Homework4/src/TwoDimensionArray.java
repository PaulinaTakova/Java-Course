import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row and column of the matrix: ");
		int a = sc.nextInt();
		int b = 1;
		int[][] arr = new int[a][a];

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i][j] = b++;
			}
			
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
