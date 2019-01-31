package oop;

public class JavaBean {
	/*
	 * This is the most basic sample of encapsulation, a java bean.
	 * You hide the fields using the private access modifiers and
	 * gives access to them ony via public methods.
	 */
	
	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
