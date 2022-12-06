package calculator;

import java.util.function.Consumer;

public interface ViewInterface {

  void addCalcObserver(Runnable f);
  void addTypeObserver(Consumer<OpType> l);

  /**
   * @return
   */
  String getExpression();

  void setAnswer(String answer);

}