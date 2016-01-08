import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Cards {
	
	public static void main(String[] args){
		
		System.out.println("Enter 5 cards:");
		Scanner sc = new Scanner(System.in);
		String[] cards = new String[5];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = sc.nextLine();
			if(!((cards[i].equals("2")) ||(cards[i].equals("3")) ||(cards[i].equals("4")) ||(cards[i].equals("5")) ||(cards[i].equals("6")) ||
					(cards[i].equals("7")) ||(cards[i].equals("8")) ||(cards[i].equals("9")) ||(cards[i].equals("10")) ||
					(cards[i].equals("J")) ||(cards[i].equals("Q")) ||(cards[i].equals("K")) ||(cards[i].equals("A")))){
				System.out.println("Invalid card!");
			}
		}
		
		TreeMap<String, Integer> hand = new TreeMap<String, Integer>();
		
		for (String card : cards) {
			Integer count = hand.get(card);
			if(count == null){
				count = 0;
			}
			hand.put(card, count + 1);
		}
		
		Set<String> cardKey = hand.keySet();
		
		for (String card : cardKey) {
			int value = hand.get(card);
			if(value == 2){
				System.out.println("You have pair.");
			}
			if(value == 3){
				System.out.println("You have set.");
			}
			if(value == 4){
				System.out.println("You have quads.");
			}
		}
		sc.close();
	}

}
