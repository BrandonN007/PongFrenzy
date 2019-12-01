import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SimulationEnding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimulationEnding extends World
{
    protected GreenfootSound music;
    /**
     * Constructor for objects of class SimulationEnding.
     * 
     */
    public SimulationEnding(String musicFile, int windowWidth, int windowHeight, int pixels)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1); 
        if (musicFile != null && musicFile.isEmpty() == false)
        {
            music = new GreenfootSound(musicFile);
        }
    }
    
    public void started()
    {
        if (music != null)
        {
            music.playLoop();
        }
    }
    
    public void stopped()
    {
        if (music != null)
        {
            music.pause();
        }
    }
    
 
    public GreenfootSound getMusic()
    {
        return music;
    }
    
    public void setMusic(GreenfootSound newMusic)
    {
        if (music != null && music.isPlaying() == true)
        {
            music.stop();
            newMusic.playLoop();
        }
    }
    
    public void transitionToWorld(SimulationWorld newWorld)
    {
        stopped();
        
        Greenfoot.setWorld(newWorld);
        
        if (newWorld.getMusic() == null)
        {
            newWorld.setMusic(music);
        }
        
        newWorld.started();
    }
}
