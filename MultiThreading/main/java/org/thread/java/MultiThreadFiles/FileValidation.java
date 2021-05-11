package org.thread.java.MultiThreadFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class FileValidation 

{
	
	private static  FileValidation filevalidation=null;
	
	private   TreeMap<GetLines,Integer> tMap=new TreeMap<>(new sortByprefnum());
	
	private FileValidation()
	{
		
	}
	
	public static FileValidation getInstance()
	{
		if(filevalidation==null)
		{
			filevalidation=new FileValidation();
		}
		return filevalidation;
	}
	
	
	public void processmedicalreport(List<TextFile> lstFiles)
	{
          for(TextFile f:lstFiles)
          {
        	  dothework(f);
        	  
          }
	}
	
	private void dothework(TextFile tf)
	{
		System.out.println(tf.getFilename());
		File file =new File(tf.getLocation().concat(tf.getFilename()));
		BufferedReader br =null;
		
		try
		{
		br=new BufferedReader(new FileReader(file));
		String line;
		String[] contents;
		
		while((line=br.readLine())!=null)
		{
			
			contents=line.split(",");
			System.out.println(contents[0]);
			if(!contents[0].contains("id"))
					{
				GetLines gl=new GetLines(Integer.parseInt(contents[0]),contents[1],contents[2],contents[3]);
				
				tMap.put(gl,gl.getId());
					}
			
		}
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
		try {
			br.close();
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		}
		
		
		
		
	}
	
	public TreeMap<GetLines,Integer> getoutput()
	{
		return tMap;
	}

}
