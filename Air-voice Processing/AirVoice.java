package airvoice.java.streams.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import streams.java.user.com.User;

class Customer {

    private String customerid;
    public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getConnectiontype() {
		return connectiontype;
	}
	public void setConnectiontype(String connectiontype) {
		this.connectiontype = connectiontype;
	}
	
	private String customername;
    public Customer(String customerid, String customername, String country, String phonenumber, String connectiontype,
			String vas) {
		this.customerid = customerid;
		this.customername = customername;
		this.country = country;
		this.phonenumber = phonenumber;
		this.connectiontype = connectiontype;
		this.vas = vas;
	}
	private String country;
    private String phonenumber;
    private String connectiontype;
    private String vas;
	public String getVas() {
		return vas;
	}
	public void setVas(String vas) {
		this.vas = vas;
	}
}

public class Airvoice {

	public static void main(String[] args)
	{
		ArrayList<Customer> cus = new ArrayList<Customer>();
		
        cus.add( new Customer("c001","jack","India","7871831342","prepaid","true"));
        cus.add(new Customer("c002","kirti","India","9956473425","postpaid","false"));
        cus.add(new Customer("c003","Peter","Uganda","206300924","prepaid","true"));
        cus.add( new Customer("c004","vishal","Tanzania","6256473425","prepaid","true"));
        cus.add( new Customer("c005","preethi","Austria","6956473425","postpaid","false"));
        cus.add( new Customer("c006","sam","Belarus","9156473425","prepaid","false"));
        cus.add( new Customer("c007","anjali","Finland","4956473425","postpaid","true"));
        cus.add( new Customer("c008","daisy","Uganda","256322924","prepaid","true"));
        
       while(true)
       {
    	System.out.println("enter choice \n 1)fetch first 5 records \n 2)fetch customers from Tanzania with postpaid connection and no vas enabled \n 3)fetch customers from South Africa with prepaid connection and vas enabled \n 4)fetch customer details whose num starts from 61 and  from Uganda \n 5) Records based on customer id" );
   		Scanner sc=new Scanner(System.in);
   		int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	System.out.println("First 5 Records");
        	List<Customer> result1 = cus.stream()
   		 
		      .limit(5).collect(Collectors.toList());
		        
				 result1.forEach(p -> System.out.println("Customer ID::"+p.getCustomerid()));
		      break;
        }
        
        
        
        
        
       }
		
	}

}
