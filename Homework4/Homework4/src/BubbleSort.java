
public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 12, 20, 2, 5, 11, 17, 8, 10 };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int cnt = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = cnt;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}