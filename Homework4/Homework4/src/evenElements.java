
public class evenElements {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("The sum of even numbers is: " + sum);

	}

}