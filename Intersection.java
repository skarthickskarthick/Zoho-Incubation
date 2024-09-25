class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0,in=0;
      int arr[]=new int[nums2.length];
      while(i<nums1.length&&j<nums2.length)
      {
        if(nums1[i]==nums2[j]){
        arr[in++]=nums1[i];
        while(i!=nums1.length&&j!=nums2.length&&nums1[i]==nums2[j]&&nums1[i]==arr[in-1]){
        i++;
        j++;}
        }
        else if(nums1[i]<nums2[j])
        i++;
        else
        j++;
      }
      return Arrays.copyOf(arr,in);
      
      }
}
