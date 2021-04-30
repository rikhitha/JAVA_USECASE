package fruitshop.collections.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;




class Fruits{

	String fruitname;
    String fruittype;
    String fruitcolor;
    int fruitcost;
	    

	    public String getfruitname() {
	        return fruitname;
	    }
	    public void setfruitname(String fruitname) {
	        this.fruitname = fruitname;
	    }
	    public String getfruittype() {
	        return fruittype;
	    }
	    public void setfruittype(String fruittype) {
	        this.fruittype = fruittype;
	    }
	    public String getfruitcolor() {
	        return fruitcolor;
	    }
	    public void setfruitcolor(String fruitcolor) {
	        this.fruitcolor = fruitcolor;
	    }
	    public int getfruitcost() {
	        return fruitcost;
	    }
	    public void setfruitcost(int fruitcost) {
	        this.fruitcost = fruitcost;
	    }
	    
	    @Override
	    public String toString() {
	        return "fruitname=" + fruitname + ", fruittype=" + fruittype + ", fruitcolor=" + fruitcolor + ", fruitcost" + fruitcost ;
	    }
	}
class Sortbycost implements Comparator<Fruits>
{
    
    public int compare(Fruits a, Fruits b)
    {
        return b.fruitcost - a.fruitcost;
    }
}
     


public class FruitShop extends BaseModel
{
	 

	


	public static void main(String[] args) 
	{
		FruitShop fsob=new FruitShop(); 
		ArrayList l=new ArrayList();
		Fruits fruitob = new Fruits();
		System.out.println(" choose: \n 1) Add Item,Sort item \n 2) Exit ");
		
		Scanner scob=new Scanner(System.in);
		int val=scob.nextInt();
		switch(val)
		{
		case 1:System.out.println("Add Item,Sort item");
		addFruits();
		break;
		case 2:
		
		System.exit(0);
		break;
		default:System.out.println("enter valid operation");
		}
	}
		public static void searchFruits(ArrayList f)
		{
//			System.out.println("enter fruit name to search");
//			Scanner s=new Scanner(System.in);
//			String fname=s.nextLine();
//			for(int i=0;i<f.size();i++){
//
//	            System.out.println(f.get(i));
	        }
			
//		}
		
	
	public static void sortFruits(ArrayList f)
	{
		
		Collections.sort(f, new Sortbycost());
		 
        System.out.println("\nSorted by fruit cost");
        for (int i=0; i<f.size(); i++)
            System.out.println(f.get(i));
	}
	public static void addFruits()
	{
		ArrayList<Fruits> list = new ArrayList<Fruits> ();
		
		for(int j =0;j<=1;j++)
	    {

	    Scanner scnr = new Scanner(System.in);

	    String fruitname;
	    String fruittype;
	    String fruitcolor;
	    int fruitcost;
	    
	    
	    	
	   

	    
	    Fruits fruitob = new Fruits();

	    System.out.println("Enter Fruit Name:");
	    fruitob.setfruitname(scnr.nextLine());


	    System.out.println("Enter Fruit Type:");
	    fruitob.setfruittype(scnr.nextLine());

	    System.out.println("Enter Fruit Color:");
	    fruitob.setfruitcolor(scnr.nextLine());

	    System.out.println("Enter Fruit Cost:");
	    fruitob.setfruitcost(scnr.nextInt());

	    
	    list.add(fruitob);



        
	    }
	    
		for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }
	   
		sortFruits(list);
		searchFruits(list);
	    }
	}
	

