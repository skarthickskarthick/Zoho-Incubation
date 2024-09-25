class Solution {
    public int mySqrt(int x) {
        if(x==0)
        return 0;
          if(x==1)
        return 1;

    long start=1,stop=x/2,ans=0;//search b/w 1 to x/2 only its enough
    while(start<=stop)
    {
        long mid=start+((stop-start)/2);
        if(mid*mid==x)   // perfect squares
        return (int)mid;
        if(mid*mid<x)
        {
            ans=mid;
            start=mid+1;
        }
        else
        stop=mid-1;
    }
    return (int)ans;



    }
}

