package main.java.highestcommonfactor;

/**
 * This is the HighestCommonFactor class
 */
public class HighestCommonFactor {


	/**
	 * This method gets the highest common factor of two given numbers
	 * 
	 * @param	firstNumber	the first number to be provided
	 * @param	secondNumber the second number to be provided
	 * @return	the highest common factor of the two numbers provided
	 */
	public int getHighestCommonFactorOfTwoNumbers(int firstNumber, int secondNumber) 
	{ 
		if (firstNumber == 0) 
			return secondNumber; 
		return getHighestCommonFactorOfTwoNumbers(secondNumber % firstNumber, firstNumber); 
	} 

	/**
	 * This method gets the highest common factor of a given array of numbers
	 * 
	 * @param	arrayOfNumbers the array of numbers to be provided
	 * @param	arrayLength the length of the array of numbers provided
	 * @return	the highest common factor of the given array of numbers
	 */
	public int getHighestCommonFactorOfArray(int arrayOfNumbers[], int arrayLength ) 
	{ 
		int highestCommonFactor = arrayOfNumbers[0]; 
		for (int i = 1; i < arrayLength; i++) 
			highestCommonFactor = getHighestCommonFactorOfTwoNumbers(arrayOfNumbers[i], highestCommonFactor); 

		return highestCommonFactor; 
	} 

}
