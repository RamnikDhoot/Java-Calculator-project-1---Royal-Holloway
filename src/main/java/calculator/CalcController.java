package calculator;

/**
 *Takes the expression entered and evaluates it then returns the answer.
 * 
 * @author zkac269
 *
 */
public class CalcController {
  private RevPolish myModel;
  private ViewInterface myView;

  private void calculate() throws BadTypeException {
    String userInput = myView.getExpression();
    myView.setAnswer(String.valueOf(myModel.evaluate(userInput)));
  }

  // private void expressionType() {}

  CalcController(RevPolish model, ViewInterface view) {
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
