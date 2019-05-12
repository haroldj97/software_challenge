package calculate;

/**
 * This is the calculateVolume class. it calculate the volume of a room based on given values
 * 
 * @version 0.1
 * @author harry
 */
public class calculateVolume implements IcalculateVolume {

    public calculateVolume(){
        
        // do nothing
        
    }
    
    /**
     * METHOD: volumeCalculation calculate the volume based on the given parameters
     * 
     * @param length is the length of the room
     * @param width is the width of the room
     * @param height is the height of the room
     * @return the calculated volume
     */
    @Override
    public double volumeCalculation(double length, double width, double height){
        
        // DECLARE a double which will store the volume of the room, call it volume and multiply length by width by height
        double volume = length * width * height;
        
        // UPDATE volume so that it is rounded to the nearest 2 decimals
        volume = Math.round(volume * 100.0) / 100.0;
        
        // RETURN volume
        return volume;
        
    }
    
}
