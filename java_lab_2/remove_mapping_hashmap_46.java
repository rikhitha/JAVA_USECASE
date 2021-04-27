package lab.java.two.com;

import java.util.HashMap;

public class remove_mapping_hashmap_46 {

	public static void main(String[] args)
	{
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		  
	    
	    hash_map.put(10, "ten");
	    hash_map.put(15, "fifteen");
	    hash_map.put(20, "twenty");
	    hash_map.put(25, "twentyfive");
	    hash_map.put(30, "thirty");
	  
	    
	    System.out.println("Before: " + hash_map); 
	  
	    
	    String returned_value = (String)hash_map.remove(20);
	  
	    
	    System.out.println("returned value : "+ returned_value);
	  
	    
	    System.out.println("New map: "+ hash_map);
	}

}
