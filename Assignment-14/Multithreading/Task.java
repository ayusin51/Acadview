public class Task implements Runnable {
	
	public synchronized void run() {
		
		int i;
		for(i = 1; i <= 1000; i++) {
			
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
