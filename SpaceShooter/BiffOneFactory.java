import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BiffOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BiffOneFactory extends BiffCreator
{
    /**
     * Act - do whatever the BiffOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BiffOneFactory(Player p)
    {   
        super.player=p;
    }
    public IBiff getBiff()
    {
        return new OldBiff();    
    }
    
}
