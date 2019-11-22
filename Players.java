import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean isAtUpperEdge() 
    {
        if(getY() <= 30)
            return true;
        else
            return false;    
    }   
    
    public boolean isAtLowerEdge()
    {
        if (getY() >= getWorld().getHeight()-30)
           return true;
           else
           return false;
    }
}
