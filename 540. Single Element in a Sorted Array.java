
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
        return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i==nums.length-1&&nums[i]!=nums[i-1])
            return nums[i];

            else if(nums[i]!=nums[i+1])
            return nums[i];
            
            i++;
        }
        return -1;
    }
}
