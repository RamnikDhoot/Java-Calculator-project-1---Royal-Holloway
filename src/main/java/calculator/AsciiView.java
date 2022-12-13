package calculator;


import java.util.Scanner;
import java.util.function.Consumer;

public class AsciiView implements ViewInterface {
  private String question;
  Observer calc = null;
  Observer reset = null;

  public void menu() {
    Scanner s = new Scanner(System.in);
    boolean finished = false;
    help();

    // The order of these checks is critical because hasNext blocks
    while (!finished && s.hasNext()) {
      String t = s.next();
      switch (t.toUpperCase().charAt(0)) {
        case 'C':
          if (calc != null) {
            calc.notifyObservers();
          }
          break;
        case 'R':
          if (reset != null) {
            reset.notifyObservers();
          }
          break;
        case '?':
          question = t.substring(1);
          System.out.println("Expression set to: " + question);
          break;
        case 'Q':
          System.out.println("End");
          finished = true;
          break;
        default:
          help();
      }
    }
    s.close();
  }

  private void help() {
    System.out.println("Use one of the following:");
    System.out.println("  ?Expression - to set expression");
    System.out.println("  C - to calculate");
    System.out.println("  T - to reset the calculator");
    System.out.println("  Q - to exit");
  }

  public String getExpression() {
    return question;
  }

  public void setAnswer(String a) {
    System.out.println("Answer is just around the corner");
  }

  @Override
  public void addCalcObserver(Runnable f) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addTypeObserver(Consumer<OpType> l) {
    // TODO Auto-generated method stub
    
  }

}// Code taken from MVC javafx examlple

