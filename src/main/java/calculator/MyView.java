package calculator;

import java.util.function.Consumer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

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
   * @param f
   */
  public void addCalcObserver(Runnable f) {

  }

  /**
   * @param l
   */
  public void addTypeObserver(Consumer<OpType> l) {

  }

  /**
   * @return
   */
  public String getExpression() {
    return null;

  }

  /**
   * @param answer
   */
  public void setAnswer(String answer) {

  }
}


