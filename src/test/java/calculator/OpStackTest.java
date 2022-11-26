package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OpStackTest {
  private OpStack opStack;
  private Entry test;

  @BeforeEach
  void setup() {
    opStack = new OpStack();

  }
  
  @Test
  void testSize() {
    assertEquals(opStack.size(), 0, "Tests new stack to see if its size is zero");
  }
  
  @Test
  void testPush() {
    opStack.push(test);
    assertEquals(opStack.size(), 1,
        "Test that push increases the size of the empty stack by one.");
  }
  
  @Test
  void testTop() {
    Entry one = new Entry("hello");
    opStack.push(one);
    Entry two = new Entry(2.8f);
    opStack.push(two);
    test = new Entry("test");
    opStack.push(test);
    assertEquals("Entry [number=null, other=null, str=test, type=string]",
        opStack.top().toString(), "Tests that the top is the newest added item");
  }

}
