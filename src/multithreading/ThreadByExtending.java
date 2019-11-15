package multithreading;

public class ThreadByExtending {

	public static void main(String[] args) {
		Thread newThread = new NewThread();
		
		newThread.start();
	}
	
	private static class NewThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello from " + this.getName());
		}
	}
}
