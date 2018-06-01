import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    private final static int SIZESQUARE = 50;
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Ground () {
        this.getImage().scale(SIZESQUARE,SIZESQUARE);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
