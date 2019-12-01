import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ending here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending extends SimulationWorld

{

    /**
     * Constructor for objects of class Ending.
     * 
     */
    public Ending(int scorePlayer1, int scorePlayer2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super("ending.wav", 1000, 625, 1); 
        
        if (scorePlayer1 < scorePlayer2)
        {
            showText("Player 2 Wins!", 440, 240);
            showText(scorePlayer1 + " - " + scorePlayer2, 440, 265);
        }
        else 
        if (scorePlayer1 > scorePlayer2)
        {
            showText("Player 1 Wins!", 440, 240);
            showText(scorePlayer1 + " - " + scorePlayer2, 440, 265);
        }
        else 
        if (scorePlayer1 == scorePlayer2)
        {
            showText("It's a tie!", 440, 240);
            showText(scorePlayer1 + " - " + scorePlayer2, 440, 265);
        }
    }
    
    public void isKeyDown()
    {
        World pong = new Pong();
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Pong());
        }
    }
    
    public void act()
    {
        super.act();
        isKeyDown();
    }
}
