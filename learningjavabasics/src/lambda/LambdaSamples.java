package lambda;

public class LambdaSamples {
	/* Introduced with Java 1.8
	 * Lambda expression is a step back for java. An object oriented prog lang
	 * going back to function based programming.
	 * 
	 * Sample syntax (parameters) -> <expression body>
	 */
	
	public static void main(String[] args) {
		/* Must have an interface. Lambda is an inline implementation
		 * of a functional interface. parameters and return types must
		 * be matched.
		 * 
		 */
		MathSample add = (int x, int y) -> x + y;
			
		System.out.println(add.operate(1, 2));
		System.out.println(add.operate(6, 28));
		System.out.println(add.operate(17, 26));
		
		/* You can interpret the interface any way you want.
		 * Provided it has the same parameters and return type.
		 */
		MathSample sub = (int x, int y) -> x - y;
		System.out.println(sub.operate(1, 2));
		System.out.println(sub.operate(6, 28));
		System.out.println(sub.operate(17, 26));
		
		MathSample mult  = (int x, int y) -> x * y;
		System.out.println(mult.operate(1, 2));
		System.out.println(mult.operate(6, 28));
		System.out.println(mult.operate(17, 26));
	}

}
