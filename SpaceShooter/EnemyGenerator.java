import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyGenerator
{
    public static Biff getInstance(int num)
    {
        if (num%2==0)
        return new YoungBiff();
        
        else 
        return new OldBiff(); 
        
    }
}
