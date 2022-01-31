import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Writing
{
    int score = 0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score() {
        setImage(new GreenfootImage("SCORE: " + score, 40, Color.BLACK, new Color(0,0,0, 0 )));    
    }
    
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("SCORE: " + score, 40, Color.BLACK, new Color(0,0,0, 0 )));    
    }
}
