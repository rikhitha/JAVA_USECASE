package fruitshop.collections.java.com;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;




public class SearchFruits 

{
	
	public void search(List<Fruits> fruits)
	{
		
		
    	
		System.out.println(fruits);
        List<Fruits> result4 = fruits.stream()
                .filter(x -> x.getfruitname().equals("mango"))
                
                
                
                .collect(Collectors.toList());
        
        result4.forEach(p -> System.out.println("Fruitname::"+p.getfruitname()+"\n "+"Fruit Type::"+p.getfruittype()+"\n "+"Fruit Color::"+p.getfruitcolor()+"\n "+"Fuit Cost::"+p.getfruitcost()));
    	
    
    	
	}

}
