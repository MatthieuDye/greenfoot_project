import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainActorMoving here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainActorMoving extends MainActor
{
    /**
     * Act - do whatever the MainActorMoving wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // Add your action code here.
       moveMA();
       won();
    }    
    
    /**
     * Move the frog around the world with the arrow keys - 'up',
     * 'down', 'left' and 'right'.
     */
    public void moveMA()
    {
        //Check if the 'up' key is pressed.
        if ( Greenfoot.isKeyDown("up") == true || Greenfoot.isKeyDown("z") )
        {
            setLocation(getX(), getY()-1);
        }
        
        //Check if the 'left' key is pressed.
        if ( Greenfoot.isKeyDown("left") == true || Greenfoot.isKeyDown("q") )
        {
            setLocation(getX()-1, getY());
        }
        
        //Check if the 'right' key is pressed.
        if ( Greenfoot.isKeyDown("right") == true || Greenfoot.isKeyDown("d") )
        {
            setLocation(getX()+1, getY());
        }
    }    

    public void won()
    {
        if ( getY() < 15 )
        {
            //getWorld().removeObjects(getWorld().getObjects(Car.class));
            //getWorld().removeObjects(getWorld().getObjects(Car2.class));
            //getWorld().removeObjects(getWorld().getObjects(Ambulance.class));
            GreenfootImage bg = getWorld().getBackground();
           /* bg.setColor(Color.blue); */
            bg.drawString("You have won the game!", 135, 190);
            Greenfoot.stop();
        }
    }
}
