package calculate;

// IMPORT ActionEvent and ActionListener from the java awt event packages
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// IMPORT JTextFeild from the javax swing package
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 * This is the calculateMain class. It is the main class responsible for dealing with all the calculations. Implements IcalculateMain and ActionListener
 * 
 * @author harry
 * @version 0.1
 */
public class calculateMain implements IcalculateMain, ActionListener {

    // DECLARE a reference to a IcalculateArea, call it areaCalculation
    private final IcalculateArea areaCalculation;
    
    // DECLARE a reference to a IcalculateVolume, call it volumeCalculation
    private final IcalculateVolume volumeCalculation;
        
    // DECLARE a reference to a IcalculatePaint, call it paintCalculation
    private final IcalculatePaint paintCalculation;
    
    // DECLARE a reference to 4 JTextField's to hold the passed values, call them iLength, iWidth, iHeight and iCoverage
    private JTextField iLength;
    private JTextField iWidth;
    private JTextField iHeight;
    private JTextField iCoverage;
    
    // DECLARE a reference to a JTextArea to which will be used to output the calculated values, call it iOutput
    private JTextArea iOutput;
    
    // DECLARE 3 doubles to hold the calculated area, volume and paint required, call them roomArea, roomVolume, requiredPaint 
    private double roomArea;
    private double roomVolume;
    private double requiredPaint;
    
    /**
     * CONSTRUCTOR for the class calculateMain. takes instances of the required dependencies 
     * 
     * @param areaCalculate an instance of IcalculateArea
     * @param volumeCalculate an instance of IcalculateVolume
     * @param paintCalculate an instance of IcalculatePaint
     */
    public calculateMain(IcalculateArea areaCalculate, IcalculateVolume volumeCalculate, IcalculatePaint paintCalculate){
        
        // INITILAISE areaCalculation to the passed areaCalculate
        areaCalculation = areaCalculate;
        
        // INITILAISE volumeCalculation to the passed volumeCalculate
        volumeCalculation = volumeCalculate;
        
        // INITIALISE paintCalculation to the passed paintCalculate
        paintCalculation = paintCalculate;
    }
    
    /**
     * METHOD: setupCalculate is used to set up the class and initialise the required variables
     * 
     * @param length a reference to the length input box
     * @param width a reference to the width input box
     * @param height a reference to the height input box
     * @param output a reference to the output text area
     */
    @Override
    public void setupCalculate(JTextField length, JTextField width, JTextField height, JTextField coverage, JTextArea output) {
       
        // INITIALISE iLength, iWidth, iHeight, iCoverage and iOutput to the appropriate passed parameters
        iLength = length;
        iWidth = width;
        iHeight = height;
        iCoverage = coverage;
        iOutput = output;
        
    }
    
    /**
     * METHOD actionPerformed is a required method from ActionListener. called when a button click happens
     * 
     * @param e is the event
     * 
     */
     @Override
    public void actionPerformed(ActionEvent e) {
               
        // IF the value inside of the length, width, height and coverage input box is not equal to "", essentially not empty...
        if(!"".equals(iLength.getText()) && !"".equals(iWidth.getText()) && !"".equals(iHeight.getText()) && !"".equals(iCoverage.getText())){  
            
            // IF the value inside of the length, width , height and coverage input box matches the reqular expression, which checks if it is just a number in the input boxes...
            if(iLength.getText().matches(".*\\d.*") && iWidth.getText().matches(".*\\d.*") && iHeight.getText().matches(".*\\d.*") && iCoverage.getText().matches(".*\\d.*")) {
      
                // CONVERT the value inside the input boxes to a double, required since calculations need to be performed with the value
                double convertedLength = Double.parseDouble(iLength.getText());
                double convertedWidth = Double.parseDouble(iWidth.getText());
                double convertedHeight = Double.parseDouble(iHeight.getText());
                double convertedCoverage = Double.parseDouble(iCoverage.getText());
                
                // if the value inside all of the input boxes is greater than 0...
                if(convertedLength > 0 && convertedWidth > 0 && convertedHeight > 0 && convertedCoverage > 0){
                               
                    // CALL areaCalculation by using the instance areaCalculation, passing convertedLength and convertedWidth as parameters, storing the return value in roomArea
                    roomArea = areaCalculation.areaCalculation(convertedLength, convertedWidth);

                    // CALL volumeCalculation by using the volumeCalculation class, passing convertedLength, convertedWidth and convertedHeight as parameters, storing the return value in roomVolume
                    roomVolume = volumeCalculation.volumeCalculation(convertedLength, convertedWidth, convertedHeight);

                    // CALL the paintCalculation by using the paintCalculation class, passing convertedLength, convertedWidth, convertedHeight and convertedCoverage 
                    // as parameters, storing the return value in roomVolume
                    requiredPaint = paintCalculation.calculatePaint(convertedLength, convertedWidth, convertedHeight, convertedCoverage);

                    // UPDATE the text inside of the iOutput text area to the values of roomArea, roomVolume and requiredPaint
                    iOutput.setText("Room Area: " + String.valueOf(roomArea) + " metres squared \nRoom Volume: " + String.valueOf(roomVolume) + 
                            " metres cubed \nPaint Required: " + String.valueOf(requiredPaint) + " litres");
    
                }
                // ELSE IF the values aren't greater than 0...
                else{
                    
                    // UPDATE the text inside of the iOutput text area to state that only numbers can be entered
                    iOutput.setText("Please enter values greater than 0"); 
                    
                }
            }
            // ELSE if the one or more of the input boxes don't match the regular expression...
            else{
                
                // UPDATE the text inside of the iOutput text area to state that only numbers can be entered
                iOutput.setText("Please ensure you enter only numbers");
                
            }
            
        }
        // ELSE IF one or more of the input boxes are equal to "", meaning they are empty...
        else{
            
            // UPDATE the text inside of the iOutput text area to state that all the input boxes need to be filled
            iOutput.setText("Please ensure you fill out all the boxes");
            
        }
        
    }
   
}
