package calculator;

import java.util.Scanner;

/**
 * Class which has all the logic for the calculator. It uses reverse polish notation. 
 * 
 * @author zkac269
 *
 */
public class RevPolish {
  private NumStack list;
  
  /**
   *Takes a string expression and calculates it then returns the result.
   *The expression should be in reverse polish notation.
   *
   * 
   * @param str the expression to be calculated
   * @return the result of the calculation
   */
  public int evaluate(String str) { //should return a float
    list = new NumStack();
    Scanner reader = new Scanner(str);
    return reader.nextInt();
  }
}
