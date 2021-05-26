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
        if (this.data == Double.POSITIVE_INFINITY || this.data == Double.NEGATIVE_INFINITY || Double.isNaN(this.data)) {
                throw new ArithmeticException("ERROR");
        }
    }
    
    public void mathFunction() {
        switch(operation){
            case 5: //Square root function
                this.data = Math.sqrt(this.data); break;
            case 6: //Inverse function
                this.data = 1/this.data; break;
            case 7: //Square function
                this.data = this.data * this.data ; break;
        }
        this.operation = -1;
        if (this.data == Double.POSITIVE_INFINITY || this.data == Double.NEGATIVE_INFINITY || Double.isNaN(this.data)) {
                throw new ArithmeticException("ERROR");
        }
    }

}
