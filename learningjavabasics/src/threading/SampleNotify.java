package threading;

public class SampleNotify implements Runnable{
	private Thread t;
	private String tName;
	
	private SampleBean sBean;
	
	
	public SampleNotify(String tName, SampleBean sB) {
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
				Thread.sleep(1500);
				sBean.setMsg("Sample10");
				/* notify() will only trigger or notify one thread waiting.
				 * notifyAll() will trigger multiple thread waiting.
				 */
				//sBean.notify(); 
				sBean.notifyAll();		
			} catch (InterruptedException iE) {
				System.out.println(iE);
			}
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
