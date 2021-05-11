package calculator.usecase.java.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Squareroot 
{
	static Logger log = Logger.getLogger(Squareroot.class.getName());
	
	public void squareroot(double num1)
	{
		double number1=num1;
		
		double result=Math.sqrt(number1);
		
		log.log(Level.INFO, " {0}",result);
	}

}
