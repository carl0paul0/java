package threading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingSamples implements Runnable{
	private Thread t;
	private String tName;
	private ReentrantLock lk;
	
	public LockingSamples(String tName, ReentrantLock lk) {
		this.tName = tName;
		this.lk = lk;
		System.out.println("Constructor for thread: "+this.tName);
	}
	
	@Override
	public void run() {
		System.out.println("Running thread: "+this.tName);
		for(int i = 0; i <= 10; i++) {
			System.out.println("Thread Cycle Step 1["+i+"]: "+this.tName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			lk.lock();//start of the lock block
					for(int i = 0; i <= 10; i++) {
						System.out.println("Thread Cycle Step 2 locked["+i+"]: "+this.tName);
						Thread.sleep(1000);
					}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lk.unlock();// always put this in a finally block to avoid deadlocks
		}
		for(int i = 0; i <= 10; i++) {
			System.out.println("Thread Cycle Step 3["+i+"]: "+this.tName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void start() {
		System.out.println("Starting thread: "+this.tName);
		if(t == null) {
			t = new Thread(this, this.tName);
			t.start(); //this starts the actual thread.
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * Remember to use the same lock for all threads and not make
		 * new instances of a lock everytime. If you make new locks for each 
		 * thread it will not work.
		 */
		ReentrantLock rL = new ReentrantLock();
		LockingSamples ls1 = new LockingSamples("Lock 1",rL);
		LockingSamples ls2 = new LockingSamples("Lock 2",rL);
		LockingSamples ls3 = new LockingSamples("Lock 3",rL);
		LockingSamples ls4 = new LockingSamples("Lock 4",rL);
		LockingSamples ls5 = new LockingSamples("Lock 5",rL);
		ls1.start();
		ls2.start();
		ls3.start();
		ls4.start();
		ls5.start();
	}



}
