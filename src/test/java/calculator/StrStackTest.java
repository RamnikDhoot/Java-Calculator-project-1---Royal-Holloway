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

  @Test
  void testTop() {
    Entry one = new Entry("hello");
    strStack.push(one);
    Entry two = new Entry(2.8f);
    strStack.push(two);
    test = new Entry("test");
    strStack.push(test);
    assertEquals("Entry [number=null, other=null, str=test, type=string]",
        strStack.top().toString(), "Tests that the top is the newest added item");
  }

  @Test
  // pop cannot throw any exception as it is caught in the method.
  void testPop() {
    Entry one = new Entry("hello");
    Entry two = new Entry(Symbol.PLUS);
    strStack.push(one);
    strStack.push(two);;
    assertEquals(2, strStack.size(), "After pushing twice the size should be 2");
    strStack.pop();
    strStack.pop();
    assertEquals(0, strStack.size(), "The stack should now be empty");
  }

  @Test
  void testIsEmpty() {
    assertEquals(strStack.isEmpty(), true, "Tests that the stack is empty");
  }

}
