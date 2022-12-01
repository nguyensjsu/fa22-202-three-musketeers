/**
 * Write a description of class ScoreSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ScoreSubject  
{
    void notifyObservers();
   void attach(ScoreObserver score);
}
