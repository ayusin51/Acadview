public class Task implements Runnable {
	
	public synchronized void run() {
		
		int i;
		for(i = 1; i <= 1000; i++) {
			
			System.out.println(Thread.currentThread().getName() + " " + "State : " + Thread.currentThread().getState() + " " + i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " " + "State : " + Thread.currentThread().getState());
	}

}
