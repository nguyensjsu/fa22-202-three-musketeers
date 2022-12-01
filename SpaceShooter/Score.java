import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    private int gameScore;
    Score(int score)
    {
        gameScore = score;
    }
    
    public void act()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(Integer.toString(gameScore), 0, 20);
    }
    public void updateScore(int score)
    {
        gameScore += score;
    }
}