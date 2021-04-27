package lab.java.two.com;

import java.util.Scanner;

public class upper_lowercase_31 {

	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
		
		String s = sc.nextLine(); 
		
		for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch>64&&ch<91)
            {
                ch=ch+32;
                System.out.print( (char) ch);
            }
            else if(ch>96&&ch<123)
            {
                ch=ch-32;
                System.out.print( (char) ch);
            }
            if(ch==32)
            System.out.print(" ");
        }
	}
}
