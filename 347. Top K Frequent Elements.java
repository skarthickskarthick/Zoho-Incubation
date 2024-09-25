class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[][]=new int[nums.length][2];
        int in=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!search(nums[i],arr,in))
            {
                arr[in][0]=nums[i];
               arr[in++][1]=1;
            }

        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[1]));
       
        int res[]=new int[k];
        int l=arr.length-1;
        for(int i=0;i<k;i++)
        {
        res[i]=arr[l--][0];
        }
     return res;
    }
    boolean search(int target,int[][] a,int in)
    {
        for(int i=0;i<in;i++)
        {
            if(a[i][0]==target){
            a[i][1]++;
            
            return true;
            }
        }
        return false;
    }
}
