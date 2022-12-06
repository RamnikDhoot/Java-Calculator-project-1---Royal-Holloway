package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class revPolishTest {
  RevPolish calc;

  @BeforeEach
  void setup() {
    calc = new RevPolish();
  }
  
  @Test
  void testReader() {
    assertEquals(calc.evaluate("1"), 1, "Test to see if the reader returns the correct int");
  }

}
