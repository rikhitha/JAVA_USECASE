package calculator.usecase.java.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Subtraction 
{
	static Logger log = Logger.getLogger(Subtraction.class.getName());
	
	public void subtraction(double num1,double num2)
	{
		double number1=num1;
		double number2=num2;
		
        double result = number1 - number2;
        log.log(Level.INFO, " {0}",number1);
        log.log(Level.INFO, " {0}",number2);
        log.log(Level.INFO, " {0}",result);
	}

}
