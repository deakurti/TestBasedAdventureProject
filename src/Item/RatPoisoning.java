package Item;

import Item.Items;
import People.Person;

public class RatPoisoning implements Items
{
    public void addtoInventory(Person person)
    {
        for(int i = 0; i < person.getInventory().length; i++)
        {
            if(Person.getInventory()[i] == null)
            {
                Person.getInventory()[i] = "Rat Poisoning";
            }
        }

    }
}