package looping;

import java.util.ArrayList;
import java.util.List;

public class Looping {
	
	private List<String> aList;
	
	public Looping() {
		aList = new ArrayList<String>();
		aList.add("Carlo");
		aList.add("Paulo");
		aList.add("Tolentino");
		
	}
	
	public void forLoop() {
		System.out.println("For Loop:");
		for(int i = 0; i < aList.size(); i++) {
			System.out.println("index["+i+"]:"+aList.get(i));
		}
	}
	
	public void enhancedForLoop() {
		System.out.println("Enhanced For Loop:");
		for(String str: aList) {
			System.out.println(str);
		}
	}
	
	public void whileLoop() {
		System.out.println("while Loop:");
		int ctr = 0;
		while (ctr < aList.size()) {
			System.out.println("index["+ctr+"]:"+aList.get(ctr));
			ctr++;
		}
	}
	public void doWhileLoop() {
		System.out.println("do while Loop:");
		/*
		 * The difference between the do while loop and the
		 * while loops is that the do while will always execute 
		 * at least one round. While loop under certain conditions 
		 * can skip any processing;
		 */
		int ctr = 0;
		do {
				System.out.println("index["+ctr+"]:"+aList.get(ctr));
				ctr++;
		}while (ctr < aList.size());
	}
	
	public void breakLoop() {
		System.out.println("break Loop:");
		/*
		 * adding a break keyword in a loop will trigger the end of the loop.
		 * even if the loop can still progress it will exit the loop block.
		 */
		int ctr = 0;
		while (ctr < aList.size()) {
			if(ctr == 2) {
				System.out.println("Break!");
				break;
			}
			System.out.println("index["+ctr+"]:"+aList.get(ctr));
			ctr++;
		}
	}
	
	public void continueLoop() {
		System.out.println("continue Loop:");
		/*
		 * Adding a continue keyword in a loop will skip the current process and
		 * loop to the next.
		 */
		int ctr = 0;
		while (ctr < aList.size()) {
			if(ctr == 1) {
				System.out.println("Continue!");
				ctr++;
				continue;
			} else {
				System.out.println("index["+ctr+"]:"+aList.get(ctr));
				ctr++;
			}
			
		}
	}
	public static void main(String[] args) {
		Looping lo = new Looping();
		lo.forLoop();
		lo.enhancedForLoop();
		lo.whileLoop();
		lo.doWhileLoop();
		lo.breakLoop();
		lo.continueLoop();
	}

}
