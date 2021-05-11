package file.handling.java.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SuperKing extends FileReaderab {

	@Override
	public void fileread(File file) 
	{

		
		//Store validated Records in ArrayList
		
		ArrayList<String> skerror = new ArrayList<>();
		ArrayList<String> skvalid = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            String[] arr = new String[25];
            int i=0;
            
            
    		
            while ((line = br.readLine()) != null) 
            {
            	arr[i]=line;
            	i++;
               
            }
            
            
            for(i=0;i<arr.length;i++)
            {
            	 
            	String[] aline;
            	try
            	{
               	aline=arr[i].split("|");
               	
               	if(aline.length<4)
               	{
               		
            		
               		
               		skerror.add(arr[i]);
               		
               		
               		
              FileWriter writer = new FileWriter("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\filehandling\\SuperKing_error.csv");	
               		
             
              
              for (String s:skerror)
      		{
      			
      			String[] split2 = s.split(",");
      			writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(",")));
                writer.write("\n");
                
      		}
              
              writer.close();
              
               		
               		
               	}
               	else
               	{
               		
               		
               		
               		skvalid.add(arr[i]);
               		
               		
               		
                    FileWriter writer = new FileWriter("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\filehandling\\SuperKing_valid.csv");	
                     		
                   
                    
                    for (String s:skvalid)
            		{
            			
            			String[] split2 = s.split(",");
            			writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(",")));
                      writer.write("\n");
                      
            		}
                    
                    writer.close();
               		
              		
             	}
            	}
            	catch(NullPointerException e)
            	{
            		
            	}
            	
               	
                 
            	 
            }
            
            
           
            
        } catch (IOException e) 
		{
            e.printStackTrace();
        }
		
		
	}

	

}
