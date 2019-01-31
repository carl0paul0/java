package learningjavabasics;


/*
 * Inheritance is achieved by using the "extends" keyword,
 * followed by the parent class. Only one parent class can be used 
 * for each classes. 
 */
public class Child extends Parent{
	
	/*
	 * You cannot override a final method from the super class.
	 */
	//public void printNumThree() {
	//	printNumTwo();
	//	System.out.println("Output 3:"+numOne);
	//}
	/*
	 * You can call the existing method using "this" keyword. It is a 
	 * reference to what is in this class. Basically everything
	 * declared here.
	 */
	public void sampleMethod() {
		super.printNumThree();
	}
	
	public void sampleMethodTwo() {
		this.printNumOne();
	}
	/*
	 * You want to access something from the parent class you 
	 * need to use the "super" key word. 
	 */
	public void sampleMethodThree() {
		super.printNumOne();
		
		/*
		 * Basically this and super are referencing the same variable.
		 */
		this.numThree = 10;
		System.out.println("Super:"+ super.numThree);
		System.out.println("this:"+ this.numThree);
		super.numThree = 11;
		System.out.println("Super:"+ super.numThree);
		System.out.println("this:"+ this.numThree);
		
		System.out.println("This vs Super:"+this.numThree+"="+ super.numThree);
		
		/*
		 * this and super reference different methods
		 */
		this.printNumOne();
		super.printNumOne();
	}
	
	/*
	 * Override annotation indicates that it nnedds to check if this method signature
	 * is already existing from the parent. 
	 */
	@Override
	public void printNumOne() {
		
		/*
		 * Have to change the numOne variable since it is not accessible 
		 * in this child class.
		 */
		
		System.out.println("Output 1(Sub):"+super.numThree);
	}
	
	
}
