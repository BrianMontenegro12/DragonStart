import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private String h;
    private int cookie;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = (Color.BLUE);
        h = "yes";
    }
    
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int x, int y, int size, Color c, String h){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c;
        this.h = h;
    }

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c);
        g.fillRect(x, y , size * 25, size * 25);
        g.fillRect(x + size * 25, y + size * 25, size * 60, size * 50);
        g.fillRect(x + size * 25, (y + size * 25) + size * 50, size * 10, size * 25);
        g.fillRect(x + size * 75, (y + size * 25) + size * 50, size * 10, size * 25);
        g.fillRect(x + size * 85, y + size * 25, size * 30, size * 10);
        g.setColor(Color.WHITE);
        g.drawRect(x + size * -150, y + size * 130, size * 100, size * 10);
        g.setColor(Color.YELLOW);
        g.fillOval(x + size * -25, y + size * 100, size * 40, size * 40);//the cookie
    }
    public void cookieEat(Graphics g) throws InterruptedException 
    {
        g.setColor(Color.BLACK);
        Thread.sleep(1000);
        g.setColor(Color.GREEN);
        g.fillRect(x + size * -149, y + size * 130, size * 30, size * 9);
        g.setColor(Color.BLACK);
        g.fillRect(x + size * -25, y + size * 100, size * 20, size * 20);
        Thread.sleep(1000);
        g.setColor(Color.GREEN);
        g.fillRect(x + size * -149, y + size * 130, size * 60, size * 9);
        g.setColor(Color.BLACK);
        g.fillRect(x + size * -25, y + size * 120, size * 20, size * 20);
        Thread.sleep(1000);
        g.setColor(Color.GREEN);
        g.fillRect(x + size * -149, y + size * 130, size * 90, size * 9);
        g.setColor(Color.BLACK);
        g.fillRect(x + size * -5, y + size * 100, size * 20, size * 20);
        Thread.sleep(1000);
        g.setColor(Color.GREEN);
        g.fillRect(x + size * -149, y + size * 130, size * 100, size * 9);
        g.setColor(Color.BLACK);
        g.fillRect(x + size * -5, y + size * 120, size * 20, size * 20);
    }
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " color: " + c + " health: " + h;
    }
}
