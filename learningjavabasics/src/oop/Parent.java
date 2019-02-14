package oop;

public class Parent {
	
	private int numOne;
	public int numTwo;
	int numThree;
	protected int numFour;
	
	/*Parent(){
		//if you do not have a default constructor you need to do the 
		// super(x) sample. at least one default constructor needed if you
		// do not want to write a specific constructor in the child class.
	}*/
	
	Parent(int x){
		
	}
	
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
