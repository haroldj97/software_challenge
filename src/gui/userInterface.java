package gui;

// IMPORT the FlowLayout from the java awt package
import java.awt.FlowLayout;

// IMPORT everything from the javax swing package
import javax.swing.*;

// IMPORT everything from the calculate package
import calculate.*;

/**
 * This is the userInterface. It is responsible for setting up the userInterface of the application. Implements IuserInterface
 * 
 * @author harry
 * @version 0.1
 */
public class userInterface implements IuserInterface{
    
    // DECLARE a reference to a IcalculateMain, call it mainCalculate
    private IcalculateMain mainCalculate;
    
    // DECLARE a reference to a JFrame to hold an instance of JFrame, call it mainFrame
    private JFrame mainFrame;
    
    // DECLARE a reference to a JButton to hold an instance of JButton, call it calculate
    private JButton calculate;
    
    // DECLARE a reference to a JTextField to hold an instance of JTextField and be used to take the length of the room, call it length
    private JTextField length;
    
    // DECLARE a reference to a JTextField to hold an instance of JTextField and be used to take the width of the room, call it width
    private JTextField width;
    
    // DECLARE a reference to a JTextField to hold an instance of JTextField and be used to take the height of the room, call it height
    private JTextField height;
    
    // DECLARE a reference to a JTextField to hold an instance of JTextField and be used to take the coverage of the paint, call it coverage
    private JTextField coverage;
    
    // DECLARE a reference to a JLabel to hold an instance of JLabel to be used for the length text field to tell the user what to enter, call it lLabel
    private JLabel lLabel;
    
    // DECLARE a reference to a JLabel to hold an instance of JLabel to be used for the width text field to tell the user what to enter, call it wLabel
    private JLabel wLabel;
    
    // DECLARE a reference to a JLabel to hold an instance of JLabel to be used for the width text field to tell the user what to enter, call it hLabel
    private JLabel hLabel;
    
    // DECLARE a reference to a JLabel to hold an instance of JLabel to be used for the coverage text field to tell the user what to enter, call it cLabel
    private JLabel cLabel;
     
    // DECLARE a reference to a JTextArea to hold an instance of JTextArea to be used to output the calculated values
    private JTextArea output;
    
    /**
     * CONSTRUCTOR for the userInterface class
     */
    public userInterface(){
        
        // do nothing 
        
    }
    
    /**
     * METHOD setup is used to setup the user interface for the application
     * 
     * @param calculateMain is an instance of IcalculateMain to be used in this class
     * 
     */
    @Override
    public void setup(IcalculateMain calculateMain){
        
        // INITIALISE mainCalculate to calculateMain;
        mainCalculate = calculateMain;
        
        // INITIALISE mainFrame to a new instance of JFrame, passing the word Calculator to be used as a name for the application
        mainFrame = new JFrame("Calculator");
        
        // INITIALISE length, width,height and coverage to a new JTextField with line height of 25
        length = new JTextField(25);
        width = new JTextField(25);
        height = new JTextField(25);
        coverage = new JTextField(25);
             
        // INITIALISE output to a new JTextArea width 5 rows, 20 columns
        output = new JTextArea(5,20);
        
        // SET output editable to false so the user cannot add text
        output.setEditable(false);
        
        // CALL mainCalcualte setupCalculate method, passing length, width and height JTextFields
        mainCalculate.setupCalculate(length,width,height,coverage,output);
       
        // INITIALISE lLabel, wLabel, hLabel and cLabel to a new JLabel
        lLabel = new JLabel("Enter the length of the room (in metres): ");
        wLabel = new JLabel("Enter the width of the room (in metres): ");
        hLabel = new JLabel("Enter the height of the room (in metres): ");
        cLabel = new JLabel("Enter the coverage of the paint (in metres squared): ");
                
        // SET the size of the JFrame
        mainFrame.setSize(325,500);
        
        // SET the default close operation to exit on close
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
           
        // UPDATE mainFrame so that it is visible
        mainFrame.setVisible(true);
        
        // SET the layout of the mainFrame to FlowLayout
        mainFrame.setLayout(new FlowLayout());
        
        // INITIALISE calculate to a new JButton called calculate
        calculate = new JButton("Calculate");
        
        // SET the position and size of the JButton, first 2 values are the x and y position and the second 2 are the size
        calculate.setBounds(150,100,100,40);
        
        // ADD the button and text fields and labels to the JFrame
        mainFrame.add(lLabel);
        mainFrame.add(length);
        mainFrame.add(wLabel);
        mainFrame.add(width);
        mainFrame.add(hLabel);
        mainFrame.add(height);
        mainFrame.add(cLabel);
        mainFrame.add(coverage);
        mainFrame.add(calculate);
        mainFrame.add(output);
        
        // ADD an ActionListener to the calculate button of mainCalculate variable. will call the actionPerformed method
        // in that class
        calculate.addActionListener(mainCalculate);
               
    }

}
