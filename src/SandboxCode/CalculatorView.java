
package SandboxCode;

import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author Jae Dillree
 */
public class CalculatorView extends JFrame{
    private JTextField firstValue = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondValue = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField solutionValue = new JTextField(10);

    CalculatorView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        
        calcPanel.add(firstValue);
        calcPanel.add(additionLabel);
        calcPanel.add(secondValue);
        calcPanel.add(calculateButton);
        calcPanel.add(solutionValue);
        
        this.add(calcPanel);
        
    }
    
    public double getFirstValue(){
        return Double.parseDouble(firstValue.getText());
    }
    
    public double getSecondValue(){
        return Double.parseDouble(secondValue.getText());
    }
    
    public double getSolutionValue(){
        return Double.parseDouble(solutionValue.getText());
    }
    
    public void setSolutionValue(double solution){
        solutionValue.setText(Double.toString(solution));
    }
    
    void addCalculationListener(ActionListener listenerForCalculateButton){
        calculateButton.addActionListener(listenerForCalculateButton);
    }
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
