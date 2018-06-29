public class SynchronizedMultithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Task t = new Task();
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(t);
		
		th1.start();
		th2.start();
		
		th2.join();

	}

}
