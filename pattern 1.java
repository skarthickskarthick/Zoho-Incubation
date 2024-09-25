public class pattern {
public static void main(String args[])
{
	int n=4,temp=1;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0) {
			int j;
			for(j=temp+n;j>temp;j--)
			{
				System.out.print(j +"  ");
			}
			temp=j+1+n;
			
		}
		else
		{
			
			for(int j=temp;j<=i*n;j++)
			{
				System.out.print(j +"  ");
			}
			temp=i*n;
		}
		System.out.println();
		
	}
}
}


output

1  2  3  4  
8  7  6  5  
9  10  11  12  
16  15  14  13  