import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSpeedDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSpeedDown extends PowerUp
{
    /**
     * Act - do whatever the PlayerSpeedDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
