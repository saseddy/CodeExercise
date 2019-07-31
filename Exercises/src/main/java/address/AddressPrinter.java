package main.java.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * AddressPrinter class
 */
public class AddressPrinter {
	
	/**
	 * This methods pretty prints a given address
	 * 
	 * @param	address the address object
	 * @return	the pretty printed version of the address
	 */
	public String prettyPrintAddress(Address address)
	{
		StringBuilder sb = new StringBuilder();
		AddressValidator addressValidator = new AddressValidator();
	    Address newAddress = addressValidator.buildAddress(address);
		String tokenizer = " - ";

		try
		{
			sb.append(newAddress.getType().getName());
			sb.append(" : ");
			sb.append(newAddress.getAddressLineDetail().getLine1());
			sb.append(" , ");
			sb.append(newAddress.getAddressLineDetail().getLine2());
			sb.append(tokenizer);
			sb.append(newAddress.getProvinceOrState().getName());
			sb.append(tokenizer);
			sb.append(newAddress.getPostalCode());
			sb.append(tokenizer);
			sb.append(newAddress.getCountry().getName());

		}
		catch(Exception Ex)
		{
			System.out.println(Ex.getMessage());
		}

		return  sb.toString();
	}
	
	/**
	 * 
	 * @param addressType	the address type to print
	 * @param addressList	the list of addresses	
	 * @return	the pretty printed version of the address type
	 */
	public String printAddressPerType(String addressType , List<Address> addressList)
	{
		Iterator<Address> iterator = addressList.iterator();
		
		while(iterator.hasNext())
		{
			Address address = iterator.next();
			if(address.getType().getName().equalsIgnoreCase(addressType))
			{
			  return prettyPrintAddress(address);	
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param	addressList the address list
	 * @return	the pretty printed version of all address in the address list	
	 */
	public List<String> prettyPrintAllAddresses(List<Address> addressList)
	{
		List<String> addresses = new ArrayList<String>();
		try
		{
		
		for(Address address: addressList)
		{
			 addresses.add(prettyPrintAddress(address));
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return addresses;
	}


}
