import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

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
        GreenfootImage drawedImage = new GreenfootImage("YOUR SCORE: "+score,30,Color.YELLOW,Color.BLACK);        
        this.getBackground().drawImage(drawedImage, 700, 200);
    }
}
