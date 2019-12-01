import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends SimulationWorld
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super("pongMenu.wav", 1000, 625, 1);    
    }
    
    public void isKeyDown()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new Pong());           
        }
    }
    public void act()
    {
        super.act();
        isKeyDown();
    }
   
        
        
}
