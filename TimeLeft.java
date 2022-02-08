import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;

/**
 * Write a description of class TimeLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeLeft extends Writing
{
    /**
     * Act - do whatever the TimeLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timeLeft = 60;
    
    Date time1 = new Date();
    
    int initial = time1.getSeconds();
    
    public TimeLeft() {
        setImage(new GreenfootImage(": " + timeLeft, 40, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK));    
    }

    public void act()
    {
        // Add your action code here.
        print();
    }
    
    void print() {
        Date newTime1 = new Date();
        
        if (newTime1.getSeconds() != initial) {
            timeLeft--;
            initial = newTime1.getSeconds();
            
            if (timeLeft < 1) {
                Greenfoot.stop();
            }
        }
        setImage(new GreenfootImage(": " + timeLeft, 40, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK));    
    }
}
