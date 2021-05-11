package org.thread.java.MultiThreadFiles;

import java.util.Comparator;

public class sortByprefnum implements Comparator<GetLines>
{

	@Override
	public int compare(GetLines o1, GetLines o2) 
	{
		return o1.getPrefnum().compareTo(o2.getPrefnum());
	}
	

}
