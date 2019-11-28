import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int BALL_SPEED;
    
    
    public Ball()
    {
        
    }
    public void act()
    {
        move();
        bounce();
        isAtEdges();
        isAtLeftEdge();
        remove(); 
        hitPortal();
       
    }
    
    public void move()
    {
        move(3);
    }
    
    public void bounce()
    {
        Actor brick = getOneIntersectingObject(Brick.class);
        Actor powerUp = getOneIntersectingObject(PowerUp.class);
        World world = getWorld();
        if (brick != null) {
            world.removeObject(brick);
            turn(90);
        }
        if (isTouching(PowerUp.class))
        {
            world.addObject(new Size(), getX(), getY());
        }
        
        Actor player1 = getOneIntersectingObject(Player1.class);
        if (player1 != null)
        {
           int offset = getY() - player1.getY();
           //turn(-90 - offset);
           setRotation(offset);

        }
        Actor player2 = getOneIntersectingObject(Player2.class);
        if (player2 != null) 
        {
            int offset = getY() + player2.getY();
            //turn (90 + offset);
            setRotation(offset);
        }
        
        if (getX() == 0 || getX() == 1000)
        {
            world.removeObject(this);
        }
        
        if (getY() == 0)
        {
            if (getRotation() <= 90)
            {
                setRotation(360 + getRotation());
            }
            else
            {
                setRotation(360 - getRotation());
            }  
        }
        
        if (getY() == 625)
        {
            if (getRotation() >= 90)
            {
                setRotation(360 - getRotation());
            }
            else
            {
                setRotation(180 + getRotation());
            }
        }
    }  
    
    public void isAtEdges()
    {
        if (isAtEdge())
        {
            if (getRotation() <= 90)
            {
                setRotation(180 + getRotation());
            }
            if (getRotation() > 90)
            {
                setRotation(180 - getRotation());
            }
        }
    }
    
    public boolean isAtLeftEdge()
    {    
        World world = getWorld();
        if (getX() <= 0 || getX() >= 1000)
        return true;
        else
        return false;
    }
    
    public void remove()
    {
        World world = getWorld();
        if (isAtLeftEdge() == true)
        {
            world.removeObject(this);
        }
    }
    
    public void hitPortal()
    {
        Portal portal = (Portal)getOneIntersectingObject(Portal.class);
        if (portal != null && portal.isPortalDisabled() == false) {
            World world = getWorld();
            world.addObject( new  Ball(), getX(), getY());
            turn(Greenfoot.getRandomNumber(50) - 45);
            portal.disable();
        }
        if (isAtEdge()) {
            turn((95));
        }
        
        Actor portal2 = getOneIntersectingObject(Portal2.class);
        if (portal2 != null)
        {
            setLocation(getX() + 5, getY() + 5);
        }
        
        Actor portal3 = getOneIntersectingObject(Portal3.class);
        if(portal3 != null)
        {
            GreenfootImage image = getImage();
            image.scale(90,90);
            setImage(image);
        }
    }
}
        
            
    
    
        
        

