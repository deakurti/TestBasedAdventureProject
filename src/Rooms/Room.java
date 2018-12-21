package Rooms;

import People.Person;


public class Room {
    boolean inside = false;
    Person occupant;
    int xLoc,yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public String toString()
    {
        if(inside)
        {
            return "X";
        }
        else
        {
            return "?";
        }
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You are entering Ellis Island.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x) {
        occupant = null;
        inside = false;
    }

}