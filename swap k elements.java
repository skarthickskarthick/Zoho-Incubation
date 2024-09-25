public class swaparray {
	public static void main(String args[])
	{
		int arr[]= {10,12,13,15,9,5,44,33};
                int k=3;
		int l=(arr.length/k);
		for(int i=0;i<l*k;i++)
		{
			arr=swap(arr,i,i+2);
			i=i+2;
		}
		if(arr.length>l*k) {
			swap(arr,l*k,arr.length-1);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static int[] swap(int[] arr,int start,int stop)
	{
		while(start<stop)
		{
			int temp=arr[start];
			arr[start]=arr[stop];
			arr[stop]=temp;
			start++;
			stop--;
		}
		return arr;
	}

}
