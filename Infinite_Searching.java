
public class Infinite_Searching 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,2,3,5,9,12,18,19,22,25,29,31,37,39,45};
		int target=39;
		int position=Search2(arr, target);
		System.out.println(position);

	}
	//method to iterate over Array 
	static int Search2(int[] arr,int target)
	{
		int start=0;
		int end =1;
		while(target>arr[end])
		{
			System.out.println(start+" "+end);
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
			//System.out.println(start+" "+end);
			if (end>arr.length) {
				end=arr.length;
			}
		}
		
		return BinarySearch(arr, target,start, end);
	}
	
	//Main Search logic 
	static int BinarySearch(int Arr[],int target ,int start,int end)
	{
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>Arr[mid])
			{
				start=mid+1;
			}
			else if(target<Arr[mid])
			{
				end=mid-1;
			}else 
			{
				return mid;
			}			
		}
		return -1;
	}
}

