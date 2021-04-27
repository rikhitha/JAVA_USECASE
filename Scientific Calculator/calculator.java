package calculator.usecase.java.com;

import java.io.Serializable;
import java.util.Scanner;

public class calculator  extends BaseClass
{

	public static void main(String[] args) 
	{
		
	    
		char operator;
	    Double number1, number2, result;

	    
	    Scanner input = new Scanner(System.in);

	    
	    System.out.println("Choose an operation: \n 1) + \n 2) - \n 3) *\n 4) / \n 5) SQRT \n 6) CUBE ROOT \n 7) Tan \n 8) Cos ");
	    operator = input.next().charAt(0);

	    switch (operator) {

	      
	      case '1':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      
	      case '2':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      
	      case '3':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      
	      case '4':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	        
	      case '5':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	  System.out.println("square root of "+number1+"is :"+Math.sqrt(number1));
          break;

	      case '6':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	  System.out.println("Cube root of "+number1+"is :"+Math.cbrt(number1));
	  	 break;
	      case '7':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	  System.out.println("Tan of "+number1+"is :"+Math.tan(number1));
	  	 break;
	      case '8':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	  System.out.println("cos of "+number1+"is :"+Math.cos(number1));
	  	 break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();

	}

}
