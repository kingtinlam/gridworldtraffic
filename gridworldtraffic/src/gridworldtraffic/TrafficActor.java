/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// From This macbook at 2:15
// Viiiiiiiivek I changed it!

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
public abstract class TrafficActor extends Actor 
{
    private Grid<TrafficActor> grid;
    private Location location;
    private int direction;
    private Color color;
    private int speed; //squares per step

    public int getSpeed() 
    {
        return speed;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }    
    
}
