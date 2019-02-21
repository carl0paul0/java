package sample;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*This is a bean that will be mapped as an xml via annotations.
 * Remember to implement Serializable interface.
 */

@XmlRootElement(name="personalinfo")
public class PersonalInfo implements Serializable {
	private static final long serialVersionUID = -6122863950403127776L;
	
	private String name;
	private String email;
	private int number;
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	@XmlElement
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
