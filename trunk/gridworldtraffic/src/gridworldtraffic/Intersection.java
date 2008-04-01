/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gridworldtraffic;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;
import java.util.PriorityQueue;

/**
 *
 * @author vivek bhagwat and alan joyce and kevin lo
 */
public class Intersection 
{
    private PriorityQueue lights;
    
    public Intersection(TrafficLight n, TrafficLight e, TrafficLight w, TrafficLight s)
    {
        lights.add(n);
        lights.add(e);
        lights.add(w);
        lights.add(s);
    }
}
