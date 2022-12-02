package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrStackTest {
  private StrStack strStack;
  private Entry test;

  @BeforeEach
  void setup() {
    strStack = new StrStack();
  }

  @Test
  void testSize() {
    assertEquals(strStack.size(), 0, "Tests new stack to see if its size is zero");
  }
  
  @Test
  void testPush() {
    strStack.push(test);
    assertEquals(strStack.size(), 1,
        "Test that push increases the size of the empty stack by one.");
  }

}
