import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor implements ScoreObserver
{
    
    private Label scoreLabel;
    
    Score(int score)
    {
        scoreLabel = new Label("Score: 0");
        GameScreen.getInstance().addObject(scoreLabel, 700, 60);
        
    }
    
    
    public void updateScore(int score)
    {
        scoreLabel.setText("Score: " + score);
        
    }
    
}