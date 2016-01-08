import java.util.Set;
import java.util.TreeMap;

public class Words {

	public static void main(String[] args) {
		
		String[] words = {"tree", "house", "apple", "tree", "one","yes", "no", "yes", "hello", "goodbay", "goodbay", "bear", "dog","cat", "cat", "one", "two", "five", "dog", "goodbay"};
		
		TreeMap<String, Integer> counter = new TreeMap<String, Integer>();
		
		for (String word : words) {
			Integer count = counter.get(word);
			if(count == null){
				count = 0;
			}
			counter.put(word, count+1);
		}
		
		Set<String> wordKey = counter.keySet();
		
		for (String word : wordKey) {
			int count = counter.get(word);
			System.out.println(word + ": " + count + " times");
		}
	}

}
