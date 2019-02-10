package conditional;

public class Conditions {
	
	
	public boolean ifElse(String input) {
		if (input.equalsIgnoreCase("Carlo")) {
			return true;
		} else if (input.equalsIgnoreCase("Paulo")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean specialIfElse(String input) {
		/*
		 * basically this is (<condition>) ? {Success scenario} : {Failed scenario};
		 */
		return (input.equalsIgnoreCase("Carlo")) ? true : false;
	}
	
	public boolean switchSample(String input) {
		/*
		 * Sample switch block. It is always best to use break after each 
		 * success cases. 
		 */
		boolean result = false;
		switch (input) {
			case "Carlo": result = true; break;
			case "Paulo": result = true; break;
			default: result = false;
		}
		return result;
	}
	
	public boolean switchSampleWithOutBreak(String input) {
		/*
		 * With out the break line the switch will trigger all success block
		 * after the success case.
		 * if successful in carlo it will do paulo and default.
		 * if the input is paulo then it will skip carlo but will process
		 * paulo and default. You need to be very careful with switch cause 
		 * it might produce undesired behavior.
		 */
		boolean result = false;
		System.out.println("Input:"+input);
		switch (input) {
			case "Carlo": System.out.println("Carlo no break");
			case "Paulo": System.out.println("Paulo no break");
			default: System.out.println("Tolentino no break");
		}
		return result;
	}


	public static void main(String[] args) {
		Conditions con = new Conditions();
		System.out.println("IfElse: Carlo = "+con.ifElse("Carlo"));
		System.out.println("IfElse: Paulo = "+con.ifElse("Paulo"));
		System.out.println("IfElse: Hello = "+con.ifElse("Hello"));
		System.out.println("SpecialIfElse: Carlo = "+con.specialIfElse("Carlo"));
		System.out.println("SpecialIfElse: Paulo = "+con.specialIfElse("Paulo"));
		System.out.println("Switch: Carlo = "+con.switchSample("Carlo"));
		System.out.println("Switch: Paulo = "+con.switchSample("Paulo"));
		System.out.println("Switch: Tolentino = "+con.switchSample("Tolentino"));
		con.switchSampleWithOutBreak("Carlo");
		con.switchSampleWithOutBreak("Paulo");
		con.switchSampleWithOutBreak("Hello");

	}

}
