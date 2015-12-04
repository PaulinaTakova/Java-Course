import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		
		printName(name);
		
		sc.close();
	}
	
	public static void printName(String name1){
		System.out.println("Greeting " + name1 +" !");
	}

}
