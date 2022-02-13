import java.util.Arrays;

public class cyclic_example1 
{

	public static void main(String[] args) 
	{
		int[] nums = {8,0,6,2,3,1,5,4};
		int num=sort(nums);
		System.out.println(num);
	}

	private static int sort(int[] nums)
	{
		int i=0;
		while(i <nums.length)
		{
			int correct_index = nums[i];
			if(nums[i] < nums.length && nums[i] != nums[correct_index])
			{
				int temp = nums[correct_index];
				nums[correct_index]=nums[i];
				nums[i]=temp;	
			}
			else 
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
		for(int index=0;index<nums.length;index++)
		{
			if(nums[index] != index)
			{
				return index; 
			}
		}
		return nums.length;
	}
	
}
