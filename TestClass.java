import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
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
     
       
       Dragon body = new Dragon(300,300,2,Color.GREEN,10);
       body.drawDragon(g);
       body.cookieEat(g);
       Scanner input = new Scanner(System.in);
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       
       int num;
       
       do{
           System.out.println("How many dragons ye want?");
           num = input.nextInt();
       
       
    }
    while(num <= 0);
    
        for(int i = 1; i <= num; i++){
            Dragon temp = new Dragon(90*i + 25, 90*i + 50, 1, new Color(50*i, 50*i, 50*i), i);
            dragons.add(temp);
}

for(int i = 0; i < dragons.size(); i++){
    dragons.get(i).drawDragon(g);
}
}
}
