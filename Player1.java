import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Players
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int size;
    public void act() 
    {
        move();
        speed();
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
    
    public void speed()
    {
        Actor powerUp = getOneIntersectingObject(PowerUp.class);
        if(powerUp != null)
        {
            setLocation(getX() + 5, getY() + 5);
            GreenfootImage image = getImage();
            speed = Greenfoot.getRandomNumber(4)+1;
            setImage(image);
        }
    }
    
    
}
