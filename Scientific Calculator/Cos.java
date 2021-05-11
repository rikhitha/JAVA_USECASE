package calculator.usecase.java.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cos 
{
	static Logger log = Logger.getLogger(Cos.class.getName());
	
	public void cos(double num1)
	{
		double number1=num1;
		
        double result=Math.cos(number1);
		
		log.log(Level.INFO, " {0}",result);
		
		
	}

}
