package Rooms;

public class Room {

    private Chatbot chatbot;

        Person occupant;
        int xLoc,yLoc;

        public Room(int x, int y)
        {
            xLoc = x;
            yLoc = y;
        }

        /**
         * Method controls the results when a person enters this room.
         * @param x the Person entering
         */
        public void enterRoom(Person x)
        {
            System.out.println(//call greeting deending on room);
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
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
