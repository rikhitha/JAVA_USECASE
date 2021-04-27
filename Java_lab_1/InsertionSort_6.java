package lab.java.one.com;


public class InsertionSort_6 {

	public static void main(String[] args) 
	{
		 int i,j, k,temp;  
		    int a[] = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23};   
		    System.out.println("\nprinting sorted elements...\n");  
		    for(k=1; k<10; k++)   
		    {  
		        temp = a[k];  
		        j= k-1;  
		        while(j>=0 && temp <= a[j])  
		        {  
		            a[j+1] = a[j];   
		            j = j-1;  
		        }  
		        a[j+1] = temp;  
		    }  
		    for(i=0;i<10;i++)  
		    {  
		        System.out.println(a[i]);  
		    }  

	}

}
