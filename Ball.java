import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    public void act()
    {
        move(3);
        bounce();
    }

    /**
     * 
     */
    public void move()
    {
        move(3);
    }



    /**
     * 
     */
    public void bounce()
    {
        Actor brick = getOneIntersectingObject(Brick.class);
        if (brick != null) {
            World world = getWorld();
            world.removeObject(brick);
            turn(Greenfoot.getRandomNumber(90));
        }
        Actor player1 = getOneIntersectingObject(Player1.class);
        if (player1 != null) {
            turn(90);
        }
        Actor player2 = getOneIntersectingObject(Player2.class);
        if (player2 != null) {
            turn(90);
        }
    }  
}
