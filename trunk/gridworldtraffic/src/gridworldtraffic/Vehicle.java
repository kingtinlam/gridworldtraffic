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
    
    public boolean atIntersection()
    {
        Location locInFront = getLocation().getAdjacentLocation(0);
        if(getGrid().get(locInFront) instanceof TrafficLight)
        {
            return true; //to be reimplemented
        }
        return false;
    }
    
    
    
    public void act()
    {
        
    }
}
