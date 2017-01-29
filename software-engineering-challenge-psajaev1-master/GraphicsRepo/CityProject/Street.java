
import java.awt.*;
import javax.swing.JComponent;
/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Street
{
    private int xPosition;
    private int yPosition;
    private int xLength;
    private int yLength;
    private Color color;

    /**
     * Default constructor for objects of class Ground
     */
    public Street(int positionx,int positiony, int length, int width, Color shade)
    {
       xPosition = positionx;
        yPosition = positiony;
        xLength = length;
        yLength = width;
        color = shade;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw (Graphics page){
        page.setColor (color);
        
        for (int i = 0; i <=2; i++){
            page.drawRect(xPosition ,yPosition + i * 50 , xLength, yLength);
            page.fillRect(xPosition ,yPosition + i * 50 , xLength, yLength);
            for(int j = 0; j <=4; j++){
                page.drawRect(xPosition + j*  100, yPosition + i*50, xLength,yLength);
                page.fillRect(xPosition + j*  100, yPosition + i*50, xLength,yLength);
            }
    }

}
}