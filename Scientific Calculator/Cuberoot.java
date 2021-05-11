package calculator.usecase.java.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cuberoot 
{
	static Logger log = Logger.getLogger(Cuberoot.class.getName());
	
	public void cuberoot(double num1)
	{
		double number1=num1;
		
        double result=Math.cbrt(number1);
		
		log.log(Level.INFO, " {0}",result);
		
		 
	}

}
