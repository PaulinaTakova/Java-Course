import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row and column of the matrix: ");
		int a = sc.nextInt();
		int[][] arr = new int[a][a];
		int b = 1;
		int col1 = 0;
		int col2 = arr.length-1;
		int row1 = 0;
		int row2 = arr.length-1;
				
		while(b <= a*a){
			for (int i = col1; i <= col2; i++) {
				arr[row1][i] = b++;
			}
			for (int j = row1+1; j <= row2; j++) {
				arr[j][col2] = b++;
			}
			for (int i = col2-1; i >= col1; i--) {
				arr[row2][i] = b++;
			}
			for (int j = row2-1; j >= row1+1; j--) {
				arr[j][col1] = b++;
			}
			
			col1++;
			col2--;
			row1++;
			row2--;
			
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
