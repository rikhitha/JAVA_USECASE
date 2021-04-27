package lab.java.one.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class sort_linkedList_25 {

	public static void main(String[] args) 
	{
		LinkedList<String> List = new LinkedList<>(); 
		List.add("java"); 
		List.add("python"); 
		List.add("c++"); 
		List.add("rsc");
		List.add("srm");
		List.add("notepad"); 
		System.out.println("before sorting: " + List);

		Collections.sort(List, new Comparator<String>() 
		{ @Override public int compare(String s1, String s2)
		{ 
			return s1.length() - s2.length();
		}
		} ); 
		System.out.println("after sorting: " +List);

		
		
	}

}
