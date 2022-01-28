
public class Binary_search
{
	public static void main(String[] args) 
	{
		int Arr[]= {99,86,77,65,22,11,8,5,2,0,-1,-9,-15,-22,-88};//{-18,-12,-7,-4,0,2,5,9,13,17,24,36,49,58};
		int target=-88;
		//int Position=BinarySearch(Arr,target);
		int Position = Binary_Search_2(Arr,target);
		System.out.println(Position);
	}

	
	static int Binary_Search_2(int[] arr, int target) 
	{
		int start=0;
		int end=arr.length-1;
		
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


	static int BinarySearch(int[] arr, int target) 
	{
		int start=0;
		int end=arr.length-1;
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
			
		}
		return -1;
	}
}

