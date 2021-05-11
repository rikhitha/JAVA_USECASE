package org.thread.java.MultiThreadFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public abstract class BaseManager 
{
	protected List<TextFile> getFiles(String location)
	{
		File[] files=new File(location).listFiles();
		List<TextFile> txtFiles =new ArrayList<>();
		int count=0;
		for(File file:files)
		{
			txtFiles.add(new TextFile(++count,file.getName(),location,new java.util.Date()));
		}
		 return txtFiles;
	
	}
	
	protected List<List<TextFile>> getPages(List<TextFile> files,int count){
		return ListUtils.partition(files, count);
	}

}
