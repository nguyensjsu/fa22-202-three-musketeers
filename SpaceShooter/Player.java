import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private GameScreen game;
    public void act()
    {
        // Add your action code here.
        move();
        shot();
        addTarget();
    }
    
    
    public void move()
    {   //move and turn are internal functions
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move(5);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(-90);
            move(-5);
            turn(90);                    
        }
    }
    
    public void shot()
    {
        if("space".equals(Greenfoot.getKey()))
        {
            //Greenfoot.playSound("shot.mp3");
            int x = getX() + 50;
            int y = getY();
            
            HoverBoard hoverBoard = new HoverBoard(8,8,0);
            GameScreen game=GameScreen.getInstance();
            game.addObject(hoverBoard,x,y);} 
            //where the object is added i.e 50 pixels hor-dist from car
        
        }
        
        
    public void addTarget()
    {  
        int num = Greenfoot.getRandomNumber(100);
        if(num>=98)
        {
             
            EnemyGenerator enemyGenerator= new EnemyGenerator();
            Biff target= EnemyGenerator.getInstance(num);
            int x = 300 + Greenfoot.getRandomNumber(1000-400);
            int y = 10 + Greenfoot.getRandomNumber(600-20);
            GameScreen game=GameScreen.getInstance();
            game.addObject(target,x,y);} 
            
        }
    }

