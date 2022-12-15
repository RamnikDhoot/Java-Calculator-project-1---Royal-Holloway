package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardCalcTest {
  private StandardCalc calc;

  @BeforeEach
  void setup() {
    calc = new StandardCalc();
  }
  
  @Test
  void testList() throws BadTypeException {
    assertEquals(calc.evaluate("test"), 0);
  }
  
  @Test
  void testCalc() throws BadTypeException {
    assertEquals(calc.calculate("test"), 0);
  }
  
  @Test
  void testLetterorDigit() throws BadTypeException {
    char a = 0;
    assertEquals(calc.letterOrDigit(a), true);
  }
  
  @Test
  void testGetPrecedence() throws BadTypeException {
    char a = 0;
    assertEquals(calc.getPrecedence(a), 1);
  }
  
  void testGoesLeft() throws BadTypeException {
    char a = 0;
    assertEquals(calc.goesLeft(a), true);
  }

}
