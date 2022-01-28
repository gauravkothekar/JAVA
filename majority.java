import java.util.HashMap;
import java.util.Map;

public class majority 
{
	public static Map<Integer, Integer> countnos(int nums[]) 
	{
		Map<Integer, Integer> counts=new HashMap<Integer, Integer>();
		for (int NUM : nums)
		{
			if(!counts.containsKey(NUM))
			{
				counts.put(NUM, 1);
			}
			else
			{
				counts.put(NUM, counts.get(NUM)+1);
			}
		}
		return counts;
		
	}
	public static int majorityElement(int[] nums) 
    {
		Map<Integer, Integer> counts = countnos(nums);
		
		Map.Entry<Integer, Integer> MajorityEntry = null;
		for(Map.Entry<Integer,Integer> entry : counts.entrySet())
		{
			if(MajorityEntry == null || entry.getValue() > MajorityEntry.getValue())
			{
				MajorityEntry=entry;
			}
			
		}
		return MajorityEntry.getKey();
        
    }
	public static void main(String[] args) 
	{
		int arr[]= {1,3,2,4,1,2,2,1,1,4,4,4,3,3,3,4};
		System.out.println("count " +majorityElement(arr));
			

	}

}
