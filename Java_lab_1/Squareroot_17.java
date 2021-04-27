package lab.java.one.com;

import java.util.Scanner;

public class Squareroot_17 {

	public static void main(String[] args) 
	{
		System.out.print("number: ");  
		
		Scanner sc = new Scanner(System.in);  
		 
		int n = sc.nextInt();  
		  
		System.out.println(" square root  "+squareRoot(n));  
		}  
		  
		public static double squareRoot(int num)   
		{  
		
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  

	}

}
