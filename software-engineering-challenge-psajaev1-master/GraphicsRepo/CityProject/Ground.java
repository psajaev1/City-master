
import java.awt.*;
import javax.swing.JComponent;
/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground
{
    private int xPosition;
    private int yPosition;
    private int xLength;
    private int yLength;
    private Color color;

    /**
     * Default constructor for objects of class Ground
     */
    public Ground(int positionx,int positiony, int length, int width, Color shade)
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
        
        page.drawRect(xPosition,yPosition, xLength, yLength);
        page.fillRect(xPosition,yPosition, xLength, yLength);
       
    }

}