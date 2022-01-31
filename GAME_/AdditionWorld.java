import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AdditionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdditionWorld extends World
{

    /**
     * Constructor for objects of class AdditionWorld.
     * 
     */
    public AdditionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        DropMovers dropMovers = new DropMovers();
        addObject(dropMovers,934,117);
        DropMovers dropMovers2 = new DropMovers();
        addObject(dropMovers2,707,71);
        DropMovers dropMovers3 = new DropMovers();
        addObject(dropMovers3,168,164);
        DropMovers dropMovers4 = new DropMovers();
        addObject(dropMovers4,87,361);
        DropMovers dropMovers5 = new DropMovers();
        addObject(dropMovers5,167,539);
        DropMovers dropMovers6 = new DropMovers();
        addObject(dropMovers6,348,513);
        DropMovers dropMovers7 = new DropMovers();
        addObject(dropMovers7,684,572);
        DropMovers dropMovers8 = new DropMovers();
        addObject(dropMovers8,984,531);
        DropMovers dropMovers9 = new DropMovers();
        addObject(dropMovers9,935,362);
        DropMovers dropMovers10 = new DropMovers();
        addObject(dropMovers10,740,219);
        DropMovers dropMovers11 = new DropMovers();
        addObject(dropMovers11,695,349);

        FishPlayer FishPlayer = new FishPlayer();
        addObject(FishPlayer,206,487);
        FishPlayer1 FishPlayer1 = new FishPlayer1();
        addObject(FishPlayer1,195,362);
        FishPlayer2 FishPlayer2 = new FishPlayer2();
        addObject(FishPlayer2,194,245);
        FishPlayer3 FishPlayer3 = new FishPlayer3();
        addObject(FishPlayer3,191,144);
        
        Score score = new Score();
        addObject(score, 100, 80);
        
        TimeLeft timeLeft = new TimeLeft();
        addObject(timeLeft, 850, 80);
    }
}
