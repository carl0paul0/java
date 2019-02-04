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
		return (input.equalsIgnoreCase("Carlo")) ? true : false;
	}
	
	public boolean switchSample(String input) {
		boolean result = false;
		switch (input) {
			case "Carlo": result = true; break;
			case "Paulo": result = true; break;
			default: result = false;
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

	}

}
