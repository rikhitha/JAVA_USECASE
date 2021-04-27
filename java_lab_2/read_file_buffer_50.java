package lab.java.two.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read_file_buffer_50 {

	public static void main(String[] args)
	{
		File file = new File("C:/Users/HP/Desktop/SRMWORK/day_5.txt");
		 
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
