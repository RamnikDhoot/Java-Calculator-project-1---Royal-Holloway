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
    assertEquals(calc.evaluate("1 3 +"), 4);
  }

  @Test
  void testEight() throws BadTypeException {
    assertEquals(calc.evaluate("1 2 3 4 5 6 7 8 + + + + + + +"), 36);
  }

  @Test
  void testMinus() throws BadTypeException {
    assertEquals(0, calc.evaluate("1 1 -"));
  }
  
  @Test
  void testMinusEight() throws BadTypeException {
    assertEquals(-20, calc.evaluate("1 2 3 4 5 6 7 8 - - - - - - -"));
  }
  
  @Test
  void testMultiply() throws BadTypeException {
    assertEquals(24, calc.evaluate("1 2 3 4 * * *"));
  }


}
