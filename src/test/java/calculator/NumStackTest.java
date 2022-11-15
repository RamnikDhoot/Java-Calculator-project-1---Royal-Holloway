package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumStackTest {
  private NumStack numStack;
  private Entry test;

  @BeforeEach
  void setup() {
    numStack = new NumStack();

  }

  @Test
  void testSize() {
    assertEquals(numStack.size(), 0, "Tests new stack to see if its size is zero");
  }

  @Test
  void testPush() {
    numStack.push(test);
    assertEquals(numStack.size(), 1,
        "Test that push increases the size of the empty stack by one.");
  }
  
  @Test
  void testTop() {
    numStack.push(test);
    assertEquals(0, numStack.top() , "Tests that the top is the newest added item");
  }

}
