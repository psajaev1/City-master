

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  
   int x,y,w,h;
   Rectangle box;
   public RectangleComponent(){
       this.x = 5;
       this.y = 10;
       this.w = 20;
       this.h = 30;
       box = new Rectangle(x,y,w,h);
    }
    
   public RectangleComponent(int x, int y, int w, int h){
       
       this.x = x;
       this.y = y;
       this.w = w;
       this.h = h;
       box = new Rectangle(x, y ,w, h);
       
    }
    
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct a rectangle and draw it
     // Rectangle box = new Rectangle(5, 10, 20, 30);
     // don't need to do this
      g2.draw(box);

      // Move rectangle 15 units to the right and 25 units down
      box.translate(15, 25);

      // Draw moved rectangle
      g2.draw(box);
   }
   
   public void nextFrame(){
       // udpate the objects in the cityscape so they are animated
       
       box.translate(10,10);
       // request that the Java Runtime repaints this component by invoking its
       //paint Component does not explicitly invokoe the paint Component method
       
       repaint();
       
    }
}