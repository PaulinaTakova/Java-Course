
public class Meat extends Stock{
	
	private String type;
	private String fitness;

	public Meat(double price, boolean availability, String type, String fitness) {
		super(price, availability);
		this.type = type;
		this.fitness = fitness;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFitness() {
		return fitness;
	}

	public void setFitness(String fitness) {
		this.fitness = fitness;
	}
	
	

}
