package Rooms;
import Game.Runner;
import People.Person;


public class America extends Room
{
    public America(int i, int j) {
        super (i,j);
    }
    private boolean inside = false;
    private boolean alive = false;

    @Override
    public String toString() {
        if (inside) {
            return "[ ]";
        } else if (alive) {
            return "[Dead]";
        } else {
            return "America";
        }
    }

    //game ending conditions//

    @Override
    public void enterRoom(Person x) {
        inside = true;
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        for (int i = 0; i < x.getInventory().length; i++) {
            if(x.getInventory()[i] != null && x.getInventory()[i].equals("Done!")) {
                System.out.println("Congratulations! You got into America!!");
                Runner.gameOff();
                break;
            }
            else if(i == x.getInventory().length-1){
                System.out.println("Oh no!!");
            }
        }


    }

    @Override
    public void leaveRoom(Person x) {
        super.leaveRoom(x);
        occupant = null;
        inside = false;
    }
}
    }
}


