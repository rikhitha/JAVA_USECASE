package file.handling.java.com;

import java.io.File;
import java.util.logging.Logger;




public class FileHandling extends Parentclass
{

	static Logger log = Logger.getLogger(FileHandling.class.getName());
	public static void main(String[] args) 
	{
		
			
		
		
		
		RoyalTyres rtobj=new RoyalTyres();
		LoadStar lsobj=new LoadStar();
		SuperKing skobj=new SuperKing();
		
		String name1="LoadStar.txt";
		String name2="RoyalTyres.txt";
		String name3="SuperKing.txt";
		
		File[] file = new File("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files").listFiles();
		 
		for(File filename:file)
		{
			if (filename.getName().contains(name1))
			{
				lsobj.fileread(filename);
			}
			else if(filename.getName().contains(name2))
			{
				rtobj.fileread(filename);
			}
			else if(filename.getName().contains(name3))
			{
				skobj.fileread(filename);
			}
			else
			{
				log.info("Comapany Not Registered");
			}

			
		}
        		
		

	}

}
