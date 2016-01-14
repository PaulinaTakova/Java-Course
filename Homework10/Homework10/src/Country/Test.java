package Country;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		try {
			readFile("..\\files\\countries.txt");
		} catch (IOException e) {
			System.out.println("Error while reading the file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		try {
			writeFile("..\\files\\capitals.txt");
		} catch (IOException e) {
			System.out.println("Error while writing the file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public static void readFile(String path) throws IOException {

		FileReader fileReader = new FileReader(path);

		BufferedReader reader = new BufferedReader(fileReader);

		while (reader.ready()) {
			String line = reader.readLine();
			System.out.println(line);
		}
		System.out.println();
		reader.close();

	}
	
	public static void writeFile(String path) throws IOException{
		
		FileWriter fileWriter = new FileWriter(path, true);
		
		BufferedWriter writer = new BufferedWriter(fileWriter);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<5; i++){
		System.out.println("Enter the capital of the country:");
		String capital = sc.nextLine();
		
		writer.write(capital);
		writer.newLine();
		}
		System.out.println("Writing is success");
		writer.close();
		sc.close();
	}

}
