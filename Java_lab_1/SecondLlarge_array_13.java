package lab.java.one.com;

public class SecondLlarge_array_13 {

	public static void main(String[] args) {
		int[] array= {1,8,45,34,21};
		int a;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					a=array[i];
					array[i]=array[j];
					array[j]=a;
					
				}
				
			}
		}
		System.out.println("************************");
		System.out.println("Second largest number is:");
		System.out.println(array[array.length-2]);
		
	}

}
