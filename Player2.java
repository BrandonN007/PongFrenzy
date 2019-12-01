import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Players
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int size;
    public void act() 
    {
        move();
        speed();
        hitspeedUp();
        hitspeedDown();
        hitsizeUp();
        hitsizeDown();
    }    
    
    public void move()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down")) {
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
    
    public void hitspeedUp()
    {
        Actor playerspeedUp = getOneIntersectingObject(PlayerSpeedUp.class);
        if(playerspeedUp != null)
        {
            setLocation(getX() + 5, getY() + 5);
            GreenfootImage image = getImage();
            setImage(image);
            speed = speed + 1;
            move(speed);
        }        
    }
    
    public void hitspeedDown()
    {
        setLocation(getX() + 5, getY() + 5);
        GreenfootImage image = getImage();
        setImage(image);
        speed = speed - 1;
        move(speed);
    }
    
    public void hitsizeUp()
    {
        GreenfootImage image = getImage();
        setImage(image);
    }
    
    public void hitsizeDown()
    {
        GreenfootImage image = getImage();
        setImage(image);
    }
}
