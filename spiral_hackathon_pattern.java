
package practise;

import java.util.*;

import java.util.Collections;
import java.util.List;

public class spiral_hackathon_pattern {
	public static void main(String args[])
	{
		int n=5,temp=1;
		for(int i=1;i<=n;i++)
		{
			int j,k;
			int temp1=temp;
			for( j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
	
			for( k=1;k<=i;k++)
			{
				System.out.print(temp+" ");
				temp=temp+j;
				
				}
		temp=temp1;
			System.out.println();
		}
	}
}
