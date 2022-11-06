import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private PlayButton playButton;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        prepare();
    }
    
    private void prepare()
    { 
        playButton = new PlayButton();
        addObject(playButton,830,450);
        
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(playButton)) {
        Greenfoot.setWorld(GameScreen.getNewInstance());
    }
    }
}
