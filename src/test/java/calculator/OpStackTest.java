package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OpStackTest {
  private OpStack opStack;

  @BeforeEach
  void setup() {
    opStack = new OpStack();

  }
  
  @Test
  void testSize() {
    assertEquals(opStack.size(), 0, "Tests new stack to see if its size is zero");
  }

}
