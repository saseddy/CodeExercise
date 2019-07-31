/**
 * 
 */
package test.java.highestcommonfactor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.highestcommonfactor.HighestCommonFactor;

/**
 * @author ABSK602
 *
 */
class HighestCommonFactorTest {

	@Test
	void testGetHighestCommonFactorOfTwoNumbers() {
		
		HighestCommonFactor highestCommoncactor = new HighestCommonFactor();
		
		int firstNumber = 3;
		int secondNumber = 9;
		
		int expected = 3;
		int actual = highestCommoncactor.getHighestCommonFactorOfTwoNumbers(firstNumber, secondNumber);

	    assertEquals(expected, actual);
		
	}
	
	@Test
	void testGetHighestCommonFactorOfArray()
	{
      HighestCommonFactor highestCommoncactor = new HighestCommonFactor();
		
		int [] arrayOfNumbers = new int[]{4,6,9,5};
		int arrayLength = arrayOfNumbers.length;
		int expected = 7;
		int actual = highestCommoncactor.getHighestCommonFactorOfArray(arrayOfNumbers, arrayLength);

	    assertEquals(expected, actual);
	}

}
