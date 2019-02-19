package reflections;

public class ReflectionSamples {
	/*
	 * java reflection is used if you want to control classes constructors 
	 * or method used during run time.
	 */
	public void process(String letter) {
		try {
			/* Class to be determined on runtime.
			 * Instead of doing a factory pattern with 26 conditions. You can
			 * use reflection and use the input as a base for locating the class.
			 * You can see below that the class name is dynamic.
			 */
			Class<?> cl = Class.forName("reflections."+letter.toUpperCase());
			Letters o = (Letters)cl.newInstance();
			
			o.printLetters();
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	

	public static void main(String[] args) {
		ReflectionSamples rS = new ReflectionSamples();
		rS.process("A");
		rS.process("B");
		//rS.process("Y"); // will cause a class not found exception
		rS.process("Z");
		
	}

}
