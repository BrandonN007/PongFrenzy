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
    }
   
    
    public void hitspeedUp()
    {
        Actor playerSpeedUp = getOneIntersectingObject(PlayerSpeedUpEffect.class);
        if(playerSpeedUp != null)
        {
            World world = getWorld();
            world.removeObject(playerSpeedUp);
            Greenfoot.playSound("powerUpEffect.wav");
            if (Greenfoot.isKeyDown("w")) 
            {setLocation(getX(), getY() - 6);}
            if (Greenfoot.isKeyDown("s"))
            {setLocation(getX(), getY() + 6);}
        }            
    }
    
    public void hitspeedDown()
    {
        Actor playerSpeedDown = getOneIntersectingObject(PlayerSpeedDownEffect.class);
        if (playerSpeedDown != null)
        {
            World world = getWorld();
            world.removeObject(playerSpeedDown);
            int player2X;
            int player2Y;
            
            player2X = getX();
            player2Y = getY();
        
        }
    }
   
    public void hitsizeUp()
    {
        Actor playerSizeUp = getOneIntersectingObject(PlayerSizeUpEffect.class);
        World world = getWorld();
        if (playerSizeUp != null)
        {
        Player1SizeUp sizeUp = new Player1SizeUp();
        world.addObject(sizeUp, getX(), getY());
        world.removeObject(playerSizeUp);
        world.removeObject(this);
 
        Greenfoot.playSound("powerUpEffect.wav");
        }
    }
    
    public void hitsizeDown()
    {
        GreenfootImage image = getImage();
        setImage(image);
    }
}
