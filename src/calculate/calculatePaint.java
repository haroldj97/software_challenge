package calculate;

/**
 * This is the calculatePaint class. It calculates the paint required in a room based on passed values
 * 
 * @author harry
 * @version 0.1
 */
public class calculatePaint implements IcalculatePaint {

    public calculatePaint(){
        
        // do nothing
        
    }
    
    /**
     * METHOD: calculatePaint takes the length, width and height and returns the paint required
     * 
     * @param length is the length of the room
     * @param width is the width of the room
     * @param height is the height of the room
     * @param coverage is the amount the paint covers in metres squared
     * 
     * @return a double which is the paint required 
     */
    @Override
    public double calculatePaint(double length, double width, double height, double coverage){
                
        // DECLARE a double which will store the paint required, call it paintRequired. based on the assumption there are 4 walls
        double paintRequired = 2 * (length * height) + 2 * (width * height);

        // UPDATE paintRequired to itself divided by coverage. this is done since 1 litre of paint covers x amount of metres squared 
        paintRequired = paintRequired / coverage;
        
        // UPDATE paintRequired to the rounded value of itself using Math.round
        paintRequired = Math.round(paintRequired * 100.0) / 100.0;
        
        // RETURN paintRequired
        return paintRequired;
        
    }
    
}
