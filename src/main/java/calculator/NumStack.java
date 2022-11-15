package calculator;

/**
 * This is a stack of numeric values to hide the details of the stack class being used.
 * 
 * @author ZKAC269
 */
public class NumStack {
  
  Stack newStack;
  
  public NumStack() {
    newStack = new Stack();
  }

  public Integer size() {
    return newStack.size();
  }

  public void push(Entry test) {
    newStack.push(test);
    
  }

  public int top() {
    return 0;
  }

}
