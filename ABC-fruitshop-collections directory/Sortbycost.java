package fruitshop.collections.java.com;

import java.util.Comparator;

public class Sortbycost implements Comparator<Fruits>
{
    
    public int compare(Fruits a, Fruits b)
    {
        return b.fruitcost - a.fruitcost;
    }
}
     