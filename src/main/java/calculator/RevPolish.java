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
   * Takes a string expression and calculates it then returns the result. The expression should be
   * in reverse polish notation.
   *
   * 
   * @param str the expression to be calculated
   * @return the result of the calculation
   * @throws BadTypeException 
   */
  public Float evaluate(String str) throws BadTypeException { // should return a float
    list = new NumStack();
    Scanner reader = new Scanner(str);

    while (reader.hasNext()) {
      if (reader.hasNextInt()) {
        Entry next = new Entry(reader.nextInt());
        list.push(next);
      } else {
        reader.next();
        Float arg1 = list.pop().getValue();
        Float arg2 = list.pop().getValue();
        Entry answer = new Entry(arg1 + arg2);
        list.push(answer);
      }
    }
    reader.close();
    return list.pop().getValue();
    // The code for the reader was taken from an example by Dave in the Debug Lecture example.

  }
}
