package main.java.address;
/**
 * ProvinceOrState class
 * @author Saselani
 *
 */
public class ProvinceOrState {

	/**
	 * properties
	 */
	private String code;
	private String name;
	
	/**
	 * Constructor
	 */
	public ProvinceOrState() {}
	
	/**
	 * Constructor
	 * @param code the code of the province
	 * @param name the name of the province
	 */
	public ProvinceOrState(String code, String name)
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
