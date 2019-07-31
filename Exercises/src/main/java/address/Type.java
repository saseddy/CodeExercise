package main.java.address;

/**
 * 
 * @author Saselani
 * Type Class
 */
public class Type {
	
	/**
	 * properties
	 */
	private String code;
	private String name;
	
	/**
	 * Constructor
	 */
	public Type() {}
	
	/**
	 * Constructor
	 * @param code the code of the type
	 * @param name the name of the type
	 */
	public Type(String code, String name)
	{
		this.code = code;
		this.name = name;
	}
	
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
