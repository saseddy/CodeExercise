package main.java.address;
/**
 * 
 * @author Saselani
 * 
 * This is a Country class 
 *
 */
public class Country {

	/**
	 * properties
	 */
	private String code;
	private String name;
	
	/**
	 * Constructor 
	 */
	public Country() {}
	/**
	 * Constructor
	 * @param code the code of the country
	 * @param name the name of the country
	 */
	public Country(String code, String name)
	{
		this.code = code;
		this.name = name;
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
