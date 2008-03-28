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
public class TrafficLight extends Actor
{
    private int count;
    private final int RED_STEP = 5, YELLOW_STEP = 2, GREEN_STEP = 5;
    
    public TrafficLight()
    {
        super();
        setColor(nextColor());
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
    
    public void act()
    {
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
    }
}
