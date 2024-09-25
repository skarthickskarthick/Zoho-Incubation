soln 1:2nd largest
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


                (or)


soln 2: 1796. Second Largest Digit in a String


class Solution {
    public int secondHighest(String s) {
        int in=0;
        int[] nums=new int[s.length()];
        int smax=-1,max=-1;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            nums[in++]=s.charAt(i)-'0';
        }
        for(int i=0;i<in;i++)
        {
            if(nums[i]==max||nums[i]==smax)
            continue;
            if(nums[i]>max)
            {
                smax=max;
                max=nums[i];
            }
            else if(nums[i]>smax)
            smax=nums[i];
            
            
        }
       
        return smax;
    }
}
