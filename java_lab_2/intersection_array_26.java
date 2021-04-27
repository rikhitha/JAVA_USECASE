package lab.java.two.com;

public class intersection_array_26 
{

	public static void main(String[] args) 
	{
		int ar1[] = {23, 36, 96, 78, 55};
	      int ar2[] = {78, 45, 19, 73, 55};
	      
	     
	      for(int i = 0; i<ar1.length; i++ ) {
	         for(int j = 0; j<ar2.length; j++) {
	            if(ar1[i]==ar2[j]) {
	               System.out.println(ar2[j]);
	            }
	         }
	      }
	}

}
