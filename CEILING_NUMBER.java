
public class CEILING_NUMBER 
{
//Ceiling number :   smallest element in array which is grater or equal to target element  
	public static void main(String[] args) 
	{
		int arr[]= {2,5,9,13,17,24,36,49,58};
		int target=13;
		int Ceiling = findCiling(arr,target);
		System.out.println(Ceiling);
	}

	static int findCiling(int[] arr, int target) 
	{
		int start=0;
		int end=arr.length-1;
		
		boolean isAsce = arr[start] < arr[end]; 
		
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid] == target)
			{
				return arr[mid];
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
		return arr[start];
	}

}
