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
public class trafficRunner
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
	System.out.println("hi this is the main!");
        ActorWorld world = new ActorWorld();
        world.add(new TrafficLocation(7, 8, 5, "road"), new Vehicle());
	world.add(new Location(2, 3), new Actor());
        world.show();
    }

}
