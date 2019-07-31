package main.java.address;

/**
 * 
 * @author Saselani
 *
 */
public class AddressValidator {
	
	private static final String VALUE_NOT_SET = "Value not set";
	
	/**
	 * This methods validates an address
	 * @param address
	 * @throws InvalidAddressException
	 */
	public String validateAddress(Address address)
	{
		StringBuilder errors = new StringBuilder();
		address = buildAddress(address);
		boolean validpostalCode = Util.isNumeric(address.getPostalCode().toString());
		if(validpostalCode == false)
		{
			errors.append("Postal code can only be numeric. ").append("\n");
		}
		
		if(address.getAddressLineDetail().getLine1() == VALUE_NOT_SET)
		{
			errors.append("At least one address line is required. ").append("\n");
		}
		
		if(address.getCountry().getName() == VALUE_NOT_SET)
		{
			errors.append("Country is required. ").append("\n");
		}
		else
		{
			if(address.getCountry().getCode().equals("ZA"))
				{
					if(address.getProvinceOrState().getName() == VALUE_NOT_SET)
						errors.append("Province is required. ").append("\n");
				}
		}

		return errors.toString();
		
		// void --if(errors.length() > 0)
		// throw new InvalidAddressException("The provided address is invalid: " +errors);
	}
	
	/**
	 * This method builds an address and setting a default values to field with nulls or blanks
	 * @param address
	 * @return the formatted address
	 */
	public Address buildAddress (Address address)
    {
		 String suburbOrDistrict = "";
		 String lastUpdated = "";
		 String cityOrTown = "";
		 String postalCode = "";
		 
    	 //validate postal code
		 if(address.getPostalCode() == null)
		 {
			 postalCode = VALUE_NOT_SET;
		 }
		 else
		 {
    	   postalCode = Util.isNullorBlank(address.getPostalCode().toString())  ? VALUE_NOT_SET : address.getPostalCode();
		 }
    	 
    	 //validate city/town
		 if(address.getCityOrTown() == null)
		 {
			 cityOrTown = VALUE_NOT_SET;
		 }
		 else
		 {
    	     cityOrTown = Util.isNullorBlank(address.getCityOrTown().toString()) ? VALUE_NOT_SET  : address.getCityOrTown();
		 }
    	 
    	 //validate last updated date
		 if(address.getLastUpdated() == null)
		 {
			 lastUpdated =  VALUE_NOT_SET;
		 }
		 else
		 {
    	    lastUpdated = Util.isNullorBlank(address.getLastUpdated().toString()) ? VALUE_NOT_SET : address.getLastUpdated();
		 }
    	 
   
    	 //validate district
    	 if(address.getSuburbOrDistrict() == null)
    	 {
    		 suburbOrDistrict = VALUE_NOT_SET; 
    	 }
    	 else
    	 {
    		  suburbOrDistrict  = Util.isNullorBlank(address.getSuburbOrDistrict().toString()) ? VALUE_NOT_SET : address.getSuburbOrDistrict();
    	 }
    	
    	 address.setType(validateAddressType(address));
    	 address.setAddressLineDetail(validateAddressLineDetail(address));
    	 address.setProvinceOrState(validateProviceOrState(address));
    	 address.setCityOrTown(cityOrTown);
    	 address.setCountry(validateCountry(address));
    	 address.setPostalCode(postalCode);
    	 address.setLastUpdated(lastUpdated);
    	 address.setSuburbOrDistrict(suburbOrDistrict);
   	 
   	 return address;
    }

	/**
	 * This method validates an addressType and assign a default value if the field is blank or null
	 * @param address
	 * @return the formatted type
	 */
	public Type validateAddressType(Address address)
	{
		 String addressTypeCode = "";
   	     String addressType = "";
   	     
   	     //validate address type
		 if(address.getType() == null)
    	 {
    		 addressTypeCode = VALUE_NOT_SET;
    		 addressType = VALUE_NOT_SET;
    	 }
    	 else
    	 {
    		 addressTypeCode = Util.isNullorBlank(address.getType().getCode().toString()) ? VALUE_NOT_SET : address.getType().getCode().toString();
    		 addressType = Util.isNullorBlank(address.getType().getName().toString()) ? VALUE_NOT_SET : address.getType().getName().toString();
    	 }
		 
		 Type type = new Type(addressTypeCode, addressType);
		 
		 return type;
	}
	
	/**
	 * This method validates the address line detail and assigns a default value if the field is blank or null
	 * @param address
	 * @return the formatted address line
	 */
	public AddressLineDetail validateAddressLineDetail(Address address)
	{
		//Validate Line Address
		String line1 = "";
   	 String line2 = "";
   	 if(address.getAddressLineDetail() == null)
   	 {
   		 line1 = VALUE_NOT_SET;
   		 line2 = VALUE_NOT_SET;
   	 }
   	 else
   	 {
   	  line1 = Util.isNullorBlank(address.getAddressLineDetail().getLine1().toString()) ?  VALUE_NOT_SET : address.getAddressLineDetail().getLine1();
   	  line2  = Util.isNullorBlank(address.getAddressLineDetail().getLine2().toString()) ? VALUE_NOT_SET : address.getAddressLineDetail().getLine2();
   	 }
   	 AddressLineDetail addressLineDetail = new AddressLineDetail(line1,line2);
   	 return addressLineDetail;
	}
	
	/**
	 * This method validate the Province or state and assigns a default value if the field is blank or null
	 * @param address
	 * @return the formatted province or state
	 */
	public ProvinceOrState validateProviceOrState(Address address)
	{
    	 String provinceCode = "";
    	 String provinceName = "";
    	  
    	 //Validate province
    	 if(address.getProvinceOrState() == null)
    	 {
    		 provinceCode = VALUE_NOT_SET;
    		 provinceName = VALUE_NOT_SET;
    	 }
    	 else
    	 {
    	  provinceCode = Util.isNullorBlank(address.getProvinceOrState().getCode().toString()) ?  VALUE_NOT_SET : address.getProvinceOrState().getCode();
    	  provinceName = Util.isNullorBlank(address.getProvinceOrState().getName().toString()) ?  VALUE_NOT_SET : address.getProvinceOrState().getName();
    	 }
    
    	 ProvinceOrState provinceOrState = new ProvinceOrState(provinceCode, provinceName);
    	 
    	 return provinceOrState;
		
	}
	
	/**
	 * This method validates the country and assigns a default value if the field is blank or null
	 * @param address
	 * @return the formatted country
	 */
	public Country validateCountry(Address address)
	{
    	 String countryCode = "";
    	 String countryName = "";
    
    	 //Validate country
    	 if(address.getCountry() == null)
    	 {
    		 countryCode = VALUE_NOT_SET;
    		 countryName = VALUE_NOT_SET;
    	 }
    	 else
    	 {
    	   countryCode = Util.isNullorBlank(address.getCountry().getCode().toString()) ?  VALUE_NOT_SET : address.getCountry().getCode();
    	   countryName = Util.isNullorBlank(address.getCountry().getName()) ? VALUE_NOT_SET :address.getCountry().getName();
    	 }
    	 Country country = new Country(countryCode, countryName);
    	 
    	 return country;
	}

}
