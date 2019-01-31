package oop;

public class Polymorphism {

	public static void main(String[] args) {
		/*
		 * Polymorphism one name multiple forms. Can be achieved in java using
		 * an interface or abstarct class. A side effect of this is overriding.
		 */
		
		/*
		 * instantiating using the class name as type does not show
		 * any polymorphism. For example below Dog just became dog.
		 */
		Dog dog = new Dog();
		
		/* 
		 * Doing it this way will show how wan identifier can take many
		 * forms.
		 */
		Animal a = new Dog();
		a.type();
		a = new Cat();
		a.type();
		/*
		 *  As shown above, Animal morph into a dog and then changed 
		 *  into a cat. This is how polymorphism is achieved.
		 */
		
		
	}

}
