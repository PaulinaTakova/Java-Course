
public class SUV extends Car{
	
	 private boolean highly;

	public SUV(int price, boolean highly) {
		super(price);
		this.highly = highly;
	}

	public boolean getHighly() {
		return highly;
	}

	public void setHighly(boolean highly) {
		this.highly = highly;
	}
	
	
	

}
