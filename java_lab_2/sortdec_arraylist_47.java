package lab.java.two.com;

import java.util.ArrayList;
import java.util.Collections;

public class sortdec_arraylist_47 {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		   al.add("xys");
		   al.add("dds");
		   al.add("ad");
		   al.add("a");
		   System.out.println("Before Sorting:");
		   for(String str: al){
				System.out.println(str);
			}
		   Collections.sort(al, Collections.reverseOrder());
		   System.out.println("descending order:");
		   for(String str: al){
				System.out.println(str);
			}
		
	}

}
