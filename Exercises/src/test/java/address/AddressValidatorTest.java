package test.java.address;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.address.Address;
import main.java.address.AddressLineDetail;
import main.java.address.AddressValidator;
import main.java.address.Country;
import main.java.address.InvalidAddressException;
import main.java.address.ProvinceOrState;
import main.java.address.Type;

class AddressValidatorTest {

	@Test
	void testValidateAddress() throws InvalidAddressException {
		
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
		
		
		AddressValidator addressValidator = new AddressValidator();
		
		 String expected = "Postal code can only be numeric.";
		 String actual = addressValidator.validateAddress(address);
		 
		 assertEquals(expected,actual);

	}

}
