package Rooms;

import People.Person;


public class Infirmary extends Room {
    Person occupant;
    int xLoc,yLoc;

    public Infirmary(int x, int y)
    {
        super(x,y); //inherintig x,y from room class//
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You enter a boat.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        //add health


    }

    @Override
    public String toString() {
        return "Infirmary";
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

}