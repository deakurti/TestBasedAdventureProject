package Rooms;

import People.Person;
import Game.Board;
import java.util.Scanner;



public class Infirmary extends Room
{
    Person occupant;
    int xLoc,yLoc;
    private boolean inside = false;
    private boolean dead = false;


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
        System.out.println("You entered a infirmary because you are not doing well.");
        occupant = x;
        inside = true;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        //add health

    }

    @Override
    public String toString() {
        if (inside) {
            return "[ ]";
        } else if (dead) {
            return "[Dead]";
        } else {
            return "Infirmary";
        }
    }


    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
        inside = false;
        super.leaveRoom(x);
    }

}