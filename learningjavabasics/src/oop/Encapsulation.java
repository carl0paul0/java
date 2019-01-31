package oop;

public class Encapsulation {

	public static void main(String[] args) {
		JavaBean jB = new JavaBean();
		jB.setNum(77);
		jB.setName("Carlo");
		
		/*
		 * You cannotaccess the fields of the java bean directly.
		 * You can only access them via getters and setters.
		 * This is encapsulation.
		 * 
		 */
		System.out.println(jB.getNum()+"="+jB.getName());

	}

}
