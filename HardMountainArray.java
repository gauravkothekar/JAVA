import java.lang.annotation.Target;

public class HardMountainArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,3,1};
		int traget=3;
		int element=search4(arr,traget);
		System.out.println(element);
	}
	static int search4(int arr[],int traget)
	{
		int peak=search2(arr,traget);
		int firstBunch=search3(arr,traget,0,peak);
		if(firstBunch!=-1)
		{
			return firstBunch;
		}
		return search3(arr, traget, peak+1, arr.length-1);
	}
	static int search3(int[] arr, int  target, int start, int end) 
	{
		boolean isAsce = arr[start] < arr[end];
		
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			if(isAsce)
			{
					if(target<arr[mid])
					{
						end=mid-1;
					}
					else
					{
						start=mid+1;
					}
			}
			else
			{
					if(target>arr[mid])
					{
						end=mid-1;
					}
					else
					{
						start=mid+1;
					}
			}
			
		}
		return -1;
	}

	static int search2(int[] arr, int traget) 
	{
		int start=0;
		int end=arr.length-1;
		while (start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else
			{
				start=mid+1;
			}	
		}
		return start;
	}

}
