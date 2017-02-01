
import java.awt.*;
import javax.swing.JComponent;
/**
 * Class Building - This is a class that will create and design a building
 * 
 * Phillip Sajaev
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
     * Constructor for objects of class Buildings
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
     * param - Page(Graphics)
     * 
     * This is the method that will draw the buildings
     */
    public void draw (Graphics page){
    
     page.setColor (color);
     // sets color to color of the constructor
     
     page.drawRect(Xposition, Yposition, xLength,yLength);
     page.fillRect(Xposition, Yposition, xLength,yLength);
    
     // if statements are made so that the different sized buildings
     // would have correctly formatted windows
    if (xLength == 50 && yLength == 300){
     for (int i = 0; i <= 3; i++){// loop to make windows
         page.drawRect(Xposition + i * 10 + 5,Yposition + 10,4,6);
         // draws the rows
         for (int j = 0; j <= 27; j++){// draws the columns
             page.drawRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
             page.setColor(Color.yellow);
             
             int random = (int)(Math.random() * 100);// if loop used to animate windows
             if (random >= 50)// %50 chance the window lights up
                page.fillRect(Xposition + i*10 + 5, Yposition + j * 10 + 10, 5, 7);
            }
        }
      }
    else if (xLength == 60 && yLength == 200){
     for (int i = 0; i <= 4; i++){// loop to make windows
         page.drawRect(Xposition + i * 10 + 5,Yposition + 10,4,6);
         // draws rows
         for (int j = 0; j <= 18; j++){// draws columns
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
         // draws rows
         for (int j = 0; j <= 22; j++){// draws columns
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