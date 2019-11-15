package multithreading;

public class ThreadByRunnable {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("in new thread " + Thread.currentThread().getName());
				System.out.println("priority is " + Thread.currentThread().getPriority());
			}
		});
		
		thread.setName("Worker thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("we are in the thread: " + Thread.currentThread().getName() + " before new");
		thread.start();
		System.out.println("we are in the thread: " + Thread.currentThread().getName() + " after new");
	}
	
}
