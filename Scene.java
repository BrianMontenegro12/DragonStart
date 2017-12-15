import java.awt.*;
/**
 * Write a description of class Scene here.
 * 
 * 
 * 
 * 
 * 
 * ITS GONNA BE A SPACE THEME LIKE STAR WARS BUT WITH DRAGONS. I NEED TO GET
 * THE CLASSES TO MERGE OR SOMETHING AND TO SET BACKGROUND. AND I COULD MAKE
 * THE SCENE INTERACTIVE IN A WAY
 *
 *
 *
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene
{
    // instance variables - replace the example below with your own
    private int width;

    /**
     * Constructor for objects of class Scene
     */
    public Scene()
    {
        // initialise instance variables
        width = 0;
    }
    public void drawBackground(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,800,800);
        g.setColor(Color.WHITE);
        g.fillOval(500,80,5,5);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return width;
    }
}
