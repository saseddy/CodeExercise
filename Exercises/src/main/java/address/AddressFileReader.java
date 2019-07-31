package main.java.address;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This is AddressFileReader class
 */
public class AddressFileReader {
	
	/**
	 * This is the addressLoader
	 * The methods loads the Json file containing addresses
	 * 
	 * @return	addressList the list of addresses pulled from the address file 
	 * @throws	JsonParseException
	 * @throws	JsonMappingException
	 * @throws	FileNotFoundException
	 * @throws	IOException
	 */
	
	public List<Address> addressLoader(String filePath) throws JsonParseException, JsonMappingException, FileNotFoundException, IOException
	{
		
	try
	{
		ObjectMapper mapper = new ObjectMapper();
		InputStream inputStream  = new FileInputStream(new File(filePath));
		TypeReference<List<Address>> typeReference = new TypeReference<List<Address>>() {};
		List<Address> addressList = mapper.readValue(inputStream, typeReference);
		
		return addressList;
	}
	catch(JsonParseException ex)
	{
		ex.printStackTrace();
	}
	catch(JsonMappingException ex)
	{
		ex.printStackTrace();
	}
	catch(FileNotFoundException ex)
	{
		ex.printStackTrace();
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	
	return null;
	}

}
