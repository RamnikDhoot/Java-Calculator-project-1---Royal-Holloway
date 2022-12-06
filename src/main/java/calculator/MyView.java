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
  private RadioButton Infix;

  @FXML
  private Label Result;

  @FXML
  private RadioButton ReversePolish;

  @FXML
  private Button calculate;


  /**
   * This adds an observer for the calculation.
   * 
   * @param f the calculation.
   */
  public void addCalcObserver(Runnable f) {

  }

  /**
   * This adds an observer for the type of calculation being done (Infix/Reverse polish).
   * 
   * @param l the type of the calculation
   */
  public void addTypeObserver(Consumer<OpType> l) {

  }

  /**
   * Get the expression from user input.
   * 
   * @return the expression
   */
  public String getExpression() {
    return null;

  }

  /**
   * Used to set the answer to a given expression.
   * 
   * @param answer the answer to an expression
   */
  public void setAnswer(String answer) {

  }
}


