import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private PlayAgainButton playAgainButton;
    private QuitButton quitButton;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(String score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        display(score);
    }
    
    public void display(String score)
    {
        
        //GreenfootImage img = new GreenfootImage(text.length()*20, 120);
        //img.setColor(Color.WHITE);
        //img.drawString(text, 2, 20);
        //this.setImage(img);
        //setImage(img);
        Greenfoot.playSound("Great_Scott_Sound_Effect.mp3");
        GreenfootImage gameOver = new GreenfootImage("GAME OVER!",50,Color.YELLOW,Color.BLACK);        
        this.getBackground().drawImage(gameOver, 450, 50);
        GreenfootImage drawedImage = new GreenfootImage("YOU\nSCORED: "+score,50,Color.YELLOW,Color.BLACK);        
        this.getBackground().drawImage(drawedImage, 650, 170);
        playAgainButton = new PlayAgainButton();
        addObject(playAgainButton,830,390);
        quitButton = new QuitButton();
        addObject(quitButton,830,470);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(playAgainButton)) 
        {
        Greenfoot.setWorld(GameScreen.getNewInstance());
        }
        
        if (Greenfoot.mouseClicked(quitButton)) 
        {
        Greenfoot.setWorld(new MyWorld());
        }
    }
}
