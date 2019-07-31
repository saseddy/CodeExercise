package main.java.address;

import java.util.List;



public class Program {

	public static void main(String[] args) throws Exception, InvalidAddressException{

		String filePath = "src/main/resources/addresses.json";
		AddressFileReader addressFileReader = new AddressFileReader();
		List<Address> addressList = addressFileReader.addressLoader(filePath);
		AddressValidator addressValidator = new AddressValidator();
		
	
		System.out.println(addressValidator.validateAddress(addressList.get(2)));	
	
		
	}

}
