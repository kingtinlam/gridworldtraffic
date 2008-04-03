/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gridworldtraffic;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author vivek bhagwat and alan joyce and kevin lo
 */
public class Intersection extends Actor
{
    private PriorityQueue<TrafficLight> lights;
    private PriorityQueue<TrafficLight> lightsCopy;
    
    public Intersection(TrafficLight n, TrafficLight e, TrafficLight w, TrafficLight s)
    {
        lights.add(n);
        lights.add(e);
        lights.add(w);
        lights.add(s);
    }
    
    public void act()
    {
        Iterator<TrafficLight> i = lights.iterator();
        while(i.hasNext())
        {
            i.next().act();
        }
        
        //Refreshes the ordering of the queue.
        lightsCopy.addAll(lights);
        lights.clear();
        lights.addAll(lightsCopy);
        lightsCopy.clear();
        
        if(!lights.peek().isGreen())
        {
            lights.peek().changeColor();
        }
    }
    
    //@param loc is the location of the vehicle
    public Color getLightColor(Location loc)
    {
        return null;
    }
}
