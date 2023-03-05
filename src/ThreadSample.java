import java.util.ArrayList;

public class ThreadSample implements Runnable{
	
	int seq;
	
	public ThreadSample(int seq) {
		this.seq = seq;
	}
	
	
	public void run() {
		System.out.println(this.seq + " thread start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		};
		System.out.println(this.seq+" thread end");
	}

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		
		for (int i = 0; i<10; i++) {
		
			Thread ts = new Thread(new ThreadSample(i));
			ts.start();
			threads.add(ts);
		}
		
		for(int i=0; i<10;i++) {
			Thread ts = threads.get(i);
			
				try {
					ts.join();
				} catch (InterruptedException e) {
				}
		}
		
		System.out.println("main end");
	}

}
