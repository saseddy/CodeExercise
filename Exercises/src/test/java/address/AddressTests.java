package test.java.address;
import main.java.address.Address;
import main.java.address.AddressLineDetail;
import main.java.address.AddressPrinter;
import main.java.address.Country;
import main.java.address.ProvinceOrState;
import main.java.address.Type;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddressExcerciseTests {
	
	

	@Test
	public void testprettyPrintAddress() {
	
		   AddressPrinter addressPrinter = new AddressPrinter();
		 
		    Address address = new Address();
			AddressLineDetail addressLineDetail = new AddressLineDetail("Line 1","Line 2");
			ProvinceOrState provinceOrState = new ProvinceOrState("GP","Gauteng");
			Country country = new Country("ZA","South Africa");
			Type type = new Type("1","Business Address");
			
			address.setType(type);
			address.setAddressLineDetail(addressLineDetail);
			address.setProvinceOrState(provinceOrState);
			address.setCountry(country);
			address.setLastUpdated("");
			address.setCityOrTown("");
			address.setPostalCode("");
			address.setSuburbOrDistrict("");
			
			String expected = new String("Business Address : Line 1 , Line 2 - Gauten - Value not set - South Africa");
			String actual = addressPrinter.prettyPrintAddress(address).toString();
			
		
			assertEquals(expected,actual);
		 
		 //addressPrinter.prettyPrintAddress(address);
	}

}
