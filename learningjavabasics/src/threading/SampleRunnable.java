package threading;


/* Another way to do threading is to implement the runnable interface.
 * Since extending thread class limits you to only that super class, if you need 
 * to extend a different super class you use Runnable interface.
 * It is almost Identical with Thread.
 */
public class SampleRunnable implements Runnable{
	private Thread t;
	private String tName;
	
	public SampleRunnable(String tName) {
		this.tName = tName;
		System.out.println("Constructor for thread: "+this.tName);
	}


	@Override
	public void run() {
		System.out.println("Running thread: "+this.tName);
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Thread Cycle["+i+"]: "+this.tName);
				/* Sleep triggers a pause to the execution of a current thread.
				 * You can specify the time in milliseconds.
				 */
				Thread.sleep(1000);
			}
		} catch (InterruptedException iE) {
			System.out.println(iE); //sleep() throws an exception
		}
		
	}
	
	/*
	 * start() method triggers the thread.
	 */
	public void start() {
		System.out.println("Starting thread: "+this.tName);
		if(t == null) {
			t = new Thread(this, this.tName);
			t.start(); //this starts the actual thread.
		}
	}
	
	public static void main(String[] args) {
		SampleRunnable sR1 = new SampleRunnable("una");
		SampleRunnable sR2 = new SampleRunnable("ikalawa");
		SampleRunnable sR3 = new SampleRunnable("ikatlo");
		SampleRunnable sR4 = new SampleRunnable("ikaapat");
		sR1.start();
		sR2.start();
		sR3.start();
		sR4.start();

	}

}
