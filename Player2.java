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
<<<<<<< HEAD
        move(speed);
=======
>>>>>>> ad7512124e33d17f49186f2feaa866886d97a918
    }
    
    public void hitspeedUp()
    {
        Actor playerSpeedUp = getOneIntersectingObject(PlayerSpeedUpEffect.class);
        if(playerSpeedUp != null)
        {
<<<<<<< HEAD
            speed = speed + 3;
            move(speed);
=======
            World world = getWorld();
            world.removeObject(playerSpeedUp);
            Greenfoot.playSound("powerUpEffect.wav");
            if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
            }
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
            }
>>>>>>> ad7512124e33d17f49186f2feaa866886d97a918
        }        
    }
    
    public void hitspeedDown()
    {
<<<<<<< HEAD
        Actor playerspeedDown = getOneIntersectingObject(PlayerSpeedDown.class);
        if(playerspeedDown != null)
        {
            speed = speed - 3;
            move(speed);
        }   
=======
        Actor playerSpeedDown = getOneIntersectingObject(PlayerSpeedDownEffect.class);
        if(playerSpeedDown != null)
        {
            World world = getWorld();
            world.removeObject(playerSpeedDown);
            
            int player1X;
            int player1Y;
            
            player1X = getX();
            player1Y = getY();
            
        } 
>>>>>>> ad7512124e33d17f49186f2feaa866886d97a918
    }
   
    public void hitsizeUp()
    {
<<<<<<< HEAD
        Actor playersizeUp = getOneIntersectingObject(PlayerSizeUp.class);
        if(playersizeUp != null)
        {
            GreenfootImage image = getImage();
            image.scale(image.getWidth(),image.getHeight() +5);
            setImage(image);
=======
        Actor playerSizeUp = getOneIntersectingObject(PlayerSizeUpEffect.class);
        World world = getWorld();
        if (playerSizeUp != null)
        {
        Player2SizeUp sizeUp = new Player2SizeUp();
        world.addObject(sizeUp, getX(), getY());    
        world.removeObject(playerSizeUp);
        world.removeObject(this);

        Greenfoot.playSound("powerUpEffect.wav");
>>>>>>> ad7512124e33d17f49186f2feaa866886d97a918
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
