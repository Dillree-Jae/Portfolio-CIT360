
package SandboxCode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jae Dillree
 */
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculationListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            double firstValue, secondValue = 0;
        
            try{
                firstValue = theView.getFirstValue();
                secondValue = theView.getSecondValue();
            
                theModel.getAdd(firstValue, secondValue);
            
                theView.setSolutionValue(theModel.getCalculation());
            }
            catch(NumberFormatException ex){
                theView.displayErrorMessage("You need to enter 2 numbers!");
            }
        }
    }
}

