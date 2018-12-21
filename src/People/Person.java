package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person<print> {
    String firstName;
    int xLoc, yLoc;
    public int healthlevel;
    String[] inventory = new String[3]


    public int getxLoc() {
        return xLoc;
    }
    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }
    public int getyLoc() {
        return yLoc;
    }
    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }
    public String getFirstName() {return firstName;}
    public String[] getInventory() { return inventory; }
    public int getHealthlevel() {return healthlevel;}
    public Person (String firstName, int xLoc, int yLoc, int healthlevel)
    {
        this.firstName = firstName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.healthlevel = healthlevel;
    }

    //Is this correct? It seems to work//
    @Override
    public String toString()
    {
        String print = " ";
        if (healthlevel>=10)
        {
            print += firstName + "has health of" + healthlevel;
        }
        else
        {
            print += firstName + "needs to improve health.";
            print += firstName + "has health of" + healthlevel;
        }
    }
    print += "Inventory will ++ health level."
    int ilength = inventory.length;



}