package fruitshop.collections.java.com;

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