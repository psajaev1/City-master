
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.util.*;

/**
 * Class CityScape - This is the Applet that will be running the CityScape
 * 
 * Phillip Sajaev
 */
public class CityScape extends JApplet implements Runnable
{
    // instance variables 
    private int ox = 0;
    private int oy = 200;
    private int x = 0;
    private int y = 200;
    private int dx = 1;
    private int dy = 50;
    private int radius = 40;
    
   
    
    private Building building1;
    private Building building2;
    private Building building3;
    private Building building4;
    private Building building5;
    private Building building6;
    
    private Ground ground;
    private Ground ground1;
    
    
    private Street street1;
    
    
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
      
    
      
        // 1st number = XPosition
        // 2nd number = YPosition
        // 3rd number = length
        // 4th number = width
        // lower the number, the higher the starting position,
        // number entered is the starting position at the top
    
        
        building1 = new Building ( 25,100,50,300,Color.red);
        building2 = new Building ( 100,200,60,200,Color.blue);
        building3 = new Building ( 175,150,40,250,Color.green);
        building4 = new Building ( 250,100,50,300,Color.magenta);
        building5 = new Building ( 325,200,60,200,Color.red);
        building6 = new Building ( 400,150,40,250,Color.magenta);
        
        ground = new Ground(0,400,1000,200,Color.gray);
        ground1 = new Ground(0,450,1000,10,Color.yellow);
        
        street1 = new Street (0,425, 50 ,5,Color.white);
      
      
        
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
       Thread thread = new Thread(this);// creates new thread
       thread.start();// calls the run method
     
        
    }
    
        public void run()
    {
        //thread information
        
       while (true){
           ox = x;
           oy = y;
           x += dx;
           y = dy;
           // only the xx component is changing in the animation
           // causes it to just go horizantally across the screen
           repaint();
           
           try{// 30 frames per second
                Thread.sleep(34);}
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                    
           
                }
        
            }

   

    /**
     * Paint method for applet.
     * 
     * @param  page   the Graphics object for this applet
     */
    public void paint(Graphics page)
    {
        // sets the background in a JApplet
        getContentPane().setBackground(Color.cyan); 
       
        page.setColor(Color.cyan);
        // sets up the circle
        page.fillOval(ox - radius/2,oy - radius/2,radius,radius);
        
        page.setColor(Color.YELLOW);
        page.fillOval(x - radius/2,y - radius/2,radius,radius);
        // by alternating these colors, it creates an animated sun
   
        building1.draw (page);
        building2.draw (page);
        building3.draw (page);
        building4.draw (page);
        building5.draw (page);
        building6.draw (page);
        
        ground.draw(page);// draws the actual ground
        ground1.draw(page);// draws yellow line on the street
        street1.draw(page);// draws the white boxes
       
     
    }

  
   
}