package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class revPolishTest {
  RevPolish Calc;

  @BeforeEach
  void setup() {
    Calc = new RevPolish();
  }
  
  @Test
  void testEvaluate() {
    assertEquals(Calc.evaluate("+"), 0, "Test to see if evaluate returns anything");
  }

}
