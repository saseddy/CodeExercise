package main.java.address;

/**
 * This is AddressLineDetail class
 */
public class AddressLineDetail {
	
	/**
	 * AddressLineDetail class properties
	 */
	private String line1;
	private String line2;
	
	/**
	 * AddressLineDetail class constructor
	 */
	public AddressLineDetail() {}
	
	/**
	 * AddressLineDetail class constructor
	 */
	public AddressLineDetail(String line1, String line2)
	{
		this.line1 = line1;
		this.line2 = line2;
	}
	
	/**
	 * getters and setters
	 */
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
}
