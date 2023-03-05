import java.util.ArrayList;

class HeavyWork implements Runnable{
	String name;
	
	HeavyWork(String name){
		this.name = name;
	}
	
	
	
	public void run() {
		for (int i =0; i<5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		System.out.printf("%s done. \n", this.name);
	}
	
}
public class WorkTest  {

	public static void main(String[] args) {
		ArrayList<Thread> ws = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 1; i<5; i++) {
			Thread w = new Thread(new HeavyWork("w"+i));
			w.start();
			ws.add(w);
		}
		
		for(int i = 0; i<4; i++) {
			Thread w = ws.get(i);
			try {
				w.join();
			} catch (InterruptedException e) {
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("elapsed time: %s ms\n", end-start);

	}

}
