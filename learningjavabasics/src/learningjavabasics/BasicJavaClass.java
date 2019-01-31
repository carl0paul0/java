package learningjavabasics;
//the line above indicates what package this class belongs to.

/*
 * The lines below are how imports are declared.
 */
import java.util.ArrayList;



/*
 * The line below is how you declare a class.
 * You need the "class" keyword and the class name.
 * When saving a class file you need to make sure 
 * that the classname and filename is the same.
 * The only access modifier applicable to the class are:
 * the default of public.
 */
public class BasicJavaClass {

	/*
	 * The lines below is how you declare an instance variable.
	 * Instance variables have default values. int is automatically 0
	 *  while String is null.
	 *  Access modifiers applies to instance variables. You can 
	 *  use: public, default, protected and private.
	 *  
	 *  You can use primitives or objects as instance variables.
	 *  primitives: byte, short, int, long, float, double, 
	 *  char, boolean
	 *  String is an object same as Arraylist
	 */
	private int number;
	private String name;
	private ArrayList<String> arrList;
	
	/*
	 * Method signature is like the code block below.
	 * Access modifiers can be added to them like: public
	 * default, protected and private.
	 * 
	 *  <access modifier> <return type> <method name>(){}
	 */
	public ArrayList<String> getArrList() {
		return arrList;
	}

	public void setArrList(ArrayList<String> arrList) {
		this.arrList = arrList;
	}
	
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
	
	/*
	 * this is a main method which is runnable. only one main method 
	 * can exist per class.
	 */
	public static void main(String[] args) {
		/*
		 * This is how you instantiate a class to get an object.
		 * <Class name> <identifier> = new <Class constructor>();
		 */
		BasicJavaClass bJaCla = new BasicJavaClass();
		
		/* 
		 * You can access a method by using the identifier like this:
		 * <identifier>.<method name>(<parameters optional>);
		 * 
		 */
		bJaCla.setName("Carlo");
		bJaCla.setNumber(77);
		bJaCla.printInfo();
		

	}









}
