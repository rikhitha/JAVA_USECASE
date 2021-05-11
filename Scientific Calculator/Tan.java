package calculator.usecase.java.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tan 
{
	static Logger log = Logger.getLogger(Tan.class.getName());
	
	public void tan(double num1)
	{
		double number1=num1;
		
        double result=Math.tan(number1);
 		
		log.log(Level.INFO, " {0}",result);
		
		
	}

}
