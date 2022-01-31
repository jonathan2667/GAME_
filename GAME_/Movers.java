import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends Actor
{
   
    int degrees = 0;
    boolean down = false;
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the enviroment.
     */
    public void act()
    {
        // Add your action code here.
    }

    public void checkMotion(int fishNumber) {
        Date time = new Date();
        
        int speedAhead = Greenfoot.getRandomNumber(3);
        int speedBackwards = Greenfoot.getRandomNumber(2);
        
        if (time.getSeconds() == 34 && fishNumber == 1) {
            motionAhead(speedAhead);
        } 
        if (time.getSeconds() == 56 && fishNumber == 2) {
            motionAhead(speedAhead);
        } 
        if (time.getSeconds() == 15 && fishNumber == 3) {
            motionAhead(speedAhead);
        } 
        if (time.getSeconds() == 7 && fishNumber == 4) {
            motionAhead(speedAhead);
        } 
        
        if (time.getSeconds() == 0 && fishNumber == 1) {
            motionBackwards(speedBackwards);
        } 
        if (time.getSeconds() == 29 && fishNumber == 2) {
            motionBackwards(speedBackwards);
        } 
        if (time.getSeconds() == 38 && fishNumber == 3) {
            motionBackwards(speedBackwards);
        } 
        if (time.getSeconds() == 44 && fishNumber == 4) {
            motionBackwards(speedBackwards);
        } 
    }

    public void motionAhead(int speed) {
        int x = getX();
        int y = getY();

        setLocation(x + speed, y);
    }
    
    public void motionBackwards(int speed) {
        int x = getX();
        int y = getY();

        setLocation(x - speed, y);
    }

    public void setMovement(int start, int stop) {
        if (degrees == stop) {
            down = true;
        }
        if (degrees == start) {
            down = false;
        }
        if (down) {
            degrees--;
        }
        else {
            degrees++;
        }
        setRotation(degrees);
    }

    public void wrapAtEdge() {
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth() - 1;
        int worldHeight = getWorld().getHeight() - 1;
        if (x >= worldWidth) {
            setLocation(1, y);            
        }
        if (x <=  0) {
            setLocation(worldWidth - 1, y);            
        }
        if (y >= worldHeight) {
            setLocation(x, 1);            
        }
        if (y <=  0) {
            setLocation(x, worldWidth - 1);            
        }
    }
}

