package Ex2;

import java.util.Random;

public class MyThread extends Thread{
	
	Random rand=new Random();
	
	public void run(){
		System.out.println("The thread is started.");
		try{
			MyThread.sleep(1000*(rand.nextInt(10)));			
		}catch(Exception e){
			e.getMessage();
		}
		System.out.println("The thread complete!");
	}
	
}
