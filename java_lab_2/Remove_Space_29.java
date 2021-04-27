package lab.java.two.com;

import java.util.Scanner;

public class Remove_Space_29 {

	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
		
		String str = sc.nextLine(); 
		String nospace = str.replaceAll("\\s", "");   
        System.out.println(nospace);  
	}

}
