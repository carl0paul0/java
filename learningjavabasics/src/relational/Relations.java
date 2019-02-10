package relational;

public class Relations {
	private int ex;
	private int why;
	
	/*
	 * We are not using the default constructor. We are now using
	 * a constructor that will accept 2 int input.
	 */
	public Relations(int x, int y) {
		System.out.println("=================================");
		System.out.println("Inputs are: "+x+" and "+y);
		this.ex = x;
		this.why = y;
	}
	
	public void equalsRelation() {
		System.out.println("Testing the == relation of  2 int");
		if (this.ex == this.why) {
			System.out.println(this.ex+" is equal to "+ this.why);
		} else {
			System.out.println(this.ex+" is not equal to "+ this.why);
		}
		
	}
	
	public void notEqualsRelation() {
		System.out.println("Testing the != relation of  2 int");
		if (this.ex != this.why) {
			System.out.println(this.ex+" is not equal to "+ this.why);
		} else {
			System.out.println(this.ex+" is equal to "+ this.why);
		}
		
	}
	
	public void greatLessEqualsRelation() {
		System.out.println("Testing the >= or <= relation of  2 int");
		if (this.ex >= this.why) {
			System.out.println(this.ex+" is greater than or equals to "+ this.why);
		} else if (this.ex <= this.why) {
			System.out.println(this.ex+" is less than or equals to "+ this.why);
		} else {
			System.out.println("No relationships were established.");
		}
		
	}

	public void greatLessRelation() {
		System.out.println("Testing the > and < relation of  2 int");
		if (this.ex > this.why) {
			System.out.println(this.ex+" greater than "+ this.why);
		} else if (this.ex < this.why){
			System.out.println(this.ex+" is less than "+ this.why);
		} else {
			System.out.println("No relationships were established.");
		}
	}
	
	public static void main(String[] args) {
		Relations rel = new Relations(1, 2);
		rel.equalsRelation();
		rel.notEqualsRelation();
		rel.greatLessRelation();
		rel.greatLessEqualsRelation();
		rel = new Relations(3, 2);
		rel.equalsRelation();
		rel.notEqualsRelation();
		rel.greatLessRelation();
		rel.greatLessEqualsRelation();
		rel = new Relations(4, 4);
		rel.equalsRelation();
		rel.notEqualsRelation();
		rel.greatLessRelation();
		rel.greatLessEqualsRelation();

	}

}
