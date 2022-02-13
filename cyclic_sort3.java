
public class cyclic_sort3 {

	public static void main(String[] args) 
	{
		int[] nums = {8,2,6,2,3,1,5,4};
		int numbers = cycsort(nums);
		System.out.println(numbers);
	}

	private static int cycsort(int[] nums) 
	{
		int i=0;
		while(i <nums.length)
		{
			if(nums[i] != i+1)
			{
				int correct_index = nums[i]-1;
				if(nums[i] != nums[correct_index])
				{
					int temp = nums[correct_index];
					nums[correct_index]=nums[i];
					nums[i]=temp;	
				}
				else 
				{
					return nums[i];
				}
			}
			else 
			{
				i++;
			}
			
		}
		return -1;
	}

}
