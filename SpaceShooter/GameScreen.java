import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{

    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    private static GameScreen game;
    private GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
    }
    
    public synchronized static GameScreen getNewInstance() {
        game = new GameScreen();
        game.prepare();
        return game;
    }
    
    public synchronized static GameScreen getInstance() {
        if (game == null) {
            game = new GameScreen();
            game.prepare();
            return game;
        }
        else
            return game;
    }
    
    public void prepare(){
    
        Player player = new Player();
        game.addObject(player,79,304);
    }
    
    
    
}
