/*
 * A traffic light faces the direction of the road it is a light to. Therefore,
 * in front of the light (direction 0) is a car if there is any line at all.
 */

package gridworldtraffic;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;
import java.awt.Color;
import java.util.LinkedList;

/**
 *
 * @author vivek bhagwat and alan joyce and kevin lo
 */
public class TrafficLight extends Actor implements Comparable
{
    private int count;
    private final int RED_STEP = 5, YELLOW_STEP = 2, GREEN_STEP = 5;
    private int numCars;
    
    public TrafficLight()
    {
        super();
        setColor(nextColor());
        numCars = 0;
    }
    
    public TrafficLight(Grid grid, Location loc)
    {
        this();
        putSelfInGrid(grid, loc);
    }
    
    public boolean isRed()
    {
        return getColor().equals(Color.RED);
    }
    public boolean isYellow()
    {
        return getColor().equals(Color.YELLOW);
    }
    public boolean isGreen()
    {
        return getColor().equals(Color.GREEN);
    }
    
    public Color nextColor()
    {
        Color col = getColor();
        Color red = Color.RED;
        Color yellow = Color.YELLOW;
        Color green = Color.GREEN;
        if(col.equals(red))
            col = green;
        else if (col.equals(yellow))
            col = red;
        else if (col.equals(green))
            col = yellow;
        return col;
    }
    
    public void changeColor()
    {
        setColor(nextColor());
        count = 0;
    }
    
    public void act()
    {
        /*
        if(getColor().equals(Color.RED))
        {
            if(count <= RED_STEP)
            {
                count++;
                return;
            }
        }
        if(getColor().equals(Color.YELLOW))
        {
            if(count <= YELLOW_STEP)
            {
                count++;
                return;
            }
        }
        if(getColor().equals(Color.GREEN))
        {
            if(count <= GREEN_STEP)
            {
                count++;
                return;
            }
        }
        setColor(nextColor());
        count = 0;
        */
        if(isGreen())
        {
            count--;
        }
        else
        {
            count++;
        }
    }
    
    public LinkedList<Vehicle> getLine()
    {
        Vehicle first;
        LinkedList<Vehicle> list = new LinkedList<Vehicle>();
        try
        {
            first = (Vehicle) (getGrid().get(getLocation().getAdjacentLocation(0)));

        } catch (ClassCastException classCastException) 
        {
            System.out.println("No vehicle in line");
            return null;
        }
        
        Vehicle current = first;
        list.add(current);
        while(current.getInBack() instanceof Vehicle) //while in back is vehicle
        {
            list.add((Vehicle)current.getInBack());
            current = (Vehicle)current.getInBack();
        }
        numCars = list.size();
        return list;
    }
    
    public int getNumCars()
    {
        return numCars;
    }
    
    public int getPoints()
    {
        return numCars + count;
    }

    public int compareTo(Object o)
    {
        if(o instanceof TrafficLight)
        {
            return (int)Math.signum(getPoints() - ((TrafficLight)o).getPoints());
        }
        throw new IllegalArgumentException("Parameter not a TrafficLight.");
    }
}
