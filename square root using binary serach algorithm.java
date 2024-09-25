#include<stdio.h>
int arr[10];
void sort(int ,int);
void merge(int,int,int);
main()
{
	int i,n;
	printf("enter the number of elements\n");
	scanf("%d",&n);
	printf("enter the elemnts\n");
	for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
	sort(0,n-1);
	printf("sorted array\n");
	for(i=0;i<n;i++)
	printf("%d\n",arr[i]);	
}
void sort(int start,int end)
{
	if(start<end)
	{
		int mid=start+(end-start)/2;
		sort(start,mid);
		sort(mid+1,end);
		merge(start,mid,end);
		
	}
}
void merge(int start,int mid,int end)
{
	int temp[end-start+1],i=start,j=mid+1,k=start;
	while((i<=mid)&&(j<=end))
	{
		if(arr[i]<arr[j])
		temp[k++]=arr[i+1];
		else{
		temp[k++]=arr[j++];

                global+=mid-i+1;   // global inversion calculation, this is the only change with the merge sort

             }
	}
	while(i<=mid)
	temp[k++]=arr[i++];
	while(j<=end)
	temp[k++]=arr[j++];
	for(i=start;i<=end;i++)
	arr[i]=temp[i];
}
