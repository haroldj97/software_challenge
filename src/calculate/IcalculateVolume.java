package calculate;

/**
 * @author harry
 * @version 0.1
 */
public interface IcalculateVolume {
    
    /**
     * volumeCalculation calculate the volume based on the given parameters
     * 
     * @param length is the length of the room
     * @param width is the width of the room
     * @param height is the height of the room
     * 
     * @return the calculated volume
     */
    double volumeCalculation(double length, double width, double height);
    
}
