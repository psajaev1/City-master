
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
 * Write a description of class Ellipseviewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ellipseviewer
{
    public static void main (String[] args){
        
      JFrame frame = new JFrame();

      frame.setSize(500,500);
      frame.setTitle("Circle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      EllipseComponent Component = new EllipseComponent();
      frame.add(Component);
      frame.setVisible(true);
      
   
      
      for (int i = 0; i < 5; i++){
          int x = (int)(Math.random() * 100);
          int y = (int)(Math.random() * 100);
          int d = (int)(Math.random() * 200);
       
      
      EllipseComponent Component1 = new EllipseComponent(x,y,d,d);
     
      
  
     frame.add(Component1);
     frame.setVisible(true);
}
}
}

