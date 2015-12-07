
public class Vegetable extends Stock {
	
	private boolean fresh;
	private String seasonal;

	public Vegetable(double price, boolean availability, boolean fresh, String seasonal) {
		super(price, availability);
		this.fresh = fresh;
		this.seasonal = seasonal;
	}

	public boolean getFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String getSeasonal() {
		return seasonal;
	}

	public void setSeasonal(String seasonal) {
		this.seasonal = seasonal;
	}
	
	

}
