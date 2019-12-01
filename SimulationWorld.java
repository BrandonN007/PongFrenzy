import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.*;
/**
 * Write a description of class SimulationWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimulationWorld extends World
{
    protected Greenfoot music;
    
    /**
     * Constructor for objects of class SimulationWorld.
     * 
     */
    public SimulationWorld(String musicFile, int windowWidth, int windowHeight, int pixels)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 625, 1);
       
        /*if (musicFile != null && musicFile.isEmpty() == false)
        {
            music = new GreenfootSound(musicFile);
        }*/
    }
    
 
   
    /*public void setMusic(GreenfootSound newMusic)
    {
        if (music != null && music.isPlaying() == true)
        {
            music.stop();
            newMusic.playLoop();
        }
    }*/
    
    public void transitionToWorld(SimulationWorld newWorld)
    {
        //stopped();
        
        Greenfoot.setWorld(newWorld);
        
        /*if (newWorld.getMusic() == null)
        {
            newWorld.setMusic(music);
        }*/
        
        //newWorld.started();
    }
}
