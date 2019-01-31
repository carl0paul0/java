package learningjavabasics;
//the line above indicates what package this class belongs to.

public class BasicJavaClass {
//line above is how you declared a class
	
	private int number;
	private String name;
	//the lines above is how you declare an instance variable, or fields.
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printInfo() {
		System.out.println("Name:"+this.name+", Number:"+number);
	}
	// the lines above is an example of a method or actions.
	
	//this is a main method which is runnable.
	public static void main(String[] args) {
		//This is how you instantiate a class to get an object.
		BasicJavaClass bJaCla = new BasicJavaClass();
		bJaCla.setName("Carlo");
		bJaCla.setNumber(77);
		bJaCla.printInfo();
		

	}







}
