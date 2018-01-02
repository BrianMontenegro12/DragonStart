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
    private int size;
    private int x;
    private int y;
    private int f;
    private int l;
    private int w;
    private int h;

    /**
     * Constructor for objects of class Scene
     */
    public Scene()
    {
        // initialise instance variables
        width = 0;
        size = 5;
        x = 250;
        y = 50;
        f = 5;
        l = 5;
    }
    public void drawBackground(Graphics g){
        g.setColor(Color.BLACK);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,w,h);
        g.setColor(Color.WHITE);
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * l,5,5);
    }
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 2),5,5);
    }
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 3),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 4),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 5),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 6),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 7),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 8),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 9),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 10),5,5);
}
        for(int f = 5; f <= 80; f += 5){
            g.fillOval(x + size * f, y + size * (l * 11),5,5);
}
        g.setColor(Color.BLUE);
}
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(){
        // put your code here
        return width;
    }
}
