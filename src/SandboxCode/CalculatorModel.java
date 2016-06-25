
package SandboxCode;

/**
 *
 * @author Jae Dillree
 */
public class CalculatorModel {
    private double calculation;
    
    public void getAdd(double firstValue, double secondValue){
    calculation = firstValue + secondValue;
    }
    
    public void getSub(double firstValue, double secondValue){
    calculation = firstValue - secondValue;
    }
    
    public void getMul(double firstValue, double secondValue){
    calculation = firstValue * secondValue;
    }

    public void getDiv(double firstValue, double secondValue){
    calculation = firstValue * secondValue;
    }
    
    public double getCalculation(){
        return calculation;
    }
}
