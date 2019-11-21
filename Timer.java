import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    protected int time = 120;
    
    public void act() 
    {
        Pong world = (Pong) getWorld();
        time -= world.getTimeStepDuration();
        setImage(new GreenfootImage("Time: " + (int) time, 20, Color.WHITE, new Color(0,0,0,0)));
    }    
}
