import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int speed = 3;
    boolean isLastTouchedByPlayer1;
    
    public Ball(boolean isLastTouchedByPlayer1)
    {
        this.isLastTouchedByPlayer1 = isLastTouchedByPlayer1;
    }
    
    public void act()
    {
        try
        {
        
            move();
            /*size();*/
            bounce();
            hitPortal();
            scorePlayer1();
            scorePlayer2();
            bounceBrickPowerUp();

        }
        catch(Exception e)
        {
        }
       
    }
    
    public void move()
    {
        move(speed);
    }
    public void bounceBrickPowerUp()
    {
        Actor brickPowerUp = getOneIntersectingObject(BrickPowerUp.class);
        if (brickPowerUp != null)
        {
            turn(120 + Greenfoot.getRandomNumber(120));
            World world = getWorld();
            world.removeObject(brickPowerUp);
            Greenfoot.playSound("breakingPowerUpWall.wav");
            
            // Drop power up 1/4 of the time
            if (Greenfoot.getRandomNumber(4) == 0)
            {
                PlayerSizeUpEffect sizeUp = new PlayerSizeUpEffect();
                world.addObject(sizeUp, getX(), getY());
                if (isLastTouchedByPlayer1)
                {
                    sizeUp.setRotation(180 - sizeUp.getRotation());
                }
            
            }
            else
             if (Greenfoot.getRandomNumber(4) == 1)
            {
                PlayerSpeedUpEffect speedUp = new PlayerSpeedUpEffect();
                world.addObject(speedUp, getX(), getY());
                if (isLastTouchedByPlayer1)
                {
                    speedUp.setRotation(180 - speedUp.getRotation());
                }
            }
            else
            if (Greenfoot.getRandomNumber(4) == 2)
            {
                PlayerSizeDownEffect sizeDown = new PlayerSizeDownEffect();
                world.addObject(sizeDown, getX(), getY());
                if (isLastTouchedByPlayer1)
                {
                    sizeDown.setRotation(180 - sizeDown.getRotation());
                }
            }
            else
            if (Greenfoot.getRandomNumber(4) == 3)
            {
                PlayerSpeedDownEffect speedDown = new PlayerSpeedDownEffect();
                world.addObject(speedDown, getX(), getY());
                if (isLastTouchedByPlayer1)
                {
                    speedDown.setRotation(180 - speedDown.getRotation());
                }
            }
        }
      
    }
    
    
    public void bounce()
    {
        Actor brick = getOneIntersectingObject(Brick.class);
        Actor brickPowerUp = getOneIntersectingObject(BrickPowerUp.class);
        World world = getWorld();
        if (brick != null) {
            world.removeObject(brick);
            Greenfoot.playSound("breakingWall.mp3");
            turn(120 + Greenfoot.getRandomNumber(120));
        }
       
        
        Actor player1 = getOneIntersectingObject(Player1.class);
        if (player1 != null)
        {
           int offset = getY() - player1.getY();
           //turn(-90 - offset);
           setRotation(offset);
           isLastTouchedByPlayer1 = true;
           GreenfootSound sound = new GreenfootSound("bounce.mp3");
           sound.play();
        }
        Actor player1sizeUp = getOneIntersectingObject(Player1SizeUp.class);
        if (player1sizeUp != null)
        {
           int offset = getY() - player1.getY();
           //turn(-90 - offset);
           setRotation(offset);
           isLastTouchedByPlayer1 = true;
           GreenfootSound sound = new GreenfootSound("bounce.mp3");
           sound.play();
        }
        Actor player1sizeDown = getOneIntersectingObject(Player1SizeDown.class);
        if (player1sizeDown != null)
        {
           int offset = getY() - player1.getY();
           //turn(-90 - offset);
           setRotation(offset);
           isLastTouchedByPlayer1 = true;
           GreenfootSound sound = new GreenfootSound("bounce.mp3");
           sound.play();
        }
        
        
        Actor player2 = getOneIntersectingObject(Player2.class);
        if (player2 != null) 
        {
            int offset = getY() - player2.getY();
            //turn (90 + offset);
            setRotation(180 - offset);

            isLastTouchedByPlayer1 = false;
            GreenfootSound sound = new GreenfootSound("bounce.mp3");
        }
        Actor player2SizeUp = getOneIntersectingObject(Player2SizeUp.class);
        if (player2SizeUp != null) 
        {
            int offset = getY() + player2.getY();
            //turn (90 + offset);
            setRotation(offset);
            isLastTouchedByPlayer1 = false;
        }
        Actor player2SizeDown = getOneIntersectingObject(Player2SizeDown.class);
        if (player2SizeDown != null) 
        {
            int offset = getY() + player2.getY();
            //turn (90 + offset);
            setRotation(offset);
            isLastTouchedByPlayer1 = false;
        }
        
        if (isAtEdge())
        {
            if (Math.abs(getRotation() - 90) < 15)
            {
                setRotation(getRotation() + 45);
            }
            if (Math.abs(getRotation() - 270) < 15)
            {
                setRotation(getRotation() + 45);
            }
            
            setRotation(270 - getRotation());
        }
    
        
        
        /*if (getY() == 1)
        {
            if (getRotation() >= 270)
            {
                setRotation(180 + (getRotation() - 270));
            }
            else
            {
                setRotation(90 + (270 - getRotation()));
            }  
        }
        
        if (getY() == 624)
        {
            if (getRotation() >= 90)
            {
                setRotation(90 + (getRotation() - 90));
            }
            else
            {
                setRotation(90 - (getRotation() + 90));
            }
        }*/
      } 
    
    
    public void scorePlayer1()
     {
      Pong world = (Pong) getWorld();  
      if (getX() == 999)
         {
            world.removeObject(this);
            world.increaseScorePlayer1();
            Greenfoot.playSound("scorePlusOne.wav");
         }
    }
    
    public void scorePlayer2()
     {
      Pong world = (Pong) getWorld();  
      if (getX() == 0)
         {
            world.removeObject(this);
            world.increaseScorePlayer2();
            Greenfoot.playSound("scorePlusOne.wav");
         }
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public void hitPortal()
    {
        Portal portal = (Portal)getOneIntersectingObject(Portal.class);
        if (portal != null && portal.isPortalDisabled() == false) {
            World world = getWorld();
            Ball newBall = new Ball(isLastTouchedByPlayer1);
            newBall.setImage(getImage());
            newBall.setSpeed(speed);
            Greenfoot.playSound("ballSplit.wav");
            world.addObject(newBall, getX(), getY());
            turn(Greenfoot.getRandomNumber(50) - 45);
            portal.disable();
        }
        if (isAtEdge()) {
            turn((95));
        }
        
        Actor portal2 = getOneIntersectingObject(Portal2.class);
        if (portal2 != null)
        {
            speed = speed + 1;
            move(speed);
        }
        
        Actor portal3 = getOneIntersectingObject(Portal3.class);
        if(portal3 != null)
        {
            GreenfootImage image = getImage();
            image.scale(60,60);
            setImage(image);
        }
    }
    
    /*public void size()
    {
        Actor powerUp = getOneIntersectingObject(PowerUp.class);        
        if(powerUp != null)
        {
            GreenfootImage ballImage = getImage();
            double scaleFactor = (1 + Greenfoot.getRandomNumber(5)) / 3.0;
   //             System.out.println(scaleFactor);
            ballImage.scale( (int)(ballImage.getWidth()*scaleFactor), (int)(ballImage.getHeight()*scaleFactor));
            setImage(ballImage);            

            if (isLastTouchedByPlayer1 == true)
            {
                Player1 p1 = getWorld().getObjects(Player1.class).get(0);
                p1.getImage().scale((int)(p1.getImage().getWidth()), (int)(p1.getImage().getHeight()*scaleFactor));
            }
            else
            {
                Player2 p2 = getWorld().getObjects(Player2.class).get(0);
                p2.getImage().scale((int)(p2.getImage().getWidth()), (int)(p2.getImage().getHeight()*scaleFactor));
            }
        
        }*/
        
        
}

        
            
    
    
        
        

