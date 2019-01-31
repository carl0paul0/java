package learningjavabasics;

public class AccessModifiersJava {
	
	/*
	 * Public instance variable means accessible to all.
	 */
	public int numOne;
	/*
	 * Private instance variable means accessible only in the class.
	 */
	private int numTwo;
	/*
	 * Protected instance variable means accessible as 
	 * long as its in the same package or subclasses
	 */
	protected int numThree;
	/*
	 * Default or no access modifier means accessible 
	 * only in the same package.
	 */
    int numFour;
	
	/*
	 * Adding the "static" keyword to the variable, 
	 * turns it into a class variable.
	 * 
	 */
	public static int numAll = 777;
	/*
	 * Adding the "final" keyword turms the variable in to a constant.
	 * The first value assigned to it will be the last value it holds.
	 * You will never be able to change it after.
	 * This can also apply to an instance variable.
	 */
	public static final int NUM_LAST = 77;
	
	public int getNumOne() {
		return numOne;
	}
	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}
	public int getNumTwo() {
		return numTwo;
	}
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	public int getNumThree() {
		return numThree;
	}
	public void setNumThree(int numThree) {
		this.numThree = numThree;
	}
	public int getNumFour() {
		return numFour;
	}
	public void setNumFour(int numFour) {
		this.numFour = numFour;
	}
	
	public static void main(String[] args) {
		/*
		 * How to access a class variable.
		 * You no longer need to instantiate an object 
		 * to access the class variable.
		 * <class name>.<class variable name>
		 */
		System.out.println("Class Variable:"+AccessModifiersJava.numAll); 
		System.out.println("Class Variable (Constatnt):"+AccessModifiersJava.NUM_LAST);
		
		/*
		 * Changing the value of a static variable will affect all that access it.
		 * Basically it is shared by all.
		 */
		AccessModifiersJava.numAll = 177;
		System.out.println("Class Variable:"+AccessModifiersJava.numAll); 
		/*
		 * You cannot change a value of a final variable. You will get an error.
		 */
		//AccessModifiersJava.NUM_LAST = 1777;
		
		/*
		 * Review on how to access an instance variable.
		 */
		AccessModifiersJava aJa = new AccessModifiersJava();
		System.out.println("Instance Variable:"+aJa.numOne);
		aJa.numOne = 77;
		System.out.println("Instance Variable(Init):"+aJa.numOne);
		System.out.println("Instance Variable Getter:"+aJa.getNumTwo());
		aJa.setNumTwo(77);
		System.out.println("Instance Variable After Setter:"+aJa.getNumTwo());
		

	}


}
