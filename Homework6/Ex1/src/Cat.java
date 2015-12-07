
public class Cat {
	
	private String name;
	private int age;
	
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0){
		this.age = age;
		}
	}
	
	public void say(){
		System.out.println("My name is " + this.name +" and I am " + this.age + " years old.");
	}
	

}
