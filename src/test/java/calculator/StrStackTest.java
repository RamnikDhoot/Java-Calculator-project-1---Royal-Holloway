package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrStackTest {
  private StrStack strStack;

  @BeforeEach
  void setup() {
    StrStack strStack = new StrStack();
  }

  @Test
  void testSize() {
    assertEquals(strStack.size(), 0, "Tests new stack to see if its size is zero");
  }

}
