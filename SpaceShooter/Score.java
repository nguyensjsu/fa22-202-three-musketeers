import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor implements ScoreObserver
{
    public static int gameScore;
     
    Score(int score)
    {
        gameScore = score;

        
    }
    
    public void act()
    {
        
    }
    
    public void updateScore(int score)
    {
        gameScore += score;
    }
}