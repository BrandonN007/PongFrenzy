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
    private boolean isSpeedDownTouchedByPlayer1;
    private boolean isSpeedDown2TouchedByPlayer2;
    private boolean isSizeDownTouchedByPlayer1;
    private boolean isSizeDown2TouchedByPlayer2;
    private boolean isMoveChanged;
    
    public void act() 
    {
        move();
        hitspeedUp();
        hitspeedDown();
        hitsizeUp();
        hitsizeDown();
        sizeDown();
    }    
    
    public void move()
    {
        if (isMoveChanged == true)
        {
            if (Greenfoot.isKeyDown("w")) 
            {setLocation(getX(), getY() - 5);}
            if (Greenfoot.isKeyDown("s"))
            {setLocation(getX(), getY() + 5);}
        }
        
        if (isSpeedDown2TouchedByPlayer2 == true)
        {
            if (Greenfoot.isKeyDown("w")) 
            {setLocation(getX(), getY() - 3);}
            if (Greenfoot.isKeyDown("s"))
            {setLocation(getX(), getY() + 3);}
        }
        
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
            isMoveChanged = true;
            World world = getWorld();
            world.removeObject(playerSpeedUp);
            Greenfoot.playSound("powerUpEffect.wav");
        }  
    }
    
    public void hitspeedDown()
    {
        Actor playerspeedDown = getOneIntersectingObject(PlayerSpeedDownEffect.class);
        World world = getWorld();
        
        if(playerspeedDown != null)
        {
            isSpeedDownTouchedByPlayer1 = true; 
            world.removeObject(playerspeedDown);
        }
    }
    
   
    public void hitsizeUp()
    {
        Actor playersizeUp = getOneIntersectingObject(PlayerSizeUpEffect.class);
        World world = getWorld();
        if(playersizeUp != null)
        {
            Greenfoot.playSound("powerUpEffect.wav");
            GreenfootImage image = getImage();
            image.scale(image.getWidth(),image.getHeight() + 75);
            setImage(image);
            world.removeObject(playersizeUp);
        }
        /*Actor playerSizeUp = getOneIntersectingObject(PlayerSizeUpEffect.class);
        World world = getWorld();
        if (playerSizeUp != null)
        {
        Player1SizeUp sizeUp = new Player1SizeUp();
        world.addObject(sizeUp, getX(), getY());
        world.removeObject(playerSizeUp);
        world.removeObject(this);
 
        Greenfoot.playSound("powerUpEffect.wav");
        }*/
    }
    
    public void hitsizeDown()
    {
        Actor playersizeDown = getOneIntersectingObject(PlayerSizeDownEffect.class);
        World world = getWorld();
        if(playersizeDown != null)
        {
            /*GreenfootImage image = getImage();
            image.scale(image.getWidth(),image.getHeight() -5);
            setImage(image);*/
            isSizeDownTouchedByPlayer1 = true;
            world.removeObject(playersizeDown);
            
        }
    }
    
     public void sizeDown()
    {
        World world = getWorld();
        if (isSizeDown2TouchedByPlayer2 == true)
        {
            GreenfootImage image = getImage();
            image.scale(image.getWidth(),image.getHeight() - 25);
            setImage(image);
            Greenfoot.playSound("powerUpEffect.wav");
            world.removeObject(this);
        }
    }
}
