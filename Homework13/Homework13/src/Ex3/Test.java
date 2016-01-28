package Ex3;

public class Test {

	public static void main(String[] args) {
		
		final MyThread newThread = new MyThread();
		
		new Thread() {
			public void run() {
				newThread.printNums();
			}
		}.start();
		
		new Thread() {
			public void run() {
				newThread.ptintRunning();
			}
		}.start();

	}

}
