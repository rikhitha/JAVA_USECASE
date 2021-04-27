package lab.java.two.com;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist_string_43 
{
	public static String[] GetStringArray(ArrayList<String> arr)
    {
  
        
        String str[] = new String[arr.size()];
  
        // ArrayList to Array Conversion
        for (int j = 0; j < arr.size(); j++) {
  
            // Assign each value to String array
            str[j] = arr.get(j);
        }
  
        return str;
    }

	public static void main(String[] args)
	{
		ArrayList<String>
        a1 = new ArrayList<String>();

    a1.add("java");
    a1.add("just");
    a1.add("swift");

    // print ArrayList
    System.out.println("ArrayList: " + a1);

    // Get String Array
    String[] str = GetStringArray(a1);

    // Print Array elements
    System.out.print("String Array: "
                     + Arrays.toString(str));
	}

}
