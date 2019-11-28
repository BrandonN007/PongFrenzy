import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;
/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    protected static final double TIME_DISABLED = 2.0;
    protected double timeUntilEnabled;
    protected boolean isDisabled;
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Portal()
    {
        timeUntilEnabled = TIME_DISABLED;
        isDisabled = false;
    }
    
    public void act() 
    {
        if (isDisabled) {
            timeUntilEnabled = timeUntilEnabled - 1.0 / 60;
            /* time step duration*/
            if (timeUntilEnabled < 0.0) {
                isDisabled = false;
            }
        }
    }    
    
    public boolean isPortalDisabled()
    {
        return isDisabled;
    }
    
    public void disable()
    {
        timeUntilEnabled = TIME_DISABLED;
        isDisabled = true;
    }
}
