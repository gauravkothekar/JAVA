import java.util.Arrays;

public class first_lastSorted_array 
{

	public static void main(String[] args) 
	{
	 int nums[]= {5,7,7,8,8,8,8,10};
	 int target =8;
	 int arr[]=BinarySearch(nums, target);
	 System.out.println(Arrays.toString(arr));
	}
	static int[] BinarySearch(int[] nums, int target) 
	{
		int ans[]= {-1,-1};
		int start = search1(nums,target,true);
		int ending = search1(nums, target, false);
 		ans[0]=start;
 		ans[1]=ending;
		return ans;
	}
	public static int search1(int[] nums,int target ,boolean searchjingFORfirst)
	{
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>nums[mid])
			{
				start=mid+1;
			}
			else if(target<nums[mid])
			{
				end=mid-1;
			}else 
			{
				ans=mid;
				if(searchjingFORfirst)
				{
					end=mid-1;
				} 
				else
				{
					start=mid+1;
				}
			}
			
		}
		return ans;
	}
}
