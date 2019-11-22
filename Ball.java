import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int BALL_SPEED = 3;
    
    public Ball()
    {
        //ball
    }
    public void act()
    {
        move(3);
        bounce();
    }

    public void move()
    {
        move(3);
    }
    
    public void bounce()
    {
        Actor brick = getOneIntersectingObject(Brick.class);
        Actor powerUp = getOneIntersectingObject(PowerUp.class);
        if (brick != null) {
            World world = getWorld();
            world.removeObject(brick);
            turn(90);
        }
        if (powerUp != null)
        {
            World world = getWorld();
            world.removeObject(powerUp);
        }
        
        Actor player1 = getOneIntersectingObject(Player1.class);
        if (player1 != null)
        {
           int offset = getY() - player1.getY();
         // turn(-90 - offset);
           setRotation(offset);

        }
        Actor player2 = getOneIntersectingObject(Player2.class);
        if (player2 != null) {
            turn(90);
        }
        
        if (isAtEdge())
        {
            setRotation(360 - getRotation());
        }
    }  
    
    public boolean isAtLeftEdge()
    {    
        if (getX() < 0)
            return true;
        else
            return false;
    }
}
