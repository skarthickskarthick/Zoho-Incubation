package practise;

public class largest {
	public static void main(String args[])
	{
		int arr[]= {10,13,9,6,12,89};
		int max=arr[0],res=0;
		for(int i =1;i<arr.length;i++)
		{
	
			if(arr[i]>max)
			{
				res=max;
				max=arr[i];
				
			}
			else if(arr[i]>res&&res!=max)
			{
				res=arr[i];
			}
			 
		}
		System.out.println(res);
	}

}
