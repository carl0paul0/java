package threading;


/*
 * This is one way to implement threading in java. We extends the Thread class.
 */
public class SampleThreading extends Thread {
	private Thread t;
	private String tName;
	
	public SampleThreading(String tName) {
		this.tName = tName;
		System.out.println("Constructor for thread: "+this.tName);
	}
	
	/* When extending the thread class you need to override the run() method.
	 * 
	 */
	public void run() {
		System.out.println("Running thread: "+this.tName);
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Thread Cycle["+i+"]: "+this.tName);
				/* Sleep triggers a pause to the execution of a current thread.
				 * You can specify the time in milliseconds.
				 */
				sleep(1000);
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
		/* each instance is one thread.
		 * 
		 */
		SampleThreading sT1 = new SampleThreading("Una");
		SampleThreading sT2 = new SampleThreading("Ikalawa");
		SampleThreading sT3 = new SampleThreading("Ikatlo");
		SampleThreading sT4 = new SampleThreading("Ikaapat");
		sT1.start();
		sT2.start();
		sT3.start();
		sT4.start();

	}

}
