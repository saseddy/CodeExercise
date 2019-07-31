package test.java.address;
import main.java.address.Address;
import main.java.address.AddressLineDetail;
import main.java.address.AddressPrinter;
import main.java.address.Country;
import main.java.address.ProvinceOrState;
import main.java.address.Type;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class AddressPrinterTest {


	@Test
	void testPrettyPrintAddress() {
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
		
		String expected = new String("Business Address : Line 1 , Line 2 - Gauteng - Value not set - South Africa");
		String actual = addressPrinter.prettyPrintAddress(address).toString();
		
	
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testprintAddressPerType()
	{
        AddressPrinter addressPrinter = new AddressPrinter();
		List<Address> addressList = new ArrayList<Address>();
	    Address address1 = new Address();
		AddressLineDetail addressLineDetail1 = new AddressLineDetail("Line 1","Line 2");
		ProvinceOrState provinceOrState1 = new ProvinceOrState("GP","Gauteng");
		Country country1 = new Country("ZA","South Africa");
		Type type1 = new Type("1","Business Address");
		
		address1.setType(type1);
		address1.setAddressLineDetail(addressLineDetail1);
		address1.setProvinceOrState(provinceOrState1);
		address1.setCountry(country1);
		address1.setLastUpdated("");
		address1.setCityOrTown("");
		address1.setPostalCode("");
		address1.setSuburbOrDistrict("");
		addressList.add(address1);
		
		   Address address2 = new Address();
			AddressLineDetail addressLineDetail2 = new AddressLineDetail("Line 1","Line 2");
			ProvinceOrState provinceOrState2 = new ProvinceOrState("GP","Gauteng");
			Country country2 = new Country("ZA","South Africa");
			Type type2 = new Type("1","Physical Address");
			
			address1.setType(type2);
			address1.setAddressLineDetail(addressLineDetail2);
			address1.setProvinceOrState(provinceOrState2);
			address1.setCountry(country2);
			address1.setLastUpdated("");
			address1.setCityOrTown("Johannesburg");
			address1.setPostalCode("2001");
			address1.setSuburbOrDistrict("Sandton");
			addressList.add(address2);
			
			String addressType = "Physical Address";
			
			String  Address = addressPrinter.printAddressPerType(addressType, addressList);
			
			assertTrue(Address.contains(addressType), Address);
	}
	
	@Test
	public void testPrettyPrintAllAddresses()
	{
		AddressPrinter addressPrinter = new AddressPrinter();
		List<Address> addressList = new ArrayList<Address>();
	    Address address1 = new Address();
		AddressLineDetail addressLineDetail1 = new AddressLineDetail("Line 1","Line 2");
		ProvinceOrState provinceOrState1 = new ProvinceOrState("GP","Gauteng");
		Country country1 = new Country("ZA","South Africa");
		Type type1 = new Type("1","Business Address");
		
		address1.setType(type1);
		address1.setAddressLineDetail(addressLineDetail1);
		address1.setProvinceOrState(provinceOrState1);
		address1.setCountry(country1);
		address1.setLastUpdated("");
		address1.setCityOrTown("");
		address1.setPostalCode("");
		address1.setSuburbOrDistrict("");
		addressList.add(address1);
		
		   Address address2 = new Address();
			AddressLineDetail addressLineDetail2 = new AddressLineDetail("Line 1","Line 2");
			ProvinceOrState provinceOrState2 = new ProvinceOrState("GP","Gauteng");
			Country country2 = new Country("ZA","South Africa");
			Type type2 = new Type("1","Physical Address");
			
			address1.setType(type2);
			address1.setAddressLineDetail(addressLineDetail2);
			address1.setProvinceOrState(provinceOrState2);
			address1.setCountry(country2);
			address1.setLastUpdated("");
			address1.setCityOrTown("Johannesburg");
			address1.setPostalCode("2001");
			address1.setSuburbOrDistrict("Sandton");
			addressList.add(address2);
			
			
			
			int expectedSize = 2;
			int  actualSize = addressPrinter.prettyPrintAllAddresses(addressList).size();
			
			assertEquals(expectedSize, actualSize);
		
	}

}
