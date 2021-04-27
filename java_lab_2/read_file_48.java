package lab.java.two.com;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class read_file_48 {

	public static void main(String[] args) throws Exception
	{
		Path inFile = Paths.get("C:/Users/HP/Desktop/SRMWORK/day_5.txt");
        if (!Files.exists(inFile, LinkOption.NOFOLLOW_LINKS))
        {
            throw new FileNotFoundException(inFile.toString());
        }
        Scanner scanner =  new Scanner(inFile, "UTF-8");

        // Open output file for writing
        
        PrintWriter writer1 = new PrintWriter("C:/Users/HP/Desktop/SRMWORK/valid.txt", "UTF-8");
        PrintWriter writer2 = new PrintWriter("C:/Users/HP/Desktop/SRMWORK/error_records.txt", "UTF-8");

        
        ArrayList<String> list = new ArrayList<String>();
        
        while (scanner.hasNextLine())
        {
            list.add(scanner.next());
        }
        scanner.close();
        List<String> validate=list.stream().filter(v->v.length()>3).collect(Collectors.toList());
		System.out.println(validate);
		List<String> errorrecord=list.stream().filter(p->p.length()<=3).collect(Collectors.toList());
		System.out.println(errorrecord);
		writer1.println(validate);
		writer2.println(errorrecord);
		writer1.close();
		writer2.close();
	}

}
