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
    
    private Label scoreLabel;
    private Player player;
    
    private GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        
        for(int i = 0; i < 3; i++)
        {
            Health health = new Health();
            addObject(health,950-(50*i),60);
        }
        
        scoreLabel = new Label("Score: 0");
        addObject(scoreLabel, 700, 60);
        
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
    
        player = new Player();
        game.addObject(player,79,304);
    }
    
    public void act()
    {
        scoreLabel.setText("Score: " + player.getGameScore());
    }
    
    
    
}
