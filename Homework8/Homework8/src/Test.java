
public class Test {

	public static void main(String[] args) {
		
		PersonalAccount p = new PersonalAccount(552.3, "Ivan", 901214256);
		CoorporativeAccount c = new CoorporativeAccount(789.5, "IBS", 23659874);
		
		try{
		p.invalidAccount(p);
		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try{
			c.invalidAccount(c);
		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println();
		
		try{
			p.setAmount(-52.6);
		} catch (NegativeMoneyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println();
		
		try{
			c.setAmount(-92.45);
		} catch (NegativeMoneyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

    }
}