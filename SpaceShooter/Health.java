import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor implements HealthObserver
{
    
    private Label healthLabel;
    
    Health(int health)
    {
        healthLabel = new Label("health: 100");
        GameScreen.getInstance().addObject(healthLabel, 900, 60);
    }
    
    
    public void updateHealth(int health)
    {
        
        healthLabel.setText("Health: " + health);
    }
}