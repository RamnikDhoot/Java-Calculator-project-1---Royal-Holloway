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
  public Integer size() {
    return newStack.size();
  }
  
  /**
   * Adds the string to the top of the stack.
   * 
   * @param test the number to be put onto the stack
   */
  public void push(Entry test) {
    newStack.push(test);

  }

}
