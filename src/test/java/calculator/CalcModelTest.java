package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcModelTest {
  CalcModel test;

  @BeforeEach
  void stetup() {
    test = new CalcModel();
  }

  @Test
  void testEvaluate() {
    test.evaluate("string");
  }

}
