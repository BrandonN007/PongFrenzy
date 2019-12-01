import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1SizeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1SizeDown extends Players
{
    /**
     * Act - do whatever the Player1SizeDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4);
        }
    }
}
