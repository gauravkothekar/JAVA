
public class Pivot 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,5,1};
		int target=3;
		int index= search(arr,target);
		System.out.println(index);

	}
	static int search(int[] nums, int target) 
	{
		int arrPivot=Findpivot(nums);
		if(arrPivot == -1)
		{	
			return BinarySearch(nums, target,0,nums.length-1);
		}
		if(target==nums[arrPivot])
		{
			return arrPivot;
		}
		if(target>=  nums[0])
		{
			return BinarySearch(nums, target, 0, arrPivot);
		}
			return BinarySearch(nums, target, arrPivot+1, nums.length-1);
	}
	static int BinarySearch(int[] arr, int target,int start,int end) 
	{
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			} 
			else
			{
				return mid;
			}
			
		}
		return -1;
	}
	//binary search algo
	static int Findpivot(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while (start<=end)
		{
			int mid=start+(end-start)/2;		
			if((mid<end) && (arr[mid]>arr[mid+1]))
			{
				return mid;
			}
			if((mid>start) && (arr[mid]<arr[mid-1]))
			{
				return mid-1;
			}
			if(arr[mid]<=arr[start])
			{
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			}
		}	
		
		return -1;
	}
	
}
