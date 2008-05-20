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
import java.util.*;

/**
 *
 * @author vivek
 */
public class Multigrid
{
   private UnboundedGrid<Set<Object>> grid;  // no other instance variables 
 
 
  public void UnboundedMultigrid()  
  {  grid = new UnboundedGrid<Set<Object>>();  }
 
 
  /** @param loc a valid location in this grid  
   *  @return a set of all objects at loc; an empty set, if no objects at loc 
   *  Postcondition: the contents of this grid remain unchanged 
   */ 
  public Set<Object> get(Location loc) 
  {  return null;  } 
 
 
  /** Puts an object at a given location in this grid. 
   *  Precondition: (1) loc is valid in this grid. (2) obj is not null. 
   *  @param loc the location at which to put the object  
   *  @param ob j the new object to be added 
   */ 
  public void put(Location loc, Object obj) 
  {    } 
 
 
  /** Gets the neighboring occupants in all eight compass directions  
   *  (north, northeast, east, southeast, south, southwest, west, and northwest). 
   *  @param loc a location in this grid 
   *         Precondition: loc is valid in this grid 
   *  @return an array list of the objects in the occupied locations adjacent to loc in this grid 
   */ 
  public ArrayList<Object> getNeighbors(Location loc) 
  {  return null; }
}
