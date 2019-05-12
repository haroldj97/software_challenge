package gui;

// IMPORT IcalculateMain from the calculate package
import calculate.IcalculateMain;

/**
 * This is the interface for the userInterface class
 * 
 * @author harry
 * @version 0.1
 * 
 */
public interface IuserInterface {
    
    /**
     * METHOD: setup is used to set up the interface
     * 
     * @param calculateMain is an instance of IcalculateMain to be used in this class
     */
    void setup(IcalculateMain calculateMain);
    
}
