
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.util.*;

/**
 * Class CityScape - write a description of the class here
 * 
 * Phillip Sajaev
 * @version (a version number)
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
        JRootPane rootPane = this.getRootPane();    
       rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    
        // provide any initialisation necessary for your JApplet
        // 1st number = XPosition
        // 2nd number = YPosition
        building1 = new Building ( 50,500,Color.red);
        building2 = new Building ( 75,200,Color.blue);
        building3 = new Building ( 150,200,Color.green);
        building4 = new Building ( 225,200,Color.blue);
        building5 = new Building ( 300,200,Color.blue);
        building6 = new Building ( 375,200,Color.blue);
        
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
       Thread thread = new Thread(this);
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
           
           repaint();
           
           try{
                Thread.sleep(17);}
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                    
           
                }
        
            }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics page)
    {
        page.setColor(Color.WHITE);
        // sets up the circle
        page.fillOval(ox - radius/2,oy - radius/2,radius,radius);
        
        page.setColor(Color.YELLOW);
        page.fillOval(x - radius/2,y - radius/2,radius,radius);
        
        building1.draw (page);
        building2.draw (page);
        building3.draw (page);
        building4.draw (page);
        building5.draw (page);
        building6.draw (page);
        
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
