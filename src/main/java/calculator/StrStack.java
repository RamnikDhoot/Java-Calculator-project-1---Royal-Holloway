package calculator;

/**
 * This is a stack of strings to be a facade for the underlying stack class.
 * 
 * @author ZKAC269
 */
public class StrStack {
  Stack newStack;

  /**
   * constructor for the StrStack object.
   */
  public StrStack() {
    newStack = new Stack();
  }
  
  /**
   * Returns the size of the object by calling size on the stack object.
   * 
   * @return size of the stack
   */
  public int size() {
    return newStack.size();
  }

}
