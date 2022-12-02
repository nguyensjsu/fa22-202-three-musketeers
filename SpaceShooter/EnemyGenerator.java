import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyGenerator
{
    public static Biff getInstance(int num, Player p)
    {
        if (num%2==0)
        return new YoungBiff(p);
        
        else 
        return new OldBiff(p); 
        
    }
}
