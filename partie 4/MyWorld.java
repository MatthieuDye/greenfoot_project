import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author Matthieu DYE
 * @version 13/04/2017
 */
public class MyWorld extends World
{
    public final static int SIZEMAP =  500 ;
    public final static int SIZESQUARE =  50 ;
    
    /* Constructor for objects of class MyWorld. */
    public MyWorld()
    {   
        super(SIZEMAP, SIZEMAP, 1); 
        for (int y=SIZEMAP-SIZESQUARE/2;y>SIZEMAP-5*SIZESQUARE/2;y=y-SIZESQUARE) {
           for (int x = SIZESQUARE/2; x<= SIZEMAP; x = x+50) {
                addObject(new Plain(),x,y);
            }
        }
        for (int y=SIZEMAP-5*SIZESQUARE/2;y>0.;y=y-SIZESQUARE) {
            addGroundLine(y);
        }
        addTurtle();
    }
   
    public void addGroundLine(int y){
        int ref = Greenfoot.getRandomNumber(3) + 1 ;
        Ground ground = null ;
        for (int x = SIZESQUARE/2; x<= SIZEMAP; x = x+50) {
            if (ref == 1){ addObject(new Road(),x,y);} 
            if (ref == 2){ addObject(new Plain(),x,y);}
            if (ref == 3){ addObject(new Rail(),x,y);}
        }
    }
    
     /* Add a turtle to the world. */
    public void addTurtle()
    {
        Turtle turtle = new Turtle();
        turtle.turn(270);
        addObject(turtle, SIZEMAP/2 - SIZESQUARE/2, SIZEMAP - SIZESQUARE/2);
    }

    public void act()
    {
        for (int y = SIZESQUARE/2; y<=SIZEMAP - SIZESQUARE/2;y= y+SIZESQUARE) {
            List<Road> tuiles = getObjectsAt(SIZEMAP-SIZESQUARE/2,y,Road.class);
        
            {
                addObject(new OtherActors1(),SIZEMAP-SIZESQUARE/2,y) ;
            }
        }
    }
    

}
