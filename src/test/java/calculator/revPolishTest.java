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
  void testList() throws BadTypeException {
    assertEquals(calc.evaluate("1 3  +"), 4);
  }
  
  

}
