import hsa.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Collections;


public class Interface{

    //arbitrary size does not matter
    private final static Console window = new Console(Globals.CONSOLE_ROWS, Globals.CONSOLE_COLS);
    private static int maxElement = -1;
    private static int totalElements = -1;
    private static int barWidth  = -1;
    private static final int HORIZONTAL_PADDING = ((int)(window.maxx() - Globals.DISPLAY_LENGTH)/2);

    //passes in array to be rendered
    public static void setInterfaceDrawInformation(){
        maxElement = Collections.max(Globals.array);
        totalElements = Globals.array.size();
        barWidth = (int) (Globals.DISPLAY_LENGTH *1.0 / totalElements);
        System.out.println(window.maxx());
    }


    //takes the local array of items then updates the screen with the new bar graph of items
    public static void updateGraphics(){
        // Create an off-screen image that matches the size of the window.
        BufferedImage offscreen = new BufferedImage(window.maxx() + 1, window.maxy() + 1, BufferedImage.TYPE_INT_ARGB);
        Graphics g = offscreen.getGraphics();
        
        //draw background
        g.setColor(Color.black);
        g.fillRect(0, 0, window.maxx() + 1, window.maxy() + 1);
        g.setColor(Color.white);

        for (int i = 0; i < totalElements; i++) {
        
            //calculate information needed for drawing bars
            int barHeight = (int) (((double) Globals.array.get(i) / maxElement) * (window.maxy()-Globals.VERTICAL_PADDING));
            int yTop = window.maxy() - barHeight;
            int widthMult = 1;
            if(i == Globals.hi){
                g.setColor(Color.red);
                
            }
            else if (i == Globals.lo){
                g.setColor(Color.blue);
               
            }
            else {
                g.setColor(Color.white);
            }

            g.fillRect(barWidth * i + HORIZONTAL_PADDING, yTop - (Globals.VERTICAL_PADDING/2), barWidth*widthMult, barHeight);
                
            }
        g.drawString("Array Accesses: " + Globals.ticks, window.maxx()/2 , window.maxy()-100);
        // Draw the complete off-screen image to the console.
        window.drawImage(offscreen, 0, 0, null);

    }

    public static void sortedComplete(){
        
        // Create an off-screen image that matches the size of the window.
        BufferedImage offscreen = new BufferedImage(window.maxx() + 1, window.maxy() + 1, BufferedImage.TYPE_INT_ARGB);
        Graphics g = offscreen.getGraphics();
        
        
        g.setColor(Color.green);
    
        for (int i = 0; i < totalElements; i++) {
        
            //calculate information needed for drawing bars
            int barHeight = (int) (((double) Globals.array.get(i) / maxElement) * (window.maxy()-Globals.VERTICAL_PADDING));
            int yTop = window.maxy() - barHeight;
            g.fillRect(barWidth * i + HORIZONTAL_PADDING, yTop - (Globals.VERTICAL_PADDING/2), barWidth, barHeight);
            g.drawString("Array Accesses: " + Globals.ticks, window.maxx()/2 , window.maxy()-100);
            window.drawImage(offscreen, 0, 0, null);
                
            }
       
        
        
    }
    
    

    
}