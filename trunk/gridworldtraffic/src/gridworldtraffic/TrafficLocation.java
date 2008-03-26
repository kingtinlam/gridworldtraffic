/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gridworldtraffic;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;
/**
 *
 * @author vivek bhagwat and alan joyce and kevin lo
 */
public class TrafficLocation extends Location implements Comparable
{
    private int row;
    private int col;
    private int speedLimit;
    
    public TrafficLocation(int r, int c, int speed)
    {
        super(r, c);
        setSpeedLimit(speed);
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
