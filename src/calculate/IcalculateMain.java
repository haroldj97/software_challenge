package calculate;

// IMPORT ActionListener from the java awt event package
import java.awt.event.ActionListener;

// IMPORT JTextField and JTextArea from the javax swing package
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 * IcalculateMain is an interface used by calculateMain
 * 
 * @author harry
 * @version 0.1
 */
public interface IcalculateMain extends ActionListener{

    /**
     * METHOD: setupCalculate is used to set up the class and initialise the required variables
     * 
     * @param length a reference to the length input box of type JTextField
     * @param width a reference to the width input box of type JTextField
     * @param height a reference to the height input box of type JTextField
     * @param coverage a reference to the coverage input box of type JTextField
     * @param output a reference to the output text area of type JTextArea
     */
    void setupCalculate(JTextField length, JTextField width, JTextField height,  JTextField coverage, JTextArea output);
    
}
