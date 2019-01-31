package oop;

public class ConcreteClass extends AbstractClass implements InterfaceSample{

	/*
	 * Forces you to override the abstarct method.
	 */
	@Override
	void printSomething() {
		System.out.println("Test Abstract:"+777);

	}
	
	void printNext() {
		System.out.println("Test:"+7777);

	}
	void printAfter() {
		System.out.println("Test:"+77777);

	}

	@Override
	public void printThat() {
		System.out.println("Test Interface:"+777777);
		
	}

}
