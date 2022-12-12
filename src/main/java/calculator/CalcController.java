package calculator;

/**
 * Takes the expression entered and evaluates it then returns the answer.
 * 
 * @author zkac269
 *
 */
public class CalcController {
  private CalcModel myModel;
  private ViewInterface myView;
  private Boolean isInfix;

  private void calculate() throws BadTypeException {
    String userInput = myView.getExpression();

    myView.setAnswer(String.valueOf(myModel.evaluate(userInput, isInfix)));
  }

  // private void expressionType() {}

  CalcController(CalcModel model, ViewInterface view) {
    myModel = model;
    myView = view;
    view.addCalcObserver(() -> {
      try {
        calculate();
      } catch (BadTypeException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });
    // view.addTypeObserver(this::expressionType);
  }

}
