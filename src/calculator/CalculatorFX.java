package calculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dalip
 */
public class CalculatorFX extends Application {
    
    public static void main(String args[]){
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        Scene scene = new Scene(root);
        
        stage.setTitle("Very Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
