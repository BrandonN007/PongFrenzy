import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(1000, 625, 1); 
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
