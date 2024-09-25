public class pattern11 {
public static void main(String args[])
{
	int n=4,startvalue=1;
	for(int i=1;i<=n;i++)
		
	{
		int value=startvalue;
		for(int j=1;j<=nn;j++)
		{
			System.out.print(value+" ");
			if((i+j)>n)
			{
				int diff=(i+j)-n;
				value+=(n-diff)+1;
			}
			else
				value+=i+j;
		}
		startvalue+=i;
		System.out.println();
	}
}
}

output
1 3 6 10 
2 5 9 13 
4 8 12 15 
7 11 14 16 

