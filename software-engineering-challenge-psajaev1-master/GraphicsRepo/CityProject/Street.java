
import java.awt.*;
import javax.swing.JComponent;
/**
 * Class Ground - Draw the Ground
 * 
 * Phillip Sajaev
 */
public class Street
{
    private int xPosition;
    private int yPosition;
    private int xLength;
    private int yLength;
    private Color color;

    /**
     * Constructor for objects of class Ground
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
     * param - page 
     * Draws the white rectangles on the street
     */
    public void draw (Graphics page){
        page.setColor (color);
        
        for (int i = 0; i <=2; i++){// creates two rows 
            page.drawRect(xPosition ,yPosition + i * 50 , xLength, yLength);
            page.fillRect(xPosition ,yPosition + i * 50 , xLength, yLength);
            for(int j = 0; j <=4; j++){// creates 4 columns
                page.drawRect(xPosition + j*  100, yPosition + i*50, xLength,yLength);
                page.fillRect(xPosition + j*  100, yPosition + i*50, xLength,yLength);
            }
    }

}
}