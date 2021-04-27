package lab.java.two.com;


import java.util.HashSet;
import java.util.Iterator;

public class iterate_hashset_49 {

	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<String>();
		  
        
        h.add("Geeks");
        h.add("for");
        h.add("Geeks");
  
        
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
	     }
	}

}
