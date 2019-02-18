package threading;

public class SampleWait implements Runnable{
	private Thread t;
	private String tName;
	
	private SampleBean sBean;
	
	
	public SampleWait(String tName, SampleBean sB) {
		this.tName = tName;
		this.sBean = sB;
		sBean.setMsg("Sample1");
		System.out.println("Constructor for thread: "+this.tName);
	}


	@Override
	public void run() {
		System.out.println("Running thread: "+this.tName);
		synchronized(sBean){
			try {
					System.out.println("Waiting to get notified:"+this.tName);
					/* wait() method will pause the execution of a thread.
					 * can be used with notify() and notifyAll().
					 */
					sBean.wait();
						
			} catch (InterruptedException iE) {
				iE.printStackTrace();
			}
			System.out.println("Notified:"+this.tName);
			System.out.println(sBean.getMsg());
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
	

}
