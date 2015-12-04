
public class SymmetricNumber {

	public static void main(String[] args) {
		for (Integer i = 10; i <= 999; i++) {
			if(symmetricNUmbers(i)){
				System.out.print(i + " ");
			}
		}
	}

	public static boolean symmetricNUmbers(int b) {
		
		boolean a = false;
		String num = Integer.toString(b);
		
		for (int i = 0; i < num.length() / 2; i++) {
			if (num.charAt(i) == num.charAt(num.length() - 1 - i)) {
				a = true;
			}else{
			    a = false;
				break;
			}
		}
		return a;
	}

}
