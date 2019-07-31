package main.java.address;


/**
 * The InvalidAddressException exception class
 */

public class InvalidAddressException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param   errorMessage   the detail message. 
     */
	public InvalidAddressException(String errorMessage)
	{
		super(errorMessage);
	}

}
