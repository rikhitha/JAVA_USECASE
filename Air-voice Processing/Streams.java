package airvoice.java.streams.com;


import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;



public class Streams 
{
	static Logger log = Logger.getLogger(Streams.class.getName());
	public void firstFive(List<Customer> cust)
	{
		log.info("--------------------------------------------");
		log.info("First 5 Records \n ");
    	List<Customer> result1 = cust.stream()
		 
	      .limit(5).collect(Collectors.toList());
	        
			 result1.forEach(p -> log.info("Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
			 log.info("--------------------------------------------");
	}
	public void customerTanzania(List<Customer> cust)
	{
		log.info("--------------------------------------------");
		log.info("Fetch customers from Tanzania with postpaid connection and no vas enabled \n  ");
    	
    	Predicate<Customer> country=x -> x.getCountry()== "Tanzania";
        Predicate<Customer> connectiontype=x -> x.getConnectiontype()== "postpaid";
        Predicate<Customer> vas=x->x.getVas()=="false";
        
        List<Customer> result2 = cust.stream()
                .filter(country.and(connectiontype).and(vas))
                
                
                
                .collect(Collectors.toList());
        
        result2.forEach(p -> log.info("Customer ID::"+p.getCustomerid()+" \n"+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+" \n"+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
        
        log.info("--------------------------------------------");
	}
	public void customerSouthAfrica(List<Customer> cust)
	{
		log.info("--------------------------------------------");
    	
		log.info("Fetch customers from South Africa with prepaid connection and  vas enabled \n  ");
         
    	Predicate<Customer> country1=x -> x.getCountry()== "SouthAfrica";
        Predicate<Customer> connectiontype1=x -> x.getConnectiontype()== "prepaid";
        Predicate<Customer> vas1=x->x.getVas()=="true";
        
        List<Customer> result3 = cust.stream()
                .filter(country1.and(connectiontype1).and(vas1))
                
                
                
                .collect(Collectors.toList());
        
        result3.forEach(p -> log.info ("Customer ID::"+p.getCustomerid()+" \n"+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
        
        log.info("--------------------------------------------");
	}
	public void num61(List<Customer> cust)
	
	{
		log.info("--------------------------------------------");
		log.info("fetch customer details whose num starts from 61 and  from Uganda \n  ");
    	Predicate<Customer> country2=x -> x.getCountry()== "Uganda";
        Predicate<Customer> phone=x -> x.getPhonenumber().startsWith("61");
        
        List<Customer> result4 = cust.stream()
                .filter(country2.and(phone))
                
                
                
                .collect(Collectors.toList());
        
        result4.forEach(p -> log.info("Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+"\n "+"VAS ::"+p.getVas()));
    	
    
    	log.info("--------------------------------------------");
	}
	public void customerId(List<Customer> cust)
	{
		log.info("--------------------------------------------");
		log.info(" Records based on customer id \n");
    	
    	List<Customer> result5 = cust.stream()
                .filter(x->x.getCustomerid()=="c005")
                
                
                
                .collect(Collectors.toList());
        
    	
    	
    	result5.forEach(p -> log.info(" Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+" \n"+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
    	
        
    	log.info("--------------------------------------------");
	}
	public void upperCase(List<Customer> cust)
	{
		log.info("--------------------------------------------");
		log.info(" Customer Name in Upper Case \n");
    	
    	Predicate<Customer> name=x -> x.getCustomername().startsWith("P");
    	Predicate<Customer> name1=x -> x.getCustomername().startsWith("H");
    	List<Customer> result6 = cust.stream()
    			
                .filter(name.and(name1))
                
                
                
                .collect(Collectors.toList());
        
    	
    	
    	result6.forEach(p -> log.info(" Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+" \n"+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
    	
        
    	log.info("--------------------------------------------");
	}

}
