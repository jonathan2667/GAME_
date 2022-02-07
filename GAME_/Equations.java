import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Equations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equations extends Solve

{
    /**
     * Act - do whatever the Equations wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    boolean isPressed;

    String key;
    String upImage;
    String downImage;

    boolean change;

    int value;
    int position;
    int answer;
    int score = 0;

    int positionGoodAnswer = 0;
    int[] randomNumbers;

    public Equations() {
        setImage(new GreenfootImage("                  ", 60, Color.WHITE, new Color(8,156,228 ))); 

    }

    public void act()
    {
        // Add your action code here.

        if (count == 0) 
            printOnBoard();
        
        findIfTouched();
        count++;

    }

    public void keyPressed(String key, String downImage, String upImage) {
        if (Greenfoot.isKeyDown(key) && !isPressed) {;
            setImage(downImage);
            isPressed = true;
        }
        if (!Greenfoot.isKeyDown(key) && isPressed) {
            setImage(upImage);
            isPressed = false;
        }
    }

    public void printOnSquares(String value) {      
        getWorld().showText(value, getX(), getY());

    }
    public void showAnswer() {
        if (positionGoodAnswer == 1) {

            getWorld().showText("", 820, 540);
            getWorld().showText("", 930, 540);
            getWorld().showText("", 1040, 540);
            
            Greenfoot.delay(60);

        }

        else if (positionGoodAnswer == 2)  {
 
            getWorld().showText("", 710, 540);
            getWorld().showText("", 930, 540);
            getWorld().showText("", 1040, 540);
            
            Greenfoot.delay(60);
        }

        else if (positionGoodAnswer == 3) {    
 
            getWorld().showText("", 710, 540);
            getWorld().showText("", 820, 540);
            getWorld().showText("", 1040, 540);
            
            Greenfoot.delay(60);
        }

        else if (positionGoodAnswer == 4) {

            getWorld().showText("", 710, 540);
            getWorld().showText("", 820, 540);
            getWorld().showText("", 930, 540);
            
            Greenfoot.delay(60);
        }

    }
    public int[] generateNumbers(int sum) {
        int min = sum / 10 * 10;
        int max = min + 10;

        int n1 = Greenfoot.getRandomNumber(max - min + 1) + min;

        int n2 = Greenfoot.getRandomNumber(max - min + 1) + min;
        while (n2 == n1)
            n2 = Greenfoot.getRandomNumber(max - min + 1) + min;

        int n3 = Greenfoot.getRandomNumber(max - min + 1) + min;
        while (n3 == n2 || n3 == n1)
            n3 = Greenfoot.getRandomNumber(max - min + 1) + min;

        int n4 = Greenfoot.getRandomNumber(max - min + 1) + min;
        while (n4 == n3 || n4 == n2 || n4 == n1)
            n4 = Greenfoot.getRandomNumber(max - min + 1) + min;

        int[] arr = new int[4];
        arr[0] = n1;
        arr[1] = n2;
        arr[2] = n3;
        arr[3] = n4;

        boolean answerAlreadyThere = false;

        for (int i = 0; i < 4; i++)
            if (arr[i] == sum) {
                positionGoodAnswer = i + 1;
                answerAlreadyThere = true;
            }

        if (!answerAlreadyThere) {
            int newRandom = Greenfoot.getRandomNumber(3);
            positionGoodAnswer = newRandom + 1;
            arr[newRandom] = sum;
        }

        return arr;

    }

    public void printOnBoard() {
        //((Solve)getWorld().getObjects(Solve.class).get(0)).ok = 1;

        int number1 = Greenfoot.getRandomNumber(100);
        int number2 = Greenfoot.getRandomNumber(100);

        answer = number1 + number2;

        setImage(new GreenfootImage("   " + number1 + " + " + number2 + " :   ", 60, Color.WHITE, new Color(8,156,228 ), Color.BLACK)); 

        int sum = answer;
        randomNumbers = generateNumbers(sum);

        Squares1 squares1 = new Squares1("" + 1, "white-key.jpeg", "white-key-down.jpeg",""+ randomNumbers[0], 1);
        getWorld().addObject(squares1, 710, 540);

        Squares2 squares2 = new Squares2("" + 2, "white-key.jpeg", "white-key-down.jpeg",""+ randomNumbers[1], 2);
        getWorld().addObject(squares2, 820, 540);

        Squares3 squares3 = new Squares3("" + 3, "white-key.jpeg", "white-key-down.jpeg",""+ randomNumbers[2], 3);
        getWorld().addObject(squares3, 930, 540);

        Squares4 squares4 = new Squares4("" + 4, "white-key.jpeg", "white-key-down.jpeg",""+ randomNumbers[3], 4);
        getWorld().addObject(squares4, 1040, 540);
    }

    public void findIfTouched() {

        if (((Squares1)getWorld().getObjects(Squares1.class).get(0)).value == ("" + answer))
            positionGoodAnswer = 1;
        else if (((Squares2)getWorld().getObjects(Squares2.class).get(0)).value == ("" + answer))
            positionGoodAnswer = 2;
        else if (((Squares3)getWorld().getObjects(Squares3.class).get(0)).value == ("" + answer))
            positionGoodAnswer = 3;
        else if (((Squares4)getWorld().getObjects(Squares4.class).get(0)).value == ("" + answer))
            positionGoodAnswer = 4;

        if (Greenfoot.mouseClicked(Squares1.class) || Greenfoot.isKeyDown("1")) {
            if (positionGoodAnswer == 1) {
                score++;
                Actor fish2 = (Actor)getWorld().getObjects(FishPlayer2.class).get(0);
                ((FishPlayer2)getWorld().getObjects(FishPlayer2.class).get(0)).setLocation(fish2.getX() + 15, fish2.getY());
                printOnBoard();
            }
            else {
                showAnswer();
            }
        }
        else if (Greenfoot.mouseClicked(Squares2.class) || Greenfoot.isKeyDown("2")) {
            if (positionGoodAnswer == 2) {
                score++;
                Actor fish2 = (Actor)getWorld().getObjects(FishPlayer2.class).get(0);
                ((FishPlayer2)getWorld().getObjects(FishPlayer2.class).get(0)).setLocation(fish2.getX() + 15, fish2.getY());
                printOnBoard();
            }
            else {
                showAnswer();
            }
        }
        else if (Greenfoot.mouseClicked(Squares3.class) || Greenfoot.isKeyDown("3")) {
            if (positionGoodAnswer == 3) { 
                score++;
                Actor fish2 = (Actor)getWorld().getObjects(FishPlayer2.class).get(0);
                ((FishPlayer2)getWorld().getObjects(FishPlayer2.class).get(0)).setLocation(fish2.getX() + 15, fish2.getY());
                printOnBoard(); 
                
            }
            else {
                showAnswer();
            }
        }
        else if (Greenfoot.mouseClicked(Squares4.class) || Greenfoot.isKeyDown("4")) {
            if (positionGoodAnswer == 4) {
                score++;
                Actor fish2 = (Actor)getWorld().getObjects(FishPlayer2.class).get(0);
                ((FishPlayer2)getWorld().getObjects(FishPlayer2.class).get(0)).setLocation(fish2.getX() + 15, fish2.getY());
                printOnBoard();
            }
            else {
                showAnswer();
            }

        }
    }
}
