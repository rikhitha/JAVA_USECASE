package lab.java.two.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist_arraylist_42 {

	public static void main(String[] args)
	{
		 LinkedList<String> l = new LinkedList<String>();
		    l.add("hj");
		    l.add("ack");
		    l.add("im");
		    l.add("ick");
		    l.add("ock");

		    List<String> list = new ArrayList<String>(l);

		    for (String str : list){
		      System.out.println(str);
		    }
	}

}
