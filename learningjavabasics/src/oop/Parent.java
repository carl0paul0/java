package oop;

public class Parent {
	
	private int numOne;
	public int numTwo;
	int numThree;
	protected int numFour;
	
	public void printNumOne() {
		System.out.println("Output 1:"+numOne);
	}
	
	private void printNumTwo() {
		System.out.println("Output 2:"+numOne);
	}
	
	public final void printNumThree() {
		printNumTwo();
		System.out.println("Output 3:"+numOne);
	}
	
	

}
