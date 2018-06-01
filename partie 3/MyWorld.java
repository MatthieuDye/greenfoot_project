import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Matthieu DYE
 * @version 13/04/2017
 */
public class MyWorld extends World
{

    /* Constructor for objects of class MyWorld. */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(350, 600, 1); 
        addTurtle();
    }
    
     /* Add a turtle to the world. */
    public void addTurtle()
    {
        MainActorMoving turtle = new MainActorMoving();
        turtle.turn(270);
        addObject(turtle, 175, 620);
    }

    public void act()
    {
        addLobster();
    }
    
    public void addLobster()
    {
         int randomPosY = Greenfoot.getRandomNumber(400);
        
        //Checks if the random position Y, is higher than 45 and lower than 350.
        if ( randomPosY > 45 && randomPosY < 350 )
        {
            if ( Greenfoot.getRandomNumber(400) < 8 )
            {  
                addObject(new OtherActors1(), 10, randomPosY);
            }
        }
    }
}
