import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclic_sortEx2 {

	public static void main(String[] args) {
		int[] nums = {8,0,6,2,3,1,5,4};
		List<Integer> arr=sort(nums);
		System.out.println(arr);

	}
	private static List<Integer> sort(int[] nums)
	{
		List<Integer> arr=new ArrayList<Integer>();
		
		int i=0;
		while(i <nums.length)
		{
			int correct_index = nums[i]-1;
			if( nums[i] != nums[correct_index])
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
		for(int index=0; index<nums.length;index++)
		{
			if(nums[index] != index+1)
			{
				arr.add(index+1); 
			}
		}
		return arr;
	}
}
