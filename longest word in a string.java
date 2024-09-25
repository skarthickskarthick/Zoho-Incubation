import java.util.Arrays;

public class strreplace {
	public static void main(String args[])
	{
		String s="Hello How karthick balasubramanian are you ";
		int count=0,max=0,index=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&count!=0) {
				if(count>max) {
					max=count;
					index=i-count;
					
				}
				count=0;
			}
			else if(s.charAt(i)!=' ')
				count++;
		}
		String res="";
		for(int i=index;s.charAt(i)!=' ';i++)
		{
			res+=String.valueOf(s.charAt(i));
		}
		System.out.println(res);
		
		
	}

}

output:
Balasubramanian
