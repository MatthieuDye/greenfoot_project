import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherActors1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OtherActors1 extends OtherActors
{
    /**
     * Act - do whatever the OtherActors1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveOA1();
        gameOver();
        removeOA1();// Add your action code here.
    }  
    
      /**
     * Move the car to the right automatically.
     */
    public void moveOA1()
    {
        setLocation(getX()-3, getY());
    }
    
    /**
     * Removes the object when it reaches the right edge.
     */
    public void removeOA1()
    {
        if ( getX() > getWorld().getWidth()-10 )
        {
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Checks if the frog has been hit by a car. If it is, remove the object.
     */
    public void hit(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        } 
    }
    
    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    public void gameOver()
    {
        if ( canSee(Turtle.class) )
        {
            hit(Turtle.class);
            //getWorld().removeObjects(getWorld().getObjects(Car2.class));
            //getWorld().removeObjects(getWorld().getObjects(Ambulance.class));
            //GreenfootImage bg = getWorld().getBackground();
            //bg.setColor(new Color(255,0,0));
            //bg.drawString("You have lost the game!", 134, 360);
            Greenfoot.stop();
        }
    }
}