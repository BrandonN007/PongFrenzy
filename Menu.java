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
        super("", 1000, 625, 1);    
        GreenfootSound music = new GreenfootSound("startMenu.wav");
        music.play();
    }
    
    public void playLoop()
    {
        
    }
    
    public void act()
    {
        
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new Pong());
            
        }
    }
    
    public void transitionToWorld(SimulationWorld newWorld)
    {
        
        Greenfoot.setWorld(newWorld);
        newWorld.started();
    }
        
        
        
}
