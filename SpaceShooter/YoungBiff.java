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
    private boolean isRemoved;
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
        kill();
        isRemoved=false;
    }
    
    public void move()
    {
        if(!isRemoved)
        {
        move(-3);
        int x=getX();
        if(x<10)
            {
                World world;
                world = getWorld();
                world.removeObject(this);
              
                isRemoved = true;
            }
        }
    }
    
    public void kill()
    {
        if(!isRemoved)
        {
        Actor actor = getOneObjectAtOffset(0,0,Player.class);
        if(actor != null)
            {
                if (player.getHealth()<=0)
                {GameScreen game=GameScreen.getInstance();
                game.removeObject(actor);
                game.removeObject(this);}
                
                else
                {
                player.addHealth(-25);
                GameScreen game=GameScreen.getInstance();
                game.removeObject(this);
            }
             
            }
    }
    }
}
