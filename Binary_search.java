
public class Binary_search
{
	public static void main(String[] args) 
	{
		int Arr[]= {-18,-12,-7,-4,0,2,5,9,13,17,24,36,49,58};
		int target=0;
		int Position=BinarySearch(Arr,target);
		System.out.println(Position);
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
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
