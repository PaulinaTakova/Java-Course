package WritingInTwoFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		try {
			readingWriting("..\\files\\text.txt", "..\\files\\even.txt", "..\\files\\odd.txt");
		} catch (IOException e) {
			System.out.println("Error.");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}
	
	public static void readingWriting(String path, String path2, String path3) throws IOException{
		
		FileReader fileReader = new FileReader(path);
		BufferedReader reader = new BufferedReader(fileReader);
		
		FileWriter fileWriter = new FileWriter(path2, true);
		BufferedWriter writer = new BufferedWriter(fileWriter); 
		
		FileWriter fileWriter2 = new FileWriter(path3, true);
		BufferedWriter writer2 = new BufferedWriter(fileWriter2);
		
		int counter = 0;
		while(reader.ready()){
			String line = reader.readLine();
			counter++;
			if(counter % 2 == 0){
				writer.write(line);
				writer.newLine();
			}else{
				writer2.write(line);
				writer2.newLine();
			}
		}
		System.out.println("Reading / Writing success.");
		reader.close();
		writer.close();
		writer2.close();
	}

}