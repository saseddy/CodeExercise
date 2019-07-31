package main.java.address;

/**
 * A class that keeps methods without a home
 * @author Saselani
 *
 */
public class Util {
	
	/**
	 * This methods is used to validate a string for nulls or blanks 
	 * @param param the string to be validated
	 * @return a true if the string is null/blank or a false
	 */
	 public static boolean isNullorBlank (String param)
	 {
	     return param == null || param.length() == 0;
	 }
	 
	 /**
	  * This field validate a string to check whether it is numeric
	  * @param param the string to be validated
	  * @return a true if it numeric or a false if it not numeric
	  */
	 public static boolean isNumeric(final String param) {
		 
	        return isNullorBlank(param) ? false : param.chars().allMatch(Character::isDigit);
	    }
}
