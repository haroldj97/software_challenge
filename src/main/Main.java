package main;

// IMPORT everything from the gui package
import gui.*;

// IMPORT everything from the calculate package
import calculate.*;


/**
 * This is the main class. It is responsible for essentially initialising everything required for the program 
 * 
 * @author harry
 * @version 0.1
 */
public class Main {

    // DECLARE a reference to a IuserInterface to hold an instance of the userInterface class, call it gui
    private IuserInterface gui;
    
    // DECLARE a reference to a IcalculateMain to hold an instance of calculateMain class, call it calculate
    private IcalculateMain calculate;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // INSTANTIATE a new instance of Main
        Main main = new Main();
        
        // CALL main setup method
        main.setup();
        
    }
    
    /**
     * METHOD: setup is used to set up the application
     */
    private void setup(){
        
        // INSTANTIATE a new calculateArea by using the IcalculateArea interface
        IcalculateArea area = new calculateArea();
        
        // INSTANTIATE a new calculateVolume by using the IcalculateVolume interface
        IcalculateVolume volume = new calculateVolume();
        
        // INSTANTIATE a new calculatePaint by using the IcalculatePaint interface
        IcalculatePaint paint = new calculatePaint();
        
        // INSTANTIATE calculate to a new calculateMain, passing area, volume, paint
        calculate = new calculateMain(area, volume, paint);
        
        // INSTANTIATE gui to a new instance of userInterface
        gui = new userInterface();
        
        // CALL gui setup method, passing calculate as a parameter
        gui.setup(calculate);
       
        
    }
    
}
