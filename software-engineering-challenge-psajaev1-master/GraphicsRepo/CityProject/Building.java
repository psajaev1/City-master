
import java.awt.*;
import javax.swing.JComponent;
/**
 * Write a description of class Buildings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int Xposition;
    private int Yposition;
    private Color color;
    

    /**
     * Default constructor for objects of class Buildings
     */
    public Building(int baseX, int baseY, Color shade)
    {
        Xposition = baseX;
        Yposition = baseY;
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

      // head
     page.drawRect(Xposition, Yposition, 50,100);
     //       two numbers above are length, width
     for (int i = 0; i < 10; i++){
         page.drawRect(Xposition + (i * 10),Yposition + (i * 10),5,10);
        }
 
     
    }
}
