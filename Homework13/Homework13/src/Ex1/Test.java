package Ex1;

public class Test {

	public static void main(String[] args) {
		
		MyThread first = new MyThread();
		MyThread second = new MyThread();
		MyThread third = new MyThread();
		MyThread fourth = new MyThread();
		MyThread fifth = new MyThread();
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		fifth.start();
		
		first.setName("Thread one");
		System.out.println("Hi, my name is " + first.getName() + ".");
		
		second.setName("Thread two");
		System.out.println("Hi, my name is " + second.getName() + ".");
		
		third.setName("Tread three");
		System.out.println("Hi, my name is " + third.getName() + ".");
		
		fourth.setName("Thread four");
		System.out.println("Hi, my name is " + fourth.getName() + ".");
		
		fifth.setName("Thread five");
		System.out.println("Hi, my name is " + fifth.getName() + ".");

	}

}
