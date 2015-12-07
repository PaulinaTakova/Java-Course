
public class Test {

	public static void main(String[] args) {
		
		Cat[] cat = new Cat[10];
		
		cat[0] = new Cat("Lily", 1);
		cat[1] = new Cat("Beni", 2);
		cat[2] = new Cat("Tom", 3);
		cat[3] = new Cat("Jery", 4);
		cat[4] = new Cat("Oli", 5);
		cat[5] = new Cat("Bela", 6);
		cat[6] = new Cat("Puh", 7);
		cat[7] = new Cat("Blacky", 8);
		cat[8] = new Cat("Bigi", 9);
		cat[9] = new Cat("Kiti", 10);
		
		for (int i = 0; i < cat.length; i++) {
			cat[i].say();
		}
	}

}
