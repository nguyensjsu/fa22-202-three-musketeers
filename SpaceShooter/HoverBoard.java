import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoverBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoverBoard extends Actor
{
    /**
     * Act - do whatever the HoverBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int d;
    int h;
    int a;
    private boolean isRemoved;
    private Player player;
    public HoverBoard(int d,int h,int a, Player p)
    {
        this.d = d;
        this.h = h;
        this.a = a;
        player = p;
        
    }
    public void act()
    {
        // Add your action code here.
        move(d,h,a);
        shotTarget();
    }
    public HoverBoard()
    {
        isRemoved  = false;     
    }
    
    public void shotTarget()
    {
        if(!isRemoved)
        {
            Actor actor = getOneObjectAtOffset(0,0,Biff.class);
            if(actor != null)
            {
                GameScreen game=GameScreen.getInstance();
                game.removeObject(actor);
                game.removeObject(this);
                isRemoved = true;
                
                player.addGameScore(25);
                
             
            }
        }
    }
    
    public void move(int d,int h,int a)
    {
        if(!isRemoved)
        {
            turn(a);
            move(h);
            turn(-a);
            move(d);
            int x = getX();
            if(x>1000-3)
            {
                World world;
                world = getWorld();
                world.removeObject(this);
                isRemoved = true;
            }
        }
    }
    
    
}
