package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumStackTest {
  private NumStack NumStack;

  @BeforeEach
  void setup() {
    NumStack = new NumStack();

  }
  
  @Test
  void testSize() {
    assertEquals(NumStack.size(), 0, "Tests new stack to see if its size is zero");
  }

}
