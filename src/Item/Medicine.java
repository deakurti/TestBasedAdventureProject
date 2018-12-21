package Item;
import People.Person;

public class Medicine implements Items
{
    public void addtoInventory (Person Person)
    {
        for(int i=0; i<Person.getInventory().length; i++)
        {
            if (Person.getInventory()[i] == null)
            {
                Person.getInventory()[i] = "Medicine";
            }
        }
    }
}

