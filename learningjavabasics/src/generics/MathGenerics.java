package generics;

/*
 * You can use any capital letter for the generics<T>.
 * For now we are using T for type.
 */
public class MathGenerics<T> {
	
	T x;
	T y;
	
	public MathGenerics(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	public T add(){
		//return (T)this.x + (T)this.y; // Will not work cause number abstract does not provide add
		return x;
	}

	public static void main(String[] args) {
		Integer one = new Integer(1);
		Integer two = new Integer(2);
		/* We now declare the type as Integer object.
		 * And used the diamond operator <> on the instatiation.
		 * It will automatically get the same type on the left hand side.
		 */
		MathGenerics<Integer> mG = new MathGenerics<>(one, two);
		System.out.println(mG.add());

	}

}
