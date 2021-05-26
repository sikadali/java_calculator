package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dalip
 */
public class ViewController implements Initializable {
    
    Model model = new Model();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private Button div;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button mult;

    @FXML
    private Button clear;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button seven;

    @FXML
    private TextField display;
    
    @FXML
    private Button dot;

    @FXML
    private Button inverse;

    @FXML
    private Button square;

    @FXML
    private Button sqrt;

    @FXML
    private void handleButtonClicked(ActionEvent event) {
        
        //Input digits
        if (event.getSource() == one){
            display.setText(display.getText() + "1");
        }else if (event.getSource() == two){
            display.setText(display.getText() + "2");
        }else if (event.getSource() == three){
            display.setText(display.getText() + "3");
        }else if (event.getSource() == four){
            display.setText(display.getText() + "4");
        }else if (event.getSource() == five){
            display.setText(display.getText() + "5");
        }else if (event.getSource() == six){
            display.setText(display.getText() + "6");
        }else if (event.getSource() == seven){
            display.setText(display.getText() + "7");
        }else if (event.getSource() == eight){
            display.setText(display.getText() + "8");
        }else if (event.getSource() == nine){
            display.setText(display.getText() + "9");
        }else if (event.getSource() == zero){
            display.setText(display.getText() + "0");
        }else if (event.getSource() == clear){
            display.setText("");
            model.setOperation(-1);
        }else if (event.getSource() == dot){
            display.setText(display.getText() + ".");
        }
        
        //Operations
        else if (event.getSource() == plus){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(1);
            display.setText("");
        }
        else if (event.getSource() == minus){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(2);
            display.setText("");
        }
        else if (event.getSource() == mult){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(3);
            display.setText("");
        }
        else if (event.getSource() == div){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(4);
            display.setText("");
        }
        else if (event.getSource() == sqrt){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(5);
            try{
                model.mathFunction();
                display.setText(String.valueOf(model.getData()));
            }catch (ArithmeticException e){
                display.setText(e.getMessage());
            }
        }
        else if (event.getSource() == inverse){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(6);
            try{
                model.mathFunction();
                display.setText(String.valueOf(model.getData()));
            }catch (ArithmeticException e){
                display.setText(e.getMessage());
            }
        }
        else if (event.getSource() == square){
            model.setData(Double.parseDouble(display.getText()));
            model.setOperation(7);
            try{
                model.mathFunction();
                display.setText(String.valueOf(model.getData()));
            }catch (ArithmeticException e){
                display.setText(e.getMessage());
            }
        }
        
        else if (event.getSource() == equals){
            resultEquals(model);
        }
    }
    
    private void resultEquals(Model model){
        double second = Double.parseDouble(display.getText());
        try{
            model.mathOperation(second);
            display.setText(String.valueOf(model.getData()));
        }catch (ArithmeticException e){
            display.setText(e.getMessage());
        }
    }
    
}
