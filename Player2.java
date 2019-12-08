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
    private int speed = 4;
    private int size;
    protected boolean isSpeedDownTouchedByPlayer1;
    protected boolean isSpeedDown2TouchedByPlayer2;
    protected boolean isSizeDownTouchedByPlayer1;
    protected boolean isSizeDown2TouchedByPlayer2;
    protected boolean isMoveChanged;
    
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
        if (isSpeedDownTouchedByPlayer1 == true)
        {
            speed -= 1;
            isSpeedDownTouchedByPlayer1 = false;
            if (Greenfoot.isKeyDown("up")) 
            {setLocation(getX(), getY() - speed);}
            if (Greenfoot.isKeyDown("down"))
            {setLocation(getX(), getY() + speed);}
        }
        else if (isMoveChanged == true)
        {
            speed += 3;
            isMoveChanged = false;
            if (Greenfoot.isKeyDown("up")) 
            {setLocation(getX(), getY() - speed);}
            if (Greenfoot.isKeyDown("down"))
            {setLocation(getX(), getY() + speed);}
        }
        else if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - speed);
        }
        else if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + speed);
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
        
        Player1 p1 = getWorld().getObjects(Player1.class).get(0);
        if (playerspeedDown != null)
        {
            isSpeedDown2TouchedByPlayer2 = true;
            
            p1.isSpeedDown2TouchedByPlayer2 = true;
            p1.isMoveChanged = false;
            
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
            image.scale(image.getWidth(),Math.max(image.getHeight() - 25, 125));
            setImage(image);
            world.removeObject(playersizeUp);
        /*Actor playerSizeUp = getOneIntersectingObject(PlayerSizeUpEffect.class);
        World world = getWorld();
        if (playerSizeUp != null)
        {
        Player2SizeUp sizeUp = new Player2SizeUp();
        world.addObject(sizeUp, getX(), getY());    
        world.removeObject(playerSizeUp);
        world.removeObject(this);

        Greenfoot.playSound("powerUpEffect.wav"); */
        }
    }
    
    public void hitsizeDown()
    {
        Actor playersizeDown = getOneIntersectingObject(PlayerSizeDownEffect.class);
        World world = getWorld();
        
        Player1 p1 = getWorld().getObjects(Player1.class).get(0);
        if(playersizeDown != null)
        {
            //GreenfootImage image = getImage();
            //image.scale(image.getWidth(),image.getHeight() -5);
            //setImage(image);
            
            isSizeDown2TouchedByPlayer2 = true;
            p1.isSizeDown2TouchedByPlayer2 = true;
            world.removeObject(playersizeDown);
        }
        
    }
    
    public void sizeDown()
    {
        World world = getWorld();
        if (isSizeDownTouchedByPlayer1 == true)
        {
            GreenfootImage image = getImage();
            image.scale(image.getWidth(),Math.max(image.getHeight() - 25, 25));
            
            setImage(image);
            

            //Greenfoot.playSound("powerUpEffect.wav");
            isSizeDownTouchedByPlayer1 = false;
        }
    }
}
