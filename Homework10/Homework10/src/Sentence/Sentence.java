package Sentence;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {

		System.out.println("Enter a sentence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		boolean stratWith = sentence.startsWith("Greeting");
		System.out.println("Sentence start with greeting: " + stratWith);

		boolean endWith = sentence.endsWith(".");
		System.out.println("Sentence edn with full stop: " + endWith);

		boolean contain = sentence.contains("water");
		System.out.println("Sentence contains the word water: " + contain);

		sc.close();

	}

}

