import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Size here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Size extends PowerUp
{
    /**
     * Act - do whatever the Size wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move()
    {
        move(2);
    }
}
