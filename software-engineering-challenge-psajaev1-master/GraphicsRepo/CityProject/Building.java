
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
    private int xLength;
    private int yLength;
    private Color color;
    

    /**
     * Default constructor for objects of class Buildings
     */
    public Building(int positionX, int positionY,int length, int width, Color shade)
    {
        Xposition = positionX;
        Yposition = positionY;
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
        // draws the building
   

     page.setColor (color);

      // head
      
     page.drawRect(Xposition, Yposition, xLength,yLength);
     page.fillRect(Xposition, Yposition, xLength,yLength);
    
     //       two numbers above are length, width
     
    if (xLength == 50 && yLength == 300){
     for (int i = 0; i <= 3; i++){// loop to make windows
         page.drawRect(Xposition + i * 10 + 5,Yposition + 10,4,6);
         
         for (int j = 0; j <= 27; j++){
             page.drawRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
             page.setColor(Color.yellow);
             int random = (int)(Math.random() * 100);// if loop used to animate windows
             if (random >= 50)
                page.fillRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
            }
        }
      }
    else if (xLength == 60 && yLength == 200){
     for (int i = 0; i <= 4; i++){// loop to make windows
         page.drawRect(Xposition + i * 10 + 5,Yposition + 10,4,6);
         
         for (int j = 0; j <= 18; j++){
             page.drawRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
             page.setColor(Color.yellow);
             int random = (int)(Math.random() * 100);// if loop used to animate windows
             if (random >= 50)
                page.fillRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
            }
        }
      }
      
    else if (xLength == 40 && yLength == 250){
     for (int i = 0; i <= 2; i++){// loop to make windows
         page.drawRect(Xposition + i * 10 + 5,Yposition + 10,4,6);
         
         for (int j = 0; j <= 22; j++){
             page.drawRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
             page.setColor(Color.yellow);
             int random = (int)(Math.random() * 100);// if loop used to animate windows
             if (random >= 50)
                page.fillRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
            }
        }
      }
    }
}