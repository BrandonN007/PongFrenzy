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
    public Ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super("endMenu.wav", 852, 480, 1); 
    }
    
    public void act()
    {
        World pong = new Pong();
        if (Greenfoot.isKeyDown("space"));
        {
            Greenfoot.setWorld(new Pong());
        }
    }
}
