package conditional;

public class AndOr {
	
	public void andSample() {
		/*
		 * using the && as part of the condition will on result if both 
		 * conditions are true. if one of the conditions returns false, 
		 * then it will return false.
		 */
		System.out.println(((1 == 1) && (2 == 2)));
		System.out.println(((1 == 1) && (3 == 2)));
		System.out.println(((2 == 1) && (2 == 2)));
		System.out.println(((5 == 1) && (3 == 2)));
	}
	public void orSample() {
		System.out.println(((1 == 1) || (2 == 2)));
		System.out.println(((1 == 1) || (3 == 2)));
		System.out.println(((2 == 1) || (2 == 2)));
		System.out.println(((5 == 1) || (3 == 2)));
	}

	public static void main(String[] args) {
		AndOr an = new AndOr();
		an.andSample();
		an.orSample();

	}

}
