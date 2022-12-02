import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor implements ScoreSubject, HealthSubject
{
    private List<ScoreObserver> scoreObservers;
    private int gameScore;
    public int getGameScore() { return gameScore; }
    
    private List<HealthObserver> healthObservers;
    private int health;
    public int getHealth() { return health; }
    
    
    
    public Player()
    {
        scoreObservers = new ArrayList<ScoreObserver>();
        gameScore = 0;
        ScoreObserver scoreObs = new Score(gameScore);
        attachScore(scoreObs);
        
        
        healthObservers = new ArrayList<HealthObserver>();
        health = 100;
        HealthObserver healthObs = new Health(health);
        
        attachHealth(healthObs);
        
        
    }
    
    public void attachHealth(HealthObserver h)
    {
        healthObservers.add(h);
    }
    
    public void notifyHealthObservers()
    {
        for(HealthObserver ho : healthObservers)
        {
            ho.updateHealth(health);
        }
        
    }
    
    public void attachScore(ScoreObserver score)
    {
        scoreObservers.add(score);
    }
    
    public void notifyScoreObservers()
    {
        for(ScoreObserver score : scoreObservers)
        {
            score.updateScore(gameScore);
        }
        
    }
    
    public void addGameScore(int gs)
    {
        gameScore += gs;
        notifyScoreObservers();
    }
    public void addHealth(int h)
    {
        health += h;
        notifyHealthObservers();
    }
    
    
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
            Greenfoot.playSound("shot.mp3");
            int x = getX() + 50; //where the object is added i.e 50 pixels hor-dist from car
            int y = getY();
            
            HoverBoard hoverBoard = new HoverBoard(8,8,0, this);
            GameScreen game=GameScreen.getInstance();
            game.addObject(hoverBoard,x,y);} 
            
        
        }
        
        
    public void addTarget()
    {  
        int num = Greenfoot.getRandomNumber(100);
        if(num>=98)
        {
             
            EnemyGenerator enemyGenerator= new EnemyGenerator();
            Biff target= EnemyGenerator.getInstance(num, this);
            int x = 400 + Greenfoot.getRandomNumber(1000-400);
            int y = 10 + Greenfoot.getRandomNumber(600-20);
            GameScreen game=GameScreen.getInstance();
            game.addObject(target,x,y);} 
            
        }
    }

