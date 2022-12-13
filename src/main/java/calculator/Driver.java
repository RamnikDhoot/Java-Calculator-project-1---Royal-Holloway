package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class starts the GUI.
 * 
 * @author zkac269
 *
 */
public class Driver extends Application {
  private CalcController controller = new CalcController();

  /**
   * This is the main method to start the calculator and bring up the GUI.
   * 
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("myView.fxml"));
    Scene scene = new Scene(loader.load(), 600, 400);
    controller.addView(loader.getController());
    primaryStage.setScene(scene);
    primaryStage.show();
  } // This code is from the example code
}
