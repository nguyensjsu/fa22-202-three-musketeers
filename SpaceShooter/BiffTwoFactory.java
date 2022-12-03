import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BiffTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BiffTwoFactory extends BiffCreator
{
    /**
     * Act - do whatever the BiffTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BiffTwoFactory(Player p)
    {   
        super.player=p;
    }
    public IBiff getBiff()
    {
        return new YoungBiff();    
    }
    
}
