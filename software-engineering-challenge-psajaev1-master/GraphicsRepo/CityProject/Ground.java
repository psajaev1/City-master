
import java.awt.*;
import javax.swing.JComponent;
/**
 * Class Ground - Creates the Ground
 * 
 * Phillip Sajaev
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
     * Constructor for objects of class Ground
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
     * param - page(Graphics)
     * Draws the ground
     */
    public void draw (Graphics page){
        page.setColor (color);
        
        page.drawRect(xPosition,yPosition, xLength, yLength);
        page.fillRect(xPosition,yPosition, xLength, yLength);
       
    }

}