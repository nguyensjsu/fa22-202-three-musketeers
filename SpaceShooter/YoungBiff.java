import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YoungBiff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YoungBiff extends  Biff implements IBiff
{
    Player player;
    
    YoungBiff(Player p)
    {
        player = p;
    }
    
    /**
     * Act - do whatever the YoungBiff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move();
        
    }
    
    public void move()
    {
        move(-3);
        int x=getX();
        if(x<10)
            {
                GameScreen game=GameScreen.getInstance();
                game.removeObject(this);
                player.addHealth(-25);
                
            }
    
    }
}
