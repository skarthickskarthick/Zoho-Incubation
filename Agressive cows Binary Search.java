class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start=1,stop=position[position.length-1]-position[0];
        while(start<=stop)
        {
            int mid=start+(stop-start)/2; //mid is the distance
            int cows=countcows(position,mid);
            if(cows>=m)
            start=mid+1;
            else
            stop=mid-1;
        }
        return stop;
    }
    static int countcows(int[] position,int mid)
    {
        int cows=1,last=position[0];
        for(int i=0;i<position.length;i++)
        {
            if(position[i]-last>=mid)
            {
              cows++;
              last=position[i];
            }
        }
        return cows;
    }
}