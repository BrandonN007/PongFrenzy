import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    protected double time = 120.0;
    
    public Timer()
    {
        time = 120.0;
    }
    
    public void act() 
    {
        Pong world = (Pong) getWorld();
        time -= world.getTimeStepDuration();

        
        String timeStr = "0";
        if (time >= 120.0)
            timeStr += "2:";
        else if (time >= 60.0)
            timeStr += "1:";
        else 
            timeStr += "0:";
        
        int seconds = ((int)time) % 60;
        
        if (seconds < 10)
        {
            timeStr += "0" + seconds;
        }
        else
        {
            timeStr += "" + seconds;
        }
        
        setImage(new GreenfootImage("Time: " + timeStr, 20, Color.WHITE, new Color(0,0,0,0)));
    }    
}
