import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSizeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSizeDownEffect extends PowerUp
{

    public void act() 
    {
        move(2);
        remove();
    }    
    
    public void remove()
    {
        World world = getWorld();
        if (getX() == 0 || getX() == 999)
        {
            world.removeObject(this);
        }
    }
}
