package test.java.address;
import main.java.address.Address;
import main.java.address.AddressFileReader;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddressFileReaderTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddressLoader() {
		AddressFileReader addressFileReader = new AddressFileReader();
		try {
			
			String filePath = "src/test/resources/addresses.json";
			List<Address> addressList = addressFileReader.addressLoader(filePath);
			
			assertTrue(addressList.size() == 3);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
