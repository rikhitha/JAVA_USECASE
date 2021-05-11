package fruit.java.generics.com;

public class Fruits {

	String fruitname;
    public String getFruitname() {
		return fruitname;
	}

	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}

	String fruittype;
    public String getFruittype() {
		return fruittype;
	}

	public void setFruittype(String fruittype) {
		this.fruittype = fruittype;
	}

	public String getFruitcolor() {
		return fruitcolor;
	}

	public void setFruitcolor(String fruitcolor) {
		this.fruitcolor = fruitcolor;
	}

	public int getFruitcost() {
		return fruitcost;
	}

	public void setFruitcost(int fruitcost) {
		this.fruitcost = fruitcost;
	}

	String fruitcolor;
	String distributorname;
    public String getDistributorname() {
		return distributorname;
	}

	public void setDistributorname(String distributorname) {
		this.distributorname = distributorname;
	}

	int fruitcost;
	    

	    public Fruits(String fruitname , String fruittype, String fruitcolor,String distributorname, int fruitcost) 
	    {
	    	this.fruitname = fruitname;
	    	this.fruittype = fruittype;
	    	this.fruitcolor = fruitcolor;
	    	this.fruitcost = fruitcost;
	    	this.distributorname=distributorname;
	}
		
	    @Override
	    public String toString() {
	        return "fruitname=" + fruitname + ", fruittype=" + fruittype + ", fruitcolor=" + fruitcolor + ", fruitcost" + fruitcost +" distributorname="+distributorname ;
	    }

	}
     