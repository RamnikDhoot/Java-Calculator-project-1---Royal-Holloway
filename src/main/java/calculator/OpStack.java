package calculator;

/**
 * This is a stack of operations to be a facade for the underlying stack class.
 * 
 * @author ZKAC269
 */
public class OpStack {
  
  Stack newStack;

  /**
   * constructor for the OpStack object.
   */
  public OpStack() {
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
   * Adds the number to the top of the stack.
   * 
   * @param test the number to be put onto the stack
   */
  public void push(Entry test) {
    newStack.push(test);

  }
  
  /**
   * The newest item that was added to the stack.
   * 
   * @return the item at the top of the stack.
   */
  public Entry top() {
    return newStack.top();
  }

}
