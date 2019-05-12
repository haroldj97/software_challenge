package calculate;

/**
 * calculateArea takes two values and returns the area. Implements IcalculateArea
 * 
 * @author harry
 * @version 0.1
 */
public class calculateArea implements IcalculateArea {

    public calculateArea(){
        
        // do nothing
        
    }
    
    /**
     * METHOD: areaCalculation calculates the area based on the given parameters
     * 
     * @param length is the length of the room
     * @param width is the width of the room
     * 
     * @return area of the room
     */
    @Override
    public double areaCalculation(double length, double width) {
        
        // DECLARE a double which will store the area of the room, call it area and multiple length by width
        double area = length * width;
        
        // UPDATE area so that it is rounded to 2 decimal places by using Mat.round
        area  = Math.round(area * 100.0) / 100.0;
        
        // RETURN area
        return area;
        
    }
   
}
