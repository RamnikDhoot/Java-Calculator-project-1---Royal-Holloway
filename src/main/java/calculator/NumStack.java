package calculator;

import java.util.EmptyStackException;

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

  public Entry top() {
    return newStack.top();
  }

  public Entry pop() {
    Entry popped = null;
    try {
      popped = newStack.pop();
    }
    catch(EmptyStackException e) {}
    return popped;
    
  }

}
