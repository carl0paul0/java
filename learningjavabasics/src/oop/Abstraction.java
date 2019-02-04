package oop;

public class Abstraction {

	public static void main(String[] args) {
		/*
		 * You cannot instatiate an abstract class.
		 */
		//AbstractClass aC = new AbstractClass();
		ConcreteClass cC = new ConcreteClass();
		cC.printThis();
		cC.printSomething();
		cC.printNext();
		cC.printAfter();
		cC.printThat();
		
		/*
		 * Now if we want to hide some  of the methods not needed
		 * by the caller we can always use abstraction. Abstraction 
		 * is achieved by using the abstract class as the type of the identifier.
		 * 
		 */
		System.out.println("Abstract Class Abstraction");
		AbstractClass aC = new ConcreteClass();
		aC.printThis();
		aC.printSomething();
		/* We cannot call the printNext and printAfter since
		 * we are forced to only see what is available in the abstarct class.
		 * Abstraction can be achieved using abstract class or an interface.
		 *  
		 */
		System.out.println("Interface Abstraction");
		InterfaceSample iS = new ConcreteClass();
		iS.printThat(); //Only the methods defined in the interface are available
		
	}

}
