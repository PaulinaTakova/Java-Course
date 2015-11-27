import java.util.Scanner;

public class NumbersFrom0To999 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number from 0 to 999:");
		Integer num = sc.nextInt();

		String[][] arr = { { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" },
				{ "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen",
						"nineteen" },
				{ "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" } };

		String hun = "hundred ";
		String numb = num.toString();

		if (numb.length() > 3) {
			System.out.println("Error");
			System.exit(0);
		}

		if (numb.length() > 2) {
			int check = Integer.parseInt(numb.substring(1, 3));
			if (check > 10 && check < 20) {
				int firstDigit = Integer.parseInt(numb.substring(0, 1));
				int thirdDigit = Integer.parseInt(numb.substring(2, 3));
				System.out.println(arr[0][firstDigit] + hun + "and " + arr[1][thirdDigit]);
			} else {
				int firstDigit = Integer.parseInt(numb.substring(0, 1));
				int secondDigit = Integer.parseInt(numb.substring(1, 2));
				int thirdDigit = Integer.parseInt(numb.substring(2, 3));
				if (thirdDigit == 0) {
					if (secondDigit == 0) {
						System.out.println(arr[0][firstDigit] + hun + arr[2][secondDigit]);
					} else {
						System.out.println(arr[0][firstDigit] + hun + "and " + arr[2][secondDigit]);
					}
				} else {
					System.out.println(
							arr[0][firstDigit] + hun + "and " + arr[2][secondDigit] + " " + arr[0][thirdDigit]);
				}
			}
		} else if (numb.length() > 1) {
			int check = Integer.parseInt(numb.substring(0, 2));
			if (check > 10 && check < 20) {
				int Digit = Integer.parseInt(numb.substring(1, 2));
				System.out.println(arr[1][Digit]);
			} else {
				int firstDigit = Integer.parseInt(numb.substring(0, 1));
				int secondDigit = Integer.parseInt(numb.substring(1, 2));
				if (secondDigit == 0) {
					System.out.println(arr[2][firstDigit]);
				} else {
					System.out.println(arr[2][firstDigit] + " " + arr[0][secondDigit]);
				}
			}
		} else {
			System.out.println(arr[0][num]);
		}
		sc.close();
	}
}
