import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       
       Scene cool = new Scene();
       cool.drawBackground(g);
       
       Dragon head = new Dragon();
       head.drawDragon(g);
     
       System.out.println(head);
       
       Dragon body = new Dragon(300,300,2,Color.GREEN,10);
       body.drawDragon(g);
       body.cookieEat(g);
       
       
    }
}
