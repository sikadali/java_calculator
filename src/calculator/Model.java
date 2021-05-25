package calculator;

import java.util.ArrayList;

/**
 *
 * @author dalip
 */
public class Model {

    private double data;
    private int operation = -1;
    
    public Model() {
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }
    
    public void mathOperation(double secondOperand) {
        switch(operation) {
            case 1: //Addition
                this.data = this.data + secondOperand; break;
            case 2: //Substraction
                this.data -= secondOperand; break;
            case 3: //Multiplication
                this.data *= secondOperand; break;
            case 4: //Division
                this.data /= secondOperand; break;
        }
        this.operation = -1;
    }

}
