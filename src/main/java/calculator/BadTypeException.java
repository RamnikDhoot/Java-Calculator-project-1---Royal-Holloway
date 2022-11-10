package calculator;


/**
 * This is a custom Exception class thrown when trying to return the wrong type of value.
 *
 * @author ZKAC269
 */
public class BadTypeException extends Exception {

  /**
   * A constructor for the exception.
   * 
   * @param message the message to be displayed when the exception is thrown
   */
  public BadTypeException(String message) {
    super(message);
  }

}
