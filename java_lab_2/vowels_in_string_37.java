package lab.java.two.com;

import java.util.Scanner;

public class vowels_in_string_37 {

	public static void main(String[] args)
	{
		int countvow = 0;
	      System.out.println("Enter a sentence :");
	      Scanner scob = new Scanner(System.in);
	      String sentence = scob.nextLine();

	      for (int iter=0 ; iter<sentence.length(); iter++){
	         char ch = sentence.charAt(iter);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            countvow ++;
	         }
	      }
	      System.out.println("number of vowels is "+countvow);
	}

}
