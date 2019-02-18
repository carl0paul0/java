package threading;

public class NotifyWaitRun {

	/* must have a shared object monitor for this to work.
	 * 
	 */
	public static void main(String[] args) {
		SampleBean sB = new SampleBean();
		SampleWait sW = new SampleWait("WaitThread", sB);
		SampleWait sW2 = new SampleWait("WaitThread 2", sB);
		SampleWait sW3 = new SampleWait("WaitThread 3", sB);
		SampleNotify sN = new SampleNotify("NotifyThread", sB);
		sW.start();
		sW2.start();
		sW3.start();
		sN.start();

	}

}
