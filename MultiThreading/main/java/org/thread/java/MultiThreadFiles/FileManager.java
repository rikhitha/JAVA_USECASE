package org.thread.java.MultiThreadFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;



import java.util.Set;
import java.util.TreeMap;

public class FileManager extends BaseManager 
{
	public final String filefolder="C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\ThreadFiles\\";
	static Logger log = Logger.getLogger(FileManager.class.getName());
	
	
	
	public final int fileperthread=2;
	
	public void doRun() throws IOException
	{
		List<TextFile> lstFiles=this.getFiles(filefolder);
		
		
		List<List<TextFile>> lstPages=this.getPages(lstFiles, fileperthread);
		
		lstPages.forEach(System.out::println);
		
		for(int i=0;i<lstPages.size();i++)
		{
			ThreadFile fThread=new ThreadFile(lstPages.get(i));
			Thread thread=new Thread(fThread);
			
		thread.setName("File Reader+" +i);
		thread.start();
		
			try {
				thread.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		
		
		}
		writeoutput(FileValidation.getInstance().getoutput());
		log.info("written");
		
		
	}
	private void writeoutput(TreeMap<GetLines,Integer> tMap) throws IOException
	{
		BufferedWriter out;
		out=new BufferedWriter(new FileWriter(filefolder.concat("outputfile.csv")));
		Set set = tMap.entrySet();
		Iterator it=set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me= (Entry) it.next();	
			GetLines gl= (GetLines) me.getKey();
			out.write(gl.getId()+","+gl.getPrefnum()+","+gl.getLipid()+","+gl.getLcd()+"\n");
			
			}
		out.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		new FileManager().doRun();
		
		
		
	}

}
