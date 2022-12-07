package calculator;

import java.util.function.Consumer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * This class contains the data for the GUI.
 * 
 * @author zkac269
 *
 */
public class MyView {

  @FXML
  private Label Expression;

  @FXML
  private TextField FieldE;

  @FXML
  private TextField FieldR;

  @FXML
  private RadioButton Infix = null;

  @FXML
  private Label Result;

  @FXML
  private RadioButton ReversePolish = null;

  @FXML
  private Button calculate = null;


  /**
   * This adds an observer for the calculation.
   * 
   * @param f the calculation.
   */
  public void addCalcObserver(Runnable f) {
    calculate.setOnAction(event -> ((Observer) f).notifyObservers());
  }

  /**
   * This adds an observer for the type of calculation being done (Infix/Reverse polish).
   * 
   * @param l the type of the calculation
   */
  public void addTypeObserver(Consumer<OpType> l) {
    ReversePolish.setOnAction(event -> ((Observer) l).notifyObservers());
  }

  /**
   * Get the expression from user input.
   * 
   * @return the expression
   */
  public String getExpression() {
    return FieldE.getText();

  }

  /**
   * Used to set the answer to a given expression.
   * 
   * @param answer the answer to an expression
   */
  public void setAnswer(String answer) {
    FieldR.setText(answer);
  }
}


