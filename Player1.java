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
        hitspeedUp();
        hitspeedDown();
        hitsizeUp();
        hitsizeDown();
    }    
    
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4);
        }
        move(speed);
    }
    
    public void hitspeedUp()
    {
        Actor playerspeedUp = getOneIntersectingObject(PlayerSpeedUp.class);
        if(playerspeedUp != null)
        {
            speed = speed + 3;
            move(speed);
        }        
    }
    
    public void hitspeedDown()
    {
        Actor playerspeedDown = getOneIntersectingObject(PlayerSpeedDown.class);
        if(playerspeedDown != null)
        {
            speed = speed - 3;
            move(speed);
        }   
    }
   
    public void hitsizeUp()
    {
        Actor playersizeUp = getOneIntersectingObject(PlayerSizeUp.class);
        if(playersizeUp != null)
        {
            GreenfootImage image = getImage();
            image.scale(image.getWidth(),image.getHeight() +5);
            setImage(image);
        }
    }
    
    public void hitsizeDown()
    {
        Actor playersizeDown = getOneIntersectingObject(PlayerSizeDown.class);
        if(playersizeDown != null)
        {
            GreenfootImage image = getImage();
            image.scale(image.getWidth(),image.getHeight() -5);
            setImage(image);
        }
    }
}
