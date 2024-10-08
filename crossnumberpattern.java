package pattern;

public class crossnumberpattern {
    public static void main(String args[])
    {
        int n=5,temp=1,inc=2;
        for(int i=0;i<n;i++)
        {
            temp=temp+i;
            System.out.print(temp+" ");

            if(i==n-1)
                inc=i+1;
            else
                inc=i+2;
            int before=temp,flag=0,flag1=0;
            for(int j=1;j<n;j++)
            {
               if(inc<=n&&flag1!=1) {
                   System.out.print(before + inc+ " ");
                   before+=inc++;
                   if(inc-1==n&&i!=n-1&&flag==0)
                   {
                       inc=n;
                       flag=1;
                       flag1=1;
                   }
                   if(inc-1==n&&i==n-1)
                   {
                       inc=n-1;
                       flag1=1;
                   }

               }
               else {


                   System.out.print(before +inc + " ");
                   before+=inc--;

               }
            }
            System.out.println();
        }
    }
}
