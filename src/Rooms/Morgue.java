package Rooms;

public class Morgue extends Room {
    x.setxLoc(this.xLoc);
    x.setyLoc(this.yLoc);
    System.out.println("You died before being able to reach America. Better luck next time.");
    Runner.gameOff();
}
