/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gridworldtraffic;


import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;
import java.awt.Color;
/**
 *
 * @author vivek bhagwat and alan joyce and kevin lo
 */
public class Vehicle extends Actor
{

    private int speed; //squares per step
    
    public Vehicle()
    {
        super();
        speed = 1;
    }
    
    public Vehicle(int speed)
    {
        this();
        this.speed = speed;
    }
    
    public Vehicle(Grid grid, Location loc, int direction, Color col)
    {
        this();
        putSelfInGrid(grid, loc);
        setDirection(direction);
        setColor(col);
    }
    
    public Vehicle(Grid grid, Location loc, int direction, Color col, int speed)
    {
        this(grid, loc, direction, col);
        this.speed = speed;
    }

    public int getSpeed() 
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public Actor getInFront()
    {
        return getGrid().get(getLocation().getAdjacentLocation(0));
    }
    
    public Actor getInBack()
    {
        return getGrid().get(getLocation().getAdjacentLocation(180));
    }
    
    //only true if location in front of it is a traffic light
    public boolean atIntersection()
    {
        Actor front = getInFront();
        if(front instanceof Intersection)
        {
            return true;            
        }
        return false;
    }
    
    //first check road
    //then check in front of you
    public int speedLimit()
    {
        int limit = 0;
        TrafficLocation loc = (TrafficLocation)(getLocation());
        limit = loc.getSpeedLimit();
        
        try
        {
            Vehicle front = (Vehicle)getInFront();
            if(front.getSpeed() < limit)
                limit = front.getSpeed();
        }
        catch(ClassCastException ex)
        {
            System.out.println("No vehicle in front, " + ex.getLocalizedMessage());
        }
        
        
        return limit;
    }
    
    private void stop()
    {
        setSpeed(0);
    }
    
    public void act()
    {
        //if at intersection, wait until light turns green
        //check speed limit, go at that speed.
        //if want to turn at intersection, do so.
        //if want to change lanes, do so.
        
    }
}
